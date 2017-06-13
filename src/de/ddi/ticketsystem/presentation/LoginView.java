package de.ddi.ticketsystem.presentation;

import javax.swing.*;
import java.awt.*;

/**
 * Der LoginView ist für die Darstellung und Verwaltung einer Anmeldeseite verantwortlich
 */
public class LoginView extends View {

    private JTextField firstName, lastName;

    private JButton login;

    /**
     * Erstellt eine Anzeige, die den Login eines Nutzers im System ermöglicht
     * @param viewManager ViewManager, der die Anzeige verwaltet
     */
    public LoginView(ViewManager viewManager) {
        super(viewManager);
    }

    @Override
    protected String getName() {
        return "Login";
    }

    @Override
    public JPanel getBody() {
        JPanel body = new JPanel();
        body.setLayout(new GridBagLayout());

        firstName = new JTextField(20);
        firstName.setMaximumSize(firstName.getPreferredSize());
        JLabel firstNameLabel = new JLabel("Firstname: ");

        lastName = new JTextField(20);
        lastName.setMaximumSize(lastName.getPreferredSize());
        JLabel lastNameLabel = new JLabel("Lastname: ");

        login = new JButton("Login");
        login.addActionListener(e -> {
            viewManager.getUserManager().login(firstName.getText(), lastName.getText());
            if (viewManager.getUserManager().getCurrent() != null) {
                // den nächsten View setzten
                viewManager.setNextView(new MenuView(viewManager));
            }

        });

        GridBagConstraints c = new GridBagConstraints();

        c.gridy = 0;
        c.gridx = 0;
        body.add(firstNameLabel, c);

        c.gridx = 1;
        body.add(firstName, c);

        c.gridy += 1;
        c.gridx = 0;
        body.add(lastNameLabel, c);

        c.gridx += 1;
        body.add(lastName, c);

        c.gridx = 0;
        c.gridy += 1;
        c.gridwidth = 2;
        body.add(login, c);
        return body;
    }

    @Override
    public Component getMenu() {
        return new JPanel();
    }

}
