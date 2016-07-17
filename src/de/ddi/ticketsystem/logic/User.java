package de.ddi.ticketsystem.logic;

public abstract class User implements Saveable {
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
}
