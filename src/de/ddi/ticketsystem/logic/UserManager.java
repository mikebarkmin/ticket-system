package de.ddi.ticketsystem.logic;

import util.List;

public class UserManager {

    private List<User> users;
    private User current;

    public UserManager() {
        users = new List<>();
        current = null;
    }

    public void add(User... users) {
        for(int i = 0; i < users.length; i++) {
            this.users.add(users[i]);
        }
    }

    public void login(String firstName, String lastName) {
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)) {
                current = user;
            }
        }
    }

    public void logout() {
        current = null;
    }

    public User getCurrent() {
        return current;
    }

    public List<User> getAll() {
        return users;
    }

    public List<Customer> getCustomers() {
        List<Customer> customers = new List<>();
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user instanceof Customer) {
                customers.add((Customer) user);
            }
        }
        return customers;
    }
    
    public List<Employee> getEmployees() {
        List<Employee> employees = new List<>();
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user instanceof Employee) {
                employees.add((Employee) user);
            }
        }
        return employees;
    }
}
