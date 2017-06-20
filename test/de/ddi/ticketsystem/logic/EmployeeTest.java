package de.ddi.ticketsystem.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class EmployeeTest {

    private Employee employee;
    private String firstName = "firstName";
    private String lastName = "lastName";
    private String email = "email";
    private String department = "department";

    @Before
    public void setUp() throws Exception {
        employee = new Employee(firstName, lastName, email, department);
    }

    @Test
    public void testGetDepartment() {
        assertEquals(employee.getDepartment(), department);
    }

    @Test
    public void testGetEmail() {
        assertEquals(employee.getEmail(), email);
    }

    @Test
    public void testGetFirstName() {
        assertEquals(employee.getFirstName(), firstName);
    }

    @Test
    public void testGetLastName() {
        assertEquals(employee.getLastName(), lastName);
    }

    @Test
    public void testToString() {
        assertEquals(employee.toString(), firstName + ";" + lastName + ";" + email + ";" + department);
    }

    @Test
    public void testSaveToTest() {
        assertEquals(employee.saveToText(),
                "EMPLOYEE;" + firstName + ";" + lastName + ";" + email + ";" + department + ";");
    }

}