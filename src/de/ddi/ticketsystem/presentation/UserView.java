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
        GridBagConstraints c;

        c = this.createGbc(0, 0);
        JLabel firstNameLabel = new JLabel("First Name");
        this.body.add(firstNameLabel, c);

        c = this.createGbc(0, 1);
        JLabel lastNameLabel = new JLabel("Last Name");
        this.body.add(lastNameLabel, c);

        c = this.createGbc(0, 2);
        JLabel emailLabel = new JLabel("Email");
        this.body.add(emailLabel, c);

        List<Component> additionalLabels = this.getAdditionalLabels();
        int i = 3;
        for (Component additionalLabel : additionalLabels) {
            c = this.createGbc(0, i);
            this.body.add(additionalLabel, c);
        }
    }

    private void addFields() {
        GridBagConstraints c;

        c = this.createGbc(1, 0);
        JLabel firstNameLabel = new JLabel(this.user.getFirstName());
        this.body.add(firstNameLabel, c);

        c = this.createGbc(1, 1);
        JLabel lastNameLabel = new JLabel(this.user.getLastName());
        this.body.add(lastNameLabel, c);

        c = this.createGbc(1, 2);
        JLabel emailLabel = new JLabel(this.user.getEmail());
        this.body.add(emailLabel, c);

        List<Component> additionalFields = this.getAdditionalFields();
        int i = 3;
        for (Component additionalField : additionalFields) {
            c = this.createGbc(1, i);
            i++;
            this.body.add(additionalField, c);
        }
    }

    private void addEditableFields() {
        GridBagConstraints c;

        c = this.createGbc(1, 0);
        this.firstNameField = new JTextField(20);
        this.body.add(this.firstNameField, c);

        c = this.createGbc(1, 1);
        this.lastNameField = new JTextField(20);
        this.body.add(this.lastNameField, c);

        c = this.createGbc(1, 2);
        this.emailField = new JTextField(20);
        this.body.add(this.emailField, c);

        List<Component> additionalEditableFields = this.getAdditionalEditableFields();
        int i = 3;
        for (Component additionalEditableField : additionalEditableFields) {
            c = this.createGbc(1, i);
            i++;
            this.body.add(additionalEditableField, c);
        }
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
