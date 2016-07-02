package de.ddi.ticketsystem;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();

        Employee employee = new Employee("Mike", "Barkmin");
        Customer customer = new Customer("Gero", "Behler", "Uni Due");

        Ticket ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                2);

        ticketManager.add(ticket);

        ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                1);

        ticketManager.add(ticket);

        ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                3);

        ticketManager.add(ticket);

        Ticket oldest = ticketManager.getOldest();
        System.out.println(oldest.getCreationDate());
    }
}
