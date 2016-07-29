package de.ddi.ticketsystem.presentation;

public class MenuView extends View {

    /**
     * Erstellt eine Anzeige, die das Hauptmenü des Programms anzeigt und die Auswahl zwischen Tickets und Nutzer
     * ermöglicht
     * @param viewManager ViewManager, der die Anzeige verwaltet
     */
    public MenuView(ViewManager viewManager) {
        super(viewManager);
        name = "Hauptmenü";
        text = "Wählen Sie einen Menüpunkt aus!";
        options = new String[]{
                "[T]ickets",
        };
        employeeOptions = new String[]{
                "[U]sers"
        };
    }

    /**
     * Auswertung der Hauptmenü-Anzeige.
     * Wurde "I" eingegeben, wird der viewManager angewiesen, als nächstes die Tickets anzuzeigen.
     * Wurde "U" eingegeben, wird der viewManager angewiesen, als nächstes die Daten des Nutzers anzuzeigen
     * @param input Die Eingabe des Nutzers
     */
    @Override
    public void evaluate(String input) {
        switch (input) {
            case "T":
                // den nächsten View setzten
                viewManager.setNextView(new TicketsView(viewManager));
                break;
            case "U":
                // den nächsten View setzten
                viewManager.setNextView(new UsersView(viewManager));
                break;
        }
    }
}
