package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;

import java.util.Scanner;

public abstract class View {
    protected String name;
    protected String text;
    // optionen die jeder Benutzer sieht
    protected String[] options;
    // zusätzliche Optionen für einen Angestellten
    protected String[] employeeOptions;
    // globale optionen, die immer verfügbar sind
    private String[] globalOptions = {"[Z]üruck", "[B]eenden"};
    protected ViewManager viewManager;
    protected final String SEPERATOR = "-----------------";
    protected Scanner scanner;
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
        scanner.useDelimiter("\\n");
    }

    /**
     * Zeigt die Anzeige an
     */
    public void show() {
        System.out.println(SEPERATOR);

        currentUser = viewManager.getUserManager().getCurrent();
        String out = name + " - ";
        if (currentUser != null) {
            out += currentUser.getFirstName() + " " + currentUser.getLastName();
        } else {
            out += "Nicht angemeldet";
        }

        out += "\n\n" + text;

        for (String option : options) {
            out += "\n" + option;
        }

        if (currentUser instanceof Employee) {
            for (String option : employeeOptions) {
                out += "\n" + option;
            }
        }

        out += "\n";

        for (String option : globalOptions) {
            out += "\n" + option;
        }

        System.out.println(out);

        System.out.println(SEPERATOR);

    }

    /**
     * Weißt die Anzeige an, eine Eingabe durch den Nutzer auszuwerten
     * @param input Die Eingabe des Nutzers
     */
    public abstract void evaluate(String input);

}
