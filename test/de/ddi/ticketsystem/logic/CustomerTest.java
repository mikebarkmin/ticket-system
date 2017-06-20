package de.ddi.ticketsystem.logic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class CustomerTest {

    private Customer customer;
    private String firstName = "firstName";
    private String lastName = "lastName";
    private String email = "email";
    private String company = "company";

    @Before
    public void setUp() throws Exception {
        customer = new Customer(firstName, lastName, email, company);
    }

    @Test
    public void testGetCompany() {
        assertEquals(customer.getCompany(), company);
    }

    @Test
    public void testGetEmail() {
        assertEquals(customer.getEmail(), email);
    }

    @Test
    public void testGetFirstName() {
        assertEquals(customer.getFirstName(), firstName);
    }

    @Test
    public void testGetLastName() {
        assertEquals(customer.getLastName(), lastName);
    }

    @Test
    public void testToString() {
        assertEquals(customer.toString(), firstName + ";" + lastName + ";" + email + ";" + company);
    }

    @Test
    public void testSaveToTest() {
        assertEquals(customer.saveToText(),
                "CUSTOMER;" + firstName + ";" + lastName + ";" + email + ";" + company + ";");
    }

}