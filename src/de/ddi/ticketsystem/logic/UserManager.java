package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import util.List;

import java.io.IOException;

public class UserManager extends Manager{

    /**
     * Liste aller Benutzer
     */
    private List<User> users;
    /**
     * momentan angemeldeter Benutzer
     */
    private User current;

    /**
     * Erstellt ein Objekt der Klasse UserManager, die alle Nutzer in einer Liste verwaltet. Diese werden über den
     * übergebenen Zugriff geladen.
     * @param access Ein Zugriff zum Speichern und Laden von Nutzerdaten
     */
    public UserManager(Access access) {
        super(access);
        users = new List<>();
        current = null;
    }

    /**
     * Erstellt aus der Nutzerliste eine Liste aus ";"-getrennten Nutzerinformationen und weißt einen Zugriff vom Typ
     * Access an, diese zu speichern.
     */
    @Override
    public void save() throws IOException {
       // TODO
    }

    @Override
    public void load() throws IOException {
    	// TODO
    }

    /**
     * Gibt den Index des übergebenen Nutzers zurück, wenn dieser in der Liste enthalten ist. Sonst wird 0
     * zurückgegeben.
     * @param user Nutzer, dessen Index zurückgegeben werden soll
     * @return Index des übergebenen Nutzers oder 0, wenn der Nutzer nicht im UserManager vorhanden ist.
     */
    public int indexOf(User user) {
        return users.indexOf(user);
    }

    /**
     * Gibt den Nutzer mit dem übergebenen Index zurück.
     * @param index Index des Nutzers, der zurückgegeben werden soll
     * @return Der Nutzer, mit dem übergebenen Index
     */
    public User get(int index) {
        return users.get(index);
    }

    /**
     * Fügt einen Nutzer zur Verwaltung durch den UserManager hinzu.
     * @param user Der Nutzer, der durch den UserManager verwaltet werden soll
     */
    public void add(User user) {
        users.add(user);
    }

    /**
     * Wählt im UserManager einen Nutzer anhand des Vor- und Nachnamens als aktuellen Nutzer aus.
     * Existiert kein Nutzer mit dem angegebenen Namen, passiert nichts.
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
            // Wenn der momentane Benutzer eine Instanz der Klasse Customer ist, dann füge ihn der
            // Liste hinzu.
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
            // Wenn der momentane Benutzer eine Instanz der Klasse Employee ist, dann füge ihn der
            // Liste hinzu
            if (user instanceof Employee) {
                employees.add((Employee) user);
            }
        }
        return employees;
    }
}
