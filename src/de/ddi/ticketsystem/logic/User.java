package de.ddi.ticketsystem.logic;

/**
 * Abstrakte Klasse User, die die Grundinformationen über einen Benutzer enthält. Diese Klasse ist Abstrakt, da Benutzer
 * immer von einem speziellen Typ, der von dieser Klasse erbt, sein müssen. Demnach müssen keine Objekte vom Typ User
 * erzeugt werden.
 */
public abstract class User implements Saveable, Comparable<User> {
    /**
     * Vorname des Benutzers
     */
    protected String firstName;
    /**
     * Nachname des Benutzers
     */
    protected String lastName;
    /**
     * Email-Adresse des Benutzers
     */
    protected String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Gibt den Vornamen des Angestellten zurück
     * @return Vorname des Angestellten
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Einen neuen Vorname für den Angestellten setzten
     * @param firstName Vorname des Angestellten
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gibt den Nachnamen des Angestellten zurück
     * @return Nachname des Angestellten
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Einen neuen Nachnamen für den Angestellten setzten
     * @param lastName Nachname des Angestellten
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gibt die Email-Adresse des Angestellten zurück
     * @return Email-Adresse des Angestellten
     */
    public String getEmail() {
        return email;
    }

    /**
     * Eine neue Email-Adresse für den Angestellten setzten
     * @param email Email-Adresse des Angestellten
     */
    public void setEmail(String email) {
        this.email = email;
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

    /**
     * Vergleicht den Benutzer mit einem anderen anhand des Vor- und Nachnamnes
     * @param user Der Benutzer, mit dem verglichen werden soll
     * @return Den Wert 0, wenn Vor- und Nachname der Benutzer identisch sind. Einen Wert kleiner als 0, wenn
     * der Name lexikographisch vor dem des übergebenen Benutzer liegt. Einen Wert größer als 0, wenn der Name
     * lexikographisch hinter dem den übergebenen Benutzer liegt.
     * @see Comparable#compareTo(Object)
     */
    @Override
    public int compareTo(User user) {
        return (firstName + lastName).compareTo(user.firstName + user.lastName);
    }
}
