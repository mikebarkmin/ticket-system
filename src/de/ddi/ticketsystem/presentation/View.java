package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;

import java.util.Scanner;

/**
 * Die abstrakte Klasse View bündelt viele Funktionen, die für einen View notwendig sind. Jedoch ist sie nicht dazu
 * gedacht selber erzeugt zu werden, dazu müssen Views erstellt werden die von diesem View erben. Dort muss dann auch
 * spezifiziert werden wie der spezielle View mit Benutzer eingaben umgehen soll.
 */
public abstract class View {
    /**
     * Name des Views
     */
    protected String name;
    /**
     * Beschreibender Text des Views
     */
    protected String text;
    /**
     * Allgemeine Optionen, die jeder Benutzer sehen kann
     */
    protected String[] options;
    /**
     * Spezielle Optionen, die nur Angestellte sehen können
     */
    protected String[] employeeOptions;
    /**
     * Globale Optionen, die nichts mit dem View zutun haben
     */
    private String[] globalOptions = {"[Z]üruck", "[B]eenden"};
    /**
     * Der ViewManager, der die Views verwaltet
     */
    protected ViewManager viewManager;
    /**
     * Eine Trennline, um eine einheitliche und saubere Ausgabe zu generieren
     */
    protected final String SEPERATOR = "-----------------";
    /**
     * Scanner, um die Eingabe des Benutzers abzufangen
     */
    protected Scanner scanner;
    /**
     * Der momentan angemeldete Benutzer
     */
    protected User currentUser;

    /**
     * Erzeugt eine neue Anzeige mit Scanner zum entgegennehmen von Nutzereingaben
     * @param viewManager ViewManager, der die Anzeige verwaltet
     */
    public View(ViewManager viewManager) {
        options = new String[]{};
        employeeOptions = new String[]{};
        this.viewManager = viewManager;
        scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
    }

    /**
     * Zeigt die Anzeige an
     */
    public void show() {
        // den Seperator ausgeben, um von einer früheren View abzugrenzen
        System.out.println(SEPERATOR);

        // den eingeloggten Benutzer ermitteln
        currentUser = viewManager.getUserManager().getCurrent();
        String out = name + " - ";
        if (currentUser != null) {
            out += currentUser.getFirstName() + " " + currentUser.getLastName();
        } else {
            out += "Nicht angemeldet";
        }

        out += "\n\n" + text;

        // die allgemeinen Optionen in einem String sammeln
        for (String option : options) {
            out += "\n" + option;
        }

        // überprüfen, ob der eingeloggte Benutzer eine Instanz von Employee ist
        if (currentUser instanceof Employee) {
            // die speziellen Optionen mit sammeln
            for (String option : employeeOptions) {
                out += "\n" + option;
            }
        }

        out += "\n";

        // die globalen Optionen dem String hinzufügen
        for (String option : globalOptions) {
            out += "\n" + option;
        }

        // die Optionen gebündelt ausgeben
        System.out.println(out);

        // den Sperator ausgeben, um anzuzeigen, dass der View fertig ist mit der Ausgabe
        System.out.println(SEPERATOR);

    }

    /**
     * Weißt die Anzeige an, eine Eingabe durch den Nutzer auszuwerten
     * @param input Die Eingabe des Nutzers
     */
    public abstract void evaluate(String input);

}
