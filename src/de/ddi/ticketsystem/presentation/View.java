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

    private static final Insets WEST_INSETS = new Insets(5, 0, 5, 5);
    private static final Insets EAST_INSETS = new Insets(5, 5, 5, 0);
    protected GridBagConstraints createGbc(int x, int y) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        gbc.anchor = (x == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        gbc.fill = (x == 0) ? GridBagConstraints.BOTH
              : GridBagConstraints.HORIZONTAL;

        gbc.insets = (x == 0) ? WEST_INSETS : EAST_INSETS;
        gbc.weightx = (x == 0) ? 0.1 : 1.0;
        //gbc.weighty = 1.0;
        return gbc;
   }
}
