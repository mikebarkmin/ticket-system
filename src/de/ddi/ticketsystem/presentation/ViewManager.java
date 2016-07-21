package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.NoteManager;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import util.Stack;

import java.util.Scanner;

public class ViewManager {

    private UserManager userManager;
    private TicketManager ticketManager;
    private NoteManager noteManager;
    private Stack<View> viewStack;
    private Scanner scanner;

    /**
     * Erstellt eine Instanz zur Verwaltung verschiedener Anzeigen.
     * @param userManager Ein UserManager zum Zugriff auf die Nutzer
     * @param ticketManager Ein TicketManager zum Zugriff auf die Tickets
     * @param noteManager Ein NoteManager zum Zugriff auf die Notizen
     */
    public ViewManager(UserManager userManager, TicketManager ticketManager, NoteManager noteManager) {
        this.userManager = userManager;
        this.ticketManager = ticketManager;
        this.noteManager = noteManager;
        viewStack = new Stack<>();
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
    }

    /**
     * Startet den ViewManager mit der Anzeige des Logins.
     */
    public void run() {
        viewStack.push(new LoginView(this));
        while(true) {
            showView();
            getInput();
        }
    }

    private void showView() {
        View current = viewStack.peek();
        current.show();
    }

    private void getInput() {
        String input;
        input = scanner.next().toUpperCase();
        switch (input) {
            case "Z":
                viewStack.pop();
                break;
            case "B":
                userManager.save();
                ticketManager.save();
                noteManager.save();
                System.exit(0);
                break;
            default:
                View current = viewStack.peek();
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
