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
     * Aktuelle View
     */
    private View currentView;
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
        scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
    }

    /**
     * Startet den ViewManager mit der Anzeige des Logins.
     */
    public void run() {
        // TODO
        // erstelle einen LoginView und verwende sie als aktuelle View

        // Endlosschleife, damit dass Programm sich nicht von alleine schließt

            // die aktuelle View anzeigen

            // auf die Eingabe des Benutzers horchen


    }

    /**
     * Zeigt den nächsten View vom viewStack an. Dabei wird der View mit vom viewStack
     * genommen, sondern bleibt an oberster Stelle liegen.
     */
    private void showView() {
        // TODO
        // Akutelle View anzeigen

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
            case "B":
                // Das System beenden
                System.exit(0);
                break;
            default:
                // Die Auswertung der Eingabe der View überlassen
                currentView.evaluate(input);
                break;
        }
    }

    /**
     * Die übergebene View als aktuelle View setzen
     * @param view View
     */
    public void setNextView(View view) {
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
