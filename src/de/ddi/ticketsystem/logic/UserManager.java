package de.ddi.ticketsystem.logic;

import util.List;

public class UserManager {

    /**
     * Liste aller Benutzer
     */
    private List<User> users;
    /**
     * momentan angemeldeter Benutzer
     */
    private User current;

    /**
     * Erstellt ein Objekt der Klasse UserManager, die alle Nutzer in einer Liste verwaltet
     */
    public UserManager() {
        users = new List<>();
        current = null;
    }

    /**
     * Fügt einen Nutzer zur Verwaltung durch den UserManager hinzu.
     * @param user Der Nutzer, der durch den UserManager verwaltet werden soll
     */
    public void add(User user) {
        users.add(user);
    }

    /**
     * Wählt im UserManager einen Nutzer anhand des Vor- und Nachnamens als aktuellen Nutzer aus. Existiert
     * kein Nutzer mit dem angegebenen Namen, passiert nichts
     * @param firstName Der Vorname des Nutzers
     * @param lastName Der Nachname des Nutzers
     */
    public void login(String firstName, String lastName) {
        // Liste alle Benutzer durchlaufen
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            // Überprüfen, ob der Vor- und Nachname mit dem momentanen Benutzer übereinstimmt.
            if(user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)) {
                current = user;
            }
        }
    }

    /**
     * Logt den aktuellen Nutzer aus. Ist kein Nutzer eingelogt, passiert nichts.
     */
    public void logout() {
        current = null;
    }

    public User getCurrent() {
        return current;
    }

    /**
     * Gibt eine Liste aller Nutzer zurück.
     * @return List<User> mit allen Nutzern, die der UserManager verwaltet
     */
    public List<User> getAll() {
        return users;
    }

    /**
     * Geht die Liste der Nutzer durch und gibt die Liste der Kunden zurück.
     * @return List<Customer> mit den Kunden, die der UserManager verwaltet
     */
    public List<Customer> getCustomers() {
        List<Customer> customers = new List<>();
        // Liste der Benutzer durchlaufen
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            // Wenn der momentane Benutzer eine Instanz der Klasse Customer ist, dann füge ihn der Liste hinzu.
            if (user instanceof Customer) {
                customers.add((Customer) user);
            }
        }
        return customers;
    }

    /**
     * Geht die Liste der Nutzer durch und gibt die Liste der Angestellten zurück.
     * @return List<Employee> mit den Angestellten, die der UserManager verwaltet
     */
    public List<Employee> getEmployees() {
        List<Employee> employees = new List<>();
        // Liste der Benutzer durchlaufen
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            // Wenn der momentane Benutzer eine Instanz der Klasse Employee ist, dann füge ihn der Liste hinzu
            if (user instanceof Employee) {
                employees.add((Employee) user);
            }
        }
        return employees;
    }
}
