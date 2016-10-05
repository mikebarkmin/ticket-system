package de.ddi.ticketsystem.logic;

/**
 * Employee dient zum Bündeln von Informationen über einen Angestellten. Dabei wird die Klasse User erweitert.
 * @see User
 */
public class Employee extends User {
    /**
     * Bereich in dem der Angestellte arbeitet
     */
    private String department;

    /**
     * Erstellt ein Objekt vom Typ Employee
     * @param firstName Vorname des Angestellten
     * @param lastName Nachname des Angestellten
     * @param email Emailadresse des Angestellten
     * @param department Fachbereich des Angestellten
     */
    public Employee(String firstName, String lastName, String email, String department) {
        super(firstName, lastName, email);
        this.department = department;
    }

    /**
     * Gibt den Namen der Abteilung in der der Angestellte Arbeitet zurück
     * @return Name der Abteilung
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Vergleicht zwei Objekte vom Typ employee
     * @param employee Angestellter mit dem verglichen werden soll
     * @return 0 sie sind gleich, -1 employee ist größer als dieser, 1 dieser ist größer als employee
     * @see Comparable#compareTo(Object)
     */
    @Override
    public String saveToText() {
        String text = "EMPLOYEE;";
        text += super.saveToText();
        text += department + ";";
        return text;
    }

    public String toString() {
        return firstName + ";" + lastName + ";" + email + ";" + department;
    }
}
