package de.ddi.ticketsystem;

public class Customer extends User {
    private String company;

    public Customer(String firstName, String lastName, String email, String company) {
        super(firstName, lastName, email);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}
