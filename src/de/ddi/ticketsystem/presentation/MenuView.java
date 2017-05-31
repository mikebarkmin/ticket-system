package de.ddi.ticketsystem.presentation;

import javax.swing.*;
import java.awt.*;

public class MenuView extends View {

    /**
     * Erstellt eine Anzeige, die das Hauptmenü des Programms anzeigt und die Auswahl zwischen Tickets und Nutzer
     * ermöglicht
     * @param viewManager ViewManager, der die Anzeige verwaltet
     */
    public MenuView(ViewManager viewManager) {
        super(viewManager);
    }

    @Override
    protected String getName() {
        return "Menu";
    }

    @Override
    public JPanel getBody() {
        JPanel body = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JButton ticketButton = new JButton("Tickets");
        ticketButton.addActionListener(e -> {
            viewManager.setNextView(new TicketsView(viewManager));
        });

        JButton userButton = new JButton("Users");
        userButton.addActionListener(e -> {
            viewManager.setNextView(new UsersView(viewManager));
        });

        c.gridy = 0;
        body.add(ticketButton, c);
        c.gridy += 1;
        body.add(userButton, c);
        return body;
    }

    @Override
    public JPanel getMenu() {
        return null;
    }
}
