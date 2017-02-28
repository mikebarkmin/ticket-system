package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.NoteManager;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;

import java.io.FileNotFoundException;
import java.io.IOException;
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

    private View current;
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
        scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
    }

    /**
     * Startet den ViewManager mit der Anzeige des Logins.
     */
    public void run() {
        load();
        // erstelle einen LoginView und füge ihn dem ViewStack hinzu
        current = new LoginView(this);
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
            case "B":
                save();
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

    private void load() {
    	// TODO
    }

    private void save() {
    	// TODO
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
