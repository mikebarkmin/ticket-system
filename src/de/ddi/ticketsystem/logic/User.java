package de.ddi.ticketsystem.logic;

public abstract class User implements Saveable, Comparable<User> {
    protected String firstName;
    protected String lastName;
    protected String email;

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

    /**
     * Erstellt eine ";"-getrennte Zeichenkette mit den Daten des Nutzers in der Reihenfolge
     * Vorname;Nachname;Emailadresse;
     * @return Ein ";"-getrennter String mit den Daten des Nutzers
     */
    @Override
    public String saveToText() {
        String text = firstName + ";" + lastName + ";" + email + ";";
        return text;
    }

    public int compareTo(User user) {
        return (firstName + lastName).compareTo(user.firstName + user.lastName);
    }
}
