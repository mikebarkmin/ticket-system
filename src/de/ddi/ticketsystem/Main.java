package de.ddi.ticketsystem.step1;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                "Mike Barkmin",
                "Paluno",
                1);

        // Der Default-Konstuktor exisitert nur, wenn kein andere deklariert ist oder
        // wenn er expliziert deklariert wurde.
        //Ticket ticket2 = new Ticket();
    }
}
