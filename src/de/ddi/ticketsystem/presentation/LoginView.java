package de.ddi.ticketsystem.presentation;

public class LoginView extends View {

    public LoginView(ViewManager viewManager) {
        super(viewManager);
        name = "Anmelden";
        text = "Bevor Sie das Programm benutzen können müssen Sie sich anmelden.";
        options = new String[]{
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
                viewManager.getUserManager().login(firstName, lastName);
                if (viewManager.getUserManager().getCurrent() != null) {
                    viewManager.setNextView(new MenuView(viewManager));
                }
        }
    }

}
