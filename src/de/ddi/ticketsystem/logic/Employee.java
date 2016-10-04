package de.ddi.ticketsystem.logic;

/**
 * Employee dient zum Bündeln von Informationen über einen Angestellten. Dabei wird die Klasse User erweitert.
 * @see User
 */
public class Employee extends User {
    /**
     * Name der Abteilung des Angestellten
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
     * Gibt eine ";"-getrennte Zeichenkette mit den Informationen des Angestellten zurück. Reihenfolge:
     * Nutzertyp;Fachbereich;Vorname;Nachname;Emailadresse;
     * @return Ein ";"-getrennter String mit den Daten des Nutzers
     */
    @Override
    public String saveToText() {
        String text = "EMPLOYEE;";
        text += super.saveToText();
        text += department + ";";
        return text;
    }
}
