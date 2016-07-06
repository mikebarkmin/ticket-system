package de.ddi.ticketsystem.presentation;

public class LoginView extends View {

    public LoginView(ViewManager viewManager) {
        super(viewManager);
        this.name = "Anmelden";
        this.text = "Bevor Sie das Programm benutzen können müssen Sie sich anmelden.";
        this.options = new String[]{
                "[A]nmelden"
        };
    }

    @Override
    public void evaluate(String input) {
        switch (input) {
            case "A":
                System.out.print("Vorname: ");
                String firstName = scanner.next();
                System.out.print("Nachname: ");
                String lastName = scanner.next();
                this.viewManager.getUserManager().login(firstName, lastName);
                if (this.viewManager.getUserManager().getCurrent() != null) {
                    this.viewManager.setNextView(new TicketsView(this.viewManager));
                }
        }
    }

}
