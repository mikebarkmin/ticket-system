package de.ddi.ticketsystem.presentation;

public class MenuView extends View {
    public MenuView(ViewManager viewManager) {
        super(viewManager);
        name = "Hauptmenü";
        text = "Wählen Sie einen Menüpunkt aus!";
        options = new String[]{
                "[T]ickets",
                "[U]sers"
        };
    }

    @Override
    public void evaluate(String input) {
        switch (input) {
            case "T":
                viewManager.setNextView(new TicketsView(viewManager));
                break;
            case "U":
                viewManager.setNextView(new UsersView(viewManager));
                break;
        }
    }
}
