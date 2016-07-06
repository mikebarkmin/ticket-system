package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.User;
import de.ddi.ticketsystem.logic.UserManager;

import java.util.Scanner;

public abstract class View {
    protected String name;
    protected String text;
    protected String[] options;
    private String[] globalOptions = {"[Z]üruck", "[B]eenden"};
    protected ViewManager viewManager;
    protected final String SEPERATOR = "-----------------";
    protected Scanner scanner;
    protected User currentUser;

    public View(ViewManager viewManager) {
        this.viewManager = viewManager;
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
    }

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

        out += "\n";

        for (String option : globalOptions) {
            out += "\n" + option;
        }

        System.out.println(out);

        System.out.println(SEPERATOR);

    }

    public abstract void evaluate(String input);

}
