package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.UserManager;

public class LoginView extends View {

    public LoginView(UserManager userManager) {
        super(userManager);
        this.name = "Anmelden";
        this.text = "Bevor Sie das Programm benutzen können müssen Sie sich anmelden.";
        this.options = new String[]{
                "[A]nmelden",
                "[B]eenden"
        };
    }

    @Override
    protected void evaluate(String input) {
        input = input.toUpperCase();
        if(input.equals("A")) {
            this.showLogin();
        } else if(input.equals("B")) {
            this.state = "exit";
        }
    }

    private void showLogin() {
        System.out.print("Name: ");
        String firstName = this.scanner.next();
        String lastName = this.scanner.next();
        this.userManager.login(firstName, lastName);
        if(this.userManager.getCurrent() != null) {
            this.state = "logged-in";
        } else {
            this.state = "failed-logged-in";
        }
    }
}
