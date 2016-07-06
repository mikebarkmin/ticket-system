package de.ddi.ticketsystem.logic;

public abstract class User implements Saveable, Comparable<User> {
    private String firstName;
    private String lastName;
    private String email;

    protected User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String saveToText() {
        String text = firstName + ";" + lastName + ";" + email + ";";
        return text;
    }

    public int compareTo(User user) {
        return (firstName + lastName).compareTo(user.firstName + user.lastName);
    }
}
