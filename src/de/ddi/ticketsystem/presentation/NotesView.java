package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.UserManager;

public class NotesView extends View {

    private Ticket ticket;

    public NotesView(UserManager userManager, Ticket ticket) {
        super(userManager);
        this.ticket = ticket;
        this.name = "Notizen";
        this.text = "Bevor Sie das Programm benutzen können müssen Sie sich anmelden.";
        this.options = new String[]{
                "[L]öschen",
                "[N]eu",
                "[Z]urück",
                "[B]eenden"
        };
    }

    @Override
    protected void evaluate(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "L":
                this.showDelete();
                break;
            case "N":
                this.showCreate();
                break;
            case "Z":
                break;
            case "B":
                break;
        }

    }

    private void showDelete() {

    }

    private void showCreate() {

    }
}
