package de.ddi.ticketsystem.logic;

/**
 * Employee dient zum Bündeln von Informationen über einen Angestellten. Dabei wird die Klasse User erweitert. Die Klasse
 * muss das Interface Comparable implementieren, da die Angestellten in als Schlüssel in einen Binärbaum einsortiert werden
 * sollen.
 * @see User
 * @see util.BinaryTree
 */
public class Employee extends User implements Comparable<Employee> {
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

    /**
     * Vergleicht den Angestellten mit einem anderen anhand des Vor- und Nachnamnes
     * @param employee Der Angestellte, mit dem verglichen werden soll
     * @return Den Wert 0, wenn Vor- und Nachname der Angestellten identisch sind. Einen Wert kleiner als 0, wenn
     * der Name lexikographisch vor dem des übergebenen Angestellten liegt. Einen Wert größer als 0, wenn der Name
     * lexikographisch hinter dem den übergebenen Angestellten liegt.
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(Employee employee) {
        return (firstName + lastName).compareTo(employee.firstName + employee.lastName);
    }
}
