package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.User;
import de.ddi.ticketsystem.logic.UserManager;

import java.util.Scanner;

public abstract class View {
    protected String name;
    protected String text;
    protected String[] options;
    protected String state;
    protected UserManager userManager;
    protected Scanner scanner;
    protected final String SEPERATOR = "-----------------";

    public View(UserManager userManager) {
        this.state = "";
        this.userManager = userManager;
        this.scanner = new Scanner(System.in);
    }

    public void show() {
        System.out.println(SEPERATOR);

        User current = this.userManager.getCurrent();
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

        System.out.println(out);

        System.out.println(SEPERATOR);

        this.evaluate(this.captureInput());
    }

    private String captureInput() {
        return this.scanner.next();
    }

    protected abstract void evaluate(String input);
    protected String getState() {
        return this.state;
    };
}
