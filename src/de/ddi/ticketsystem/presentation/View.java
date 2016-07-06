package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.User;
import de.ddi.ticketsystem.logic.UserManager;

import java.util.Scanner;

public abstract class View {
    protected String name;
    protected String text;
    protected String[] options;
    private String[] globalOptions = {"[Z]üruck, [B]eenden"};
    protected ViewManager viewManager;
    protected final String SEPERATOR = "-----------------";
    protected Scanner scanner;

    public View(ViewManager viewManager) {
        this.viewManager = viewManager;
        this.scanner = new Scanner(System.in);
        this.scanner.useDelimiter("\\n");
    }

    public void show() {
        System.out.println(SEPERATOR);

        User current = this.viewManager.getUserManager().getCurrent();
        String out = this.name + " - ";
        if (current != null) {
            out += current.getFirstName() + " " + current.getLastName();
        } else {
            out += "Nicht angemeldet";
        }

        out += "\n\n" + this.text;

        for (String option : this.options) {
            out += "\n" + option;
        }

        for (String option : this.globalOptions) {
            out += "\n" + option;
        }

        System.out.println(out);

        System.out.println(SEPERATOR);

    }

    public abstract void evaluate(String input);

}
