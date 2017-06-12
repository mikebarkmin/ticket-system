package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.MalfunctionTicket;
import de.ddi.ticketsystem.logic.OrderTicket;
import de.ddi.ticketsystem.logic.RequestTicket;
import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Ticket;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.stream.IntStream;

public abstract class TicketView extends View {

    protected Ticket ticket;
    private JPanel body;
    private JTextArea descriptionField;
    private JComboBox<Status> statusBox;
    private JComboBox<Employee> employeeBox;
    private JComboBox<Customer> customerBox;
    private JComboBox<Integer> priorityBox;

    public TicketView(ViewManager viewManager, Ticket ticket) {
        super(viewManager);
        this.ticket = ticket;
        this.body = new JPanel(new GridBagLayout());
        this.addLabels();
        this.addFields();
        this.addModifyButton();
    }

    public TicketView(ViewManager viewManager) {
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
        JLabel descriptionLabel = new JLabel("Description");
        this.body.add(descriptionLabel, c);

        c.gridy += 1;
        JLabel statusLabel = new JLabel("Status");
        this.body.add(statusLabel, c);

        c.gridy += 1;
        JLabel employeeLabel = new JLabel("Employee");
        this.body.add(employeeLabel, c);

        c.gridy += 1;
        JLabel customerLabel = new JLabel("Customer");
        this.body.add(customerLabel, c);

        c.gridy += 1;
        JLabel priorityLabel = new JLabel("Priority");
        this.body.add(priorityLabel, c);

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
        JLabel descriptionLabel = new JLabel("<html>" + this.ticket.getDescription() + "</html>");
        this.body.add(descriptionLabel, c);

        c.gridy += 1;
        statusBox = new JComboBox<>(Status.values());
        this.body.add(statusBox, c);

        c.gridy += 1;
        Employee[] employees = viewManager.getUserManager().getAll().stream()
            .filter(u -> u instanceof Employee)
            .map(u -> (Employee) u)
            .toArray(Employee[]::new);
        employeeBox = new JComboBox<Employee>(employees);
        employeeBox.setRenderer((list, value, index, isSelected, cellHasFocus)
            -> new JLabel(value.getFirstName() + " " + value.getLastName()));
        this.body.add(employeeBox, c);

        c.gridy += 1;
        Customer[] customers = viewManager.getUserManager().getAll().stream()
            .filter(u -> u instanceof Customer)
            .map(u -> (Customer) u)
            .toArray(Customer[]::new);
        customerBox = new JComboBox<Customer>(customers);
        customerBox.setRenderer((list, value, index, isSelected, cellHasFocus)
            -> new JLabel(value.getFirstName() + " " + value.getLastName()));
        this.body.add(customerBox, c);

        c.gridy += 1;
        Integer[] priorities = IntStream.iterate(1, n -> n + 1)
            .limit(10)
            .boxed()
            .toArray(Integer[]::new);
        priorityBox = new JComboBox<Integer>(priorities);
        this.body.add(priorityBox, c);
    }

    private void addEditableFields() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 1;
        c.gridy = 0;
        descriptionField = new JTextArea();
        this.body.add(descriptionField, c);

        c.gridy += 1;
        statusBox = new JComboBox<>(Status.values());
        this.body.add(statusBox, c);

        c.gridy += 1;
        Employee[] employees = viewManager.getUserManager().getAll().stream()
            .filter(u -> u instanceof Employee)
            .map(u -> (Employee) u)
            .toArray(Employee[]::new);
        employeeBox = new JComboBox<Employee>(employees);
        employeeBox.setRenderer((list, value, index, isSelected, cellHasFocus)
            -> new JLabel(value.getFirstName() + " " + value.getLastName()));
        this.body.add(employeeBox, c);

        c.gridy += 1;
        Customer[] customers = viewManager.getUserManager().getAll().stream()
            .filter(u -> u instanceof Customer)
            .map(u -> (Customer) u)
            .toArray(Customer[]::new);
        customerBox = new JComboBox<Customer>(customers);
        customerBox.setRenderer((list, value, index, isSelected, cellHasFocus)
            -> new JLabel(value.getFirstName() + " " + value.getLastName()));
        this.body.add(customerBox, c);

        c.gridy += 1;
        Integer[] priorities = IntStream.iterate(1, n -> n + 1)
            .limit(10)
            .boxed()
            .toArray(Integer[]::new);
        priorityBox = new JComboBox<Integer>(priorities);
        this.body.add(priorityBox, c);
    }

    private void addCreateButton() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridwidth = 2;
        JButton createButton = new JButton("Create");
        createButton.addActionListener(e -> {
            Ticket ticket = this.createTicketFromFields();
            viewManager.getTicketManager().add(ticket);
            viewManager.goBackwards();
        });
        this.body.add(createButton, c);
    }

    protected abstract Ticket createTicketFromFields();

    protected abstract void modifyTicketFromFields();

    private void addModifyButton() {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridwidth = 2;
        JButton modifyButton = new JButton("Modify");
        modifyButton.addActionListener(e -> {
            this.modifyTicketFromFields();
            viewManager.goBackwards();
        });
        this.body.add(modifyButton, c);
    }

    protected Employee getEmployee() {
        return (Employee) employeeBox.getSelectedItem();
    }

    protected Customer getCustomer() {
        return (Customer) customerBox.getSelectedItem();
    }

    protected int getPriority() {
        return (int) priorityBox.getSelectedItem();
    }

    protected Status getStatus() {
        return (Status) statusBox.getSelectedItem();
    }

    @Override
    protected String getName() {
        return "Ticket";
    }

    @Override
    public JPanel getBody() {
        return this.body;
    }
}
