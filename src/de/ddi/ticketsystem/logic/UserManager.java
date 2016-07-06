package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import util.List;

import java.io.IOException;

public class UserManager extends Manager{

    private List<User> users;
    private User current;

    public UserManager(Access access) {
        super(access);
        users = new List<>();
        current = null;
        load();
    }

    @Override
    public void save() {
        List<String> data = new List<>();
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            String sUser = i + ";" + user.saveToText();
            data.add(sUser);
        }
        try {
            access.save(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void load() {
        try {
            List<String> data = access.load();
            for(int i = 0; i < data.size(); i++) {
                String sUser = data.get(i);
                String[] values = sUser.split(";");
                if(values[1].equals("EMPLOYEE")) {
                    User user = new Employee(values[2], values[3], values[4], values[5]);
                    users.add(user);
                } else if(values[1].equals("CUSTOMER")){
                    User user = new Customer(values[2], values[3], values[4], values[5]);
                    users.add(user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int indexOf(User user) {
        return users.indexOf(user);
    }

    public User get(int index) {
        return users.get(index);
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
