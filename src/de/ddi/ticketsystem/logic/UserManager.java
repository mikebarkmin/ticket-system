package de.ddi.ticketsystem.logic;

import util.List;

public class UserManager {

    private List<User> users;
    private User current;

    public UserManager() {
        this.users = new List<>();
        this.current = null;
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
}
