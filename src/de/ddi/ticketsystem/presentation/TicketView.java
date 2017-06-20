package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;
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
        this.addNotes();
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

    private void addNotes() {
        NotesView notesView = new NotesView(viewManager, ticket);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridwidth = 2;
        c.weightx = 1;
        this.body.add(new JLabel("<html><h2>Notes</h2></html>"), c);
        c.fill = GridBagConstraints.BOTH;
        this.body.add(notesView.getBody(), c);
        this.body.add(notesView.getMenu(), c);
    }

    private void addLabels() {
        GridBagConstraints c;

        c = this.createGbc(0, 0);
        JLabel descriptionLabel = new JLabel("Description");
        this.body.add(descriptionLabel, c);

        c = this.createGbc(0, 1);
        JLabel statusLabel = new JLabel("Status");
        this.body.add(statusLabel, c);

        c = this.createGbc(0, 2);
        JLabel employeeLabel = new JLabel("Employee");
        this.body.add(employeeLabel, c);

        c = this.createGbc(0, 3);
        JLabel customerLabel = new JLabel("Customer");
        this.body.add(customerLabel, c);

        c = this.createGbc(0, 4);
        JLabel priorityLabel = new JLabel("Priority");
        this.body.add(priorityLabel, c);

        List<Component> additionalLabels = this.getAdditionalLabels();
        int i = 5;
        for (Component additionalLabel : additionalLabels) {
            c = this.createGbc(0, i);
            i++;
            this.body.add(additionalLabel, c);
        }
    }

    private void addFields() {
        GridBagConstraints c;

        c = this.createGbc(1, 0);
        JLabel descriptionLabel = new JLabel("<html>" + this.ticket.getDescription() + "</html>");
        this.body.add(descriptionLabel, c);

        c = this.createGbc(1, 1);
        statusBox = new JComboBox<>(Status.values());
        statusBox.setSelectedItem(this.ticket.getStatus());
        this.body.add(statusBox, c);

        c = this.createGbc(1, 2);
        Employee[] employees = viewManager.getUserManager().getAll().stream().filter(u -> u instanceof Employee)
                .map(u -> (Employee) u).sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .toArray(Employee[]::new);
        employeeBox = new JComboBox<Employee>(employees);
        employeeBox.setSelectedItem(this.ticket.getEmployee());
        installRendererUser(employeeBox);
        this.body.add(employeeBox, c);

        c = this.createGbc(1, 3);
        Customer customer = ticket.getCustomer();
        JLabel customerLabel = new JLabel(
                customer.getFirstName() + " " + customer.getLastName() + " (" + customer.getCompany() + ")");
        this.body.add(customerLabel, c);

        c = this.createGbc(1, 4);
        Integer[] priorities = IntStream.iterate(1, n -> n + 1).limit(10).boxed().toArray(Integer[]::new);
        priorityBox = new JComboBox<Integer>(priorities);
        priorityBox.setSelectedItem(this.ticket.getPriority());
        this.body.add(priorityBox, c);

        List<Component> additionalFields = this.getAdditionalFields();
        int i = 5;
        for (Component additionalField : additionalFields) {
            c = this.createGbc(1, i);
            i++;
            this.body.add(additionalField, c);
        }
    }

    private void addEditableFields() {
        GridBagConstraints c;

        c = this.createGbc(1, 0);
        descriptionField = new JTextArea();
        this.body.add(descriptionField, c);

        c = this.createGbc(1, 1);
        statusBox = new JComboBox<>(Status.values());
        this.body.add(statusBox, c);

        c = this.createGbc(1, 2);
        Employee[] employees = viewManager.getUserManager().getAll().stream().filter(u -> u instanceof Employee)
                .map(u -> (Employee) u).sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .toArray(Employee[]::new);
        employeeBox = new JComboBox<Employee>(employees);
        installRendererUser(employeeBox);
        this.body.add(employeeBox, c);

        c = this.createGbc(1, 3);
        Customer[] customers = viewManager.getUserManager().getAll().stream().filter(u -> u instanceof Customer)
                .map(u -> (Customer) u).sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .toArray(Customer[]::new);
        customerBox = new JComboBox<Customer>(customers);
        installRendererUser(customerBox);
        this.body.add(customerBox, c);

        c = this.createGbc(1, 4);
        Integer[] priorities = IntStream.iterate(1, n -> n + 1).limit(10).boxed().toArray(Integer[]::new);
        priorityBox = new JComboBox<Integer>(priorities);
        this.body.add(priorityBox, c);

        List<Component> additionalEditableFields = this.getAdditionalEditableFields();
        int i = 5;
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
            Ticket ticket = this.createTicketFromFields();
            viewManager.getTicketManager().add(ticket);
            viewManager.goBackwards();
        });
        this.body.add(createButton, c);
    }

    protected abstract Ticket createTicketFromFields();

    private void modifyTicketFromFields() {
        Status status = (Status) statusBox.getSelectedItem();
        Employee employee = (Employee) employeeBox.getSelectedItem();
        int priority = (int) priorityBox.getSelectedItem();

        this.ticket.setStatus(status);
        this.ticket.setEmployee(employee);
        this.ticket.setPriority(priority);

        System.out.println(ticket);
    }

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

    protected String getDescription() {
        return descriptionField.getText();
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

    private void installRendererUser(JComboBox<? extends User> comboBox) {
        final ListCellRenderer<? super Object> original = new JComboBox<Object>().getRenderer();
        comboBox.setRenderer(new ListCellRenderer<User>() {

            public Component getListCellRendererComponent(JList<? extends User> list, User value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                String sValue = "No Users";
                if (value != null) {
                    sValue = value.getLastName() + ", " + value.getFirstName();
                }
                return original.getListCellRendererComponent(list, sValue, index, isSelected, cellHasFocus);
            }
        });
    }
}
