package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.User;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import javax.swing.*;
import java.util.List;

public abstract class UserView extends View {

    protected User user;
    private JPanel body;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;

    public UserView(ViewManager viewManager, User user) {
        super(viewManager);
        this.user = user;
        this.body = new JPanel(new GridBagLayout());
        this.addLabels();
        this.addFields();
    }

    public UserView(ViewManager viewManager) {
        super(viewManager);
        this.body = new JPanel(new GridBagLayout());
        this.addLabels();
        this.addEditableFields();
        this.addCreateButton();
    }

    protected abstract List<Component> getAdditionalLabels();

    protected abstract List<Component> getAdditionalFields();

    protected abstract List<Component> getAdditionalEditableFields();

    private void addLabels() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridy = 0;
        JLabel firstNameLabel = new JLabel("First Name");
        this.body.add(firstNameLabel, c);

        c.gridy += 1;
        JLabel lastNameLabel = new JLabel("Last Name");
        this.body.add(lastNameLabel, c);

        c.gridy += 1;
        JLabel emailLabel = new JLabel("Email");
        this.body.add(emailLabel, c);

        List<Component> additionalLabels = this.getAdditionalLabels();
        additionalLabels.forEach(label -> {
            c.gridy += 1;
            this.body.add(label, c);
        });
    }

    private void addFields() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 1;
        c.gridy = 0;
        JLabel firstNameLabel = new JLabel(this.user.getFirstName());
        this.body.add(firstNameLabel, c);

        c.gridy += 1;
        JLabel lastNameLabel = new JLabel(this.user.getLastName());
        this.body.add(lastNameLabel, c);

        c.gridy += 1;
        JLabel emailLabel = new JLabel(this.user.getEmail());
        this.body.add(emailLabel, c);

        List<Component> additionalFields = this.getAdditionalFields();
        additionalFields.forEach(field -> {
            c.gridy += 1;
            this.body.add(field, c);
        });
    }

    private void addEditableFields() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 1;
        c.gridy = 0;
        this.firstNameField = new JTextField(20);
        this.body.add(this.firstNameField, c);

        c.gridy +=1;
        this.lastNameField = new JTextField(20);
        this.body.add(this.lastNameField, c);

        c.gridy += 1;
        this.emailField = new JTextField(20);
        this.body.add(this.emailField, c);

        List<Component> additionalEditableFields = this.getAdditionalEditableFields();
        additionalEditableFields.forEach(field -> {
            c.gridy += 1;
            this.body.add(field, c);
        });
    }

    private void addCreateButton() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridwidth = 2;
        JButton createButton = new JButton("Create");
        createButton.addActionListener(e -> {
            User user = this.createUserFromFields();
            viewManager.getUserManager().add(user);
            viewManager.goBackwards();
        });
        this.body.add(createButton, c);
    }

    protected String getFirstName() {
        return this.firstNameField.getText();
    }

    protected String getLastName() {
        return this.lastNameField.getText();
    }

    protected String getEmail() {
        return this.emailField.getText();
    }

    protected abstract User createUserFromFields();

    public JPanel getBody() {
        return this.body;
    }

}
