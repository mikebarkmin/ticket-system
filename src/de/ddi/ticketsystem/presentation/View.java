package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Die abstrakte Klasse View bündelt viele Funktionen, die für einen View notwendig sind. Jedoch ist sie nicht dazu
 * gedacht selber erzeugt zu werden, dazu müssen Views erstellt werden die von diesem View erben. Dort muss dann auch
 * spezifiziert werden wie der spezielle View mit Benutzer eingaben umgehen soll.
 */
public abstract class View {
    /**
     * Der ViewManager, der die Views verwaltet
     */
    protected ViewManager viewManager;
    /**
     * Der momentan angemeldete Benutzer
     */
    protected User currentUser;

    private JPanel body;
    private JPanel header;

    /**
     * Erzeugt eine neue Anzeige mit Scanner zum entgegennehmen von Nutzereingaben
     * @param viewManager ViewManager, der die Anzeige verwaltet
     */
    public View(ViewManager viewManager) {
        this.viewManager = viewManager;
        this.currentUser = viewManager.getUserManager().getCurrent();
    }

    protected abstract String getName();

    public abstract Component getBody();

    public Component getHeader() {
        JPanel header = new JPanel();
        String loginStatus = "not logged in";
        if (this.currentUser != null) {
            loginStatus = this.currentUser.getFirstName() + " " + this.currentUser.getLastName();
        }
        header.add(new JLabel(this.getName() + " - " + loginStatus));
        return header;
    }

    public Component getMenu() {
        return new JPanel();
    }

}
