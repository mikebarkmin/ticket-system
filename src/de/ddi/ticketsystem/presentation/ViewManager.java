package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import util.Stack;

import java.util.Scanner;

/**
 * Der ViewManager verwaltet die Benutzeransicht.
 */
public class ViewManager {

    /**
     * UserManager
     */
    private UserManager userManager;
    /**
     * TicketManager
     */
    private TicketManager ticketManager;
    /**
     * Historie der aufgerufenen Views
     */
    private Stack<View> viewStack;
    /**
     * Scanner, um die Eingaben des Benutzer abzufangen
     */
    private Scanner scanner;

    /**
     * Erstellt eine Instanz zur Verwaltung verschiedener Anzeigen.
     * @param userManager Ein UserManager zu
     * @param ticketManager
     */
    public ViewManager(UserManager userManager, TicketManager ticketManager) {
        this.userManager = userManager;
        this.ticketManager = ticketManager;
        viewStack = new Stack<>();
        scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
    }

    /**
     * Startet den ViewManager mit der Anzeige des Logins.
     */
    public void run() {
        // erstelle einen LoginView und füge ihn dem ViewStack hinzu
        viewStack.push(new LoginView(this));
        // Endlosschleife, damit dass Programm sich nicht von alleine schließt
        while(true) {
            // den nächsten View anzeigen
            showView();
            // auf die Eingabe des Benutzers horchen
            getInput();
        }
    }

    /**
     * Zeigt den nächsten View vom viewStack an. Dabei wird der View mit vom viewStack
     * genommen, sondern bleibt an oberster Stelle liegen.
     */
    private void showView() {
        // ermitteln welcher View an erster Stelle auf dem Stack liegt, ohne ihm vom Stack zunehmen.
        View current = viewStack.peek();
        // diesen View anzeigen
        current.show();
    }

    /**
     * Nimmt eine Eingabe vom Benutzer entgegen und werte diese aus. Dabei werden zunächst die
     * globalen Optionen getestet. Wenn die Eingabe keiner globalen Option entsprach, wird
     * die Evaluation der Eingabe an den momentanen View weitergereicht.
     */
    private void getInput() {
        // auf die Eingabe vom Benutzer horchen und in Großbuchstaben umwandeln.
        String input = scanner.next().toUpperCase();
        // entscheiden anhand der Eingabe was als nächstes passieren soll
        switch (input) {
            case "Z":
                // Den ersten View vom Stack entfernen, sodass in der Historie zurückgegangen wird.
                viewStack.pop();
                break;
            case "B":
                // Das System beenden
                System.exit(0);
                break;
            default:
                // Den momentanen View ermitteln
                View current = viewStack.peek();
                // Die Auswertung der Eingabe dem View überlassen
                current.evaluate(input);
                break;
        }
    }

    /**
     * Einen View auf den ViewStack legen, sodass dieser als nächstes angezeigt wird.
     * @param view View
     */
    public void setNextView(View view) {
        viewStack.push(view);
    }

    /**
     * Gibt den UserManager zurück
     * @return UserManager
     */
    public UserManager getUserManager() {
        return userManager;
    }

    /**
     * Gibt den TicketManager zurück
     * @return TicketManager
     */
    public TicketManager getTicketManager() {
        return ticketManager;
    }
}
