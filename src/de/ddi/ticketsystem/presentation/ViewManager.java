package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import util.Stack;

import java.util.Scanner;

public class ViewManager {

    private UserManager userManager;
    private TicketManager ticketManager;
    private Stack<View> viewStack;
    private Scanner scanner;

    public ViewManager(UserManager userManager, TicketManager ticketManager) {
        this.userManager = userManager;
        this.ticketManager = ticketManager;
        this.viewStack = new Stack<>();
        this.scanner = new Scanner(System.in);
        this.scanner.useDelimiter("\\n");
    }

    public void run() {
        viewStack.push(new LoginView(this));
        while(true) {
            this.showView();
            this.getInput();
        }
    }

    private void showView() {
        View current = this.viewStack.peek();
        current.show();
    }

    private void getInput() {
        String input;
        input = this.scanner.next().toUpperCase();
        switch (input) {
            case "Z":
                viewStack.pop();
                break;
            case "B":
                System.exit(0);
                break;
            default:
                View current = this.viewStack.peek();
                current.evaluate(input);
                break;
        }
    }

    public void setNextView(View view) {
        viewStack.push(view);
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }
}
