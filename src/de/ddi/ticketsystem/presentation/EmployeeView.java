package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.util.List;
import java.util.ArrayList;

public class EmployeeView extends UserView {

    private JTextField departmentField;

    public EmployeeView(ViewManager viewManager, Employee employee) {
        super(viewManager, employee);
    }

    public EmployeeView(ViewManager viewManager) {
        super(viewManager);
    }

    @Override
    protected List<Component> getAdditionalLabels() {
        List<Component> labels = new ArrayList<>();

        JLabel departmentLabel = new JLabel("Department");
        labels.add(departmentLabel);

        return labels;
    }

    @Override
    protected List<Component> getAdditionalFields() {
        List<Component> fields = new ArrayList<>();

        JLabel departmentField = new JLabel(((Employee) this.user).getDepartment());
        fields.add(departmentField);

        return fields;
    }

    @Override
    protected List<Component> getAdditionalEditableFields() {
        List<Component> editableFields = new ArrayList<>();

        this.departmentField = new JTextField(20);
        editableFields.add(this.departmentField);

        return editableFields;
    }

    @Override
    protected String getName() {
        return "Employee";
    }

    @Override
    protected Employee createUserFromFields() {
        String firstName = this.getFirstName();
        String lastName = this.getLastName();
        String email = this.getEmail();
        String department = this.departmentField.getText();

        Employee employee = new Employee(firstName, lastName, email, department);
        return employee;
    }
}
