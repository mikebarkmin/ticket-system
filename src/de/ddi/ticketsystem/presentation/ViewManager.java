package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.NoteManager;
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
     * NoteManager
     */
    private NoteManager noteManager;
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
     * @param userManager Ein UserManager zum Zugriff auf die Nutzer
     * @param ticketManager Ein TicketManager zum Zugriff auf die Tickets
     * @param noteManager Ein NoteManager zum Zugriff auf die Notizen
     */
    public ViewManager(UserManager userManager, TicketManager ticketManager, NoteManager noteManager) {
        this.userManager = userManager;
        this.ticketManager = ticketManager;
        this.noteManager = noteManager;
        viewStack = new Stack<>();
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
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

    private void showView() {
        // ermitteln welcher View an erster Stelle auf dem Stack liegt, ohne ihm vom Stack zunehmen.
        View current = viewStack.peek();
        // diesen View anzeigen
        current.show();
    }

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
                userManager.save();
                ticketManager.save();
                noteManager.save();
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
