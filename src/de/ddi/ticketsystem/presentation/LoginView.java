package de.ddi.ticketsystem.presentation;

public class LoginView extends View {

    /**
     * Erstellt eine Anzeige, die den Login eines Nutzers im System ermöglicht
     * @param viewManager ViewManager, der die Anzeige verwaltet
     */
    public LoginView(ViewManager viewManager) {
        super(viewManager);
        name = "Anmelden";
        text = "Bevor Sie das Programm benutzen können müssen Sie sich anmelden.";
        options = new String[]{
                "[A]nmelden"
        };
    }

    /**
     * Auswertung der Login-Anzeige. Wurde "A" eingegeben, wird ein Formular zum Login angezeigt.
     * Anschließend wird der viewManager angewiesen, den Nutzer mit den angegebenen Daten einzuloggen. Ist dies
     * erfolgreich, soll als nächstes das Hauptmenü angezeigt werden.
     * @param input Die Eingabe des Nutzers
     */
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