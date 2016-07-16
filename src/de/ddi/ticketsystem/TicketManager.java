package de.ddi.ticketsystem;

import util.BinaryTree;
import util.List;

public class TicketManager {
    private List<Ticket> tickets;
    private BinaryTree<Employee, List<Ticket>> ticketsByEmployee;

    /**
     * Erstellt ein Objekt vom Typ TicketManager. Dabei werden je eine neue Instanz von List<> und BinaryTree<>
     * erzeugt
     */
    public TicketManager() {
        tickets = new List<>();
        ticketsByEmployee = new BinaryTree<>();
    }

    /**
     * Fügt am Ende der verwalteten Tickets das Übergebene an. Zusätzlich  wird das Ticket in eienr Liste gespeichert,
     * die als Wert in einem Binärbaum gespeichert wird, in dem der Name des bearbeitenden Mitarbeiters als Key
     * verwendet wird.
     * @param ticket das hinzugefügt werden soll
     */
    public void add(Ticket ticket) {
        tickets.add(ticket);
        List<Ticket> userTickets = ticketsByEmployee.get(ticket.getEmployee());
        if (userTickets == null) {
            userTickets = new List<>();
            ticketsByEmployee.insert(ticket.getEmployee(), userTickets);
        }
        userTickets.add(ticket);
    }

    /**
     * Entfernt das übergebene Ticket aus der Datenstruktur.
     * @param ticket das entfernt werden soll
     */
    public void remove(Ticket ticket) {
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.equals(ticket)) {
                current.setStatus(Status.CLOSED);
                break;
            }
        }
    }

    /**
     * Gibt alle Tickets aus der Datenstruktur zurück. Sind keine Tickets vorhanden, wird eine leere Liste zurückgeben.
     * @return List<Ticket> aller Tickets
     */
    public List<Ticket> getAll() {
        List<Ticket> tickets = new List<>();
        for(int i = 0; i < this.tickets.size(); i++) {
            tickets.add(this.tickets.get(i));
        }
        return tickets;
    }

    /**
     * Die Methode gibt das älteste Ticket zurück oder eine Null-Referenz, wenn kein Ticket in der Datenstruktur
     * existiert.
     * @return das älteste Ticket
     */
    public Ticket getOldest() {
        Ticket oldest = null;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
            if(oldest == null) {
                oldest = current;
            } else if(current.getCreationDate().compareTo(oldest.getCreationDate()) < 0) {
                oldest = current;
            }
        }
        return oldest;
    }

    /**
     * Gibt eine Liste von Tickets zurück, die dem Mitarbeiter zugewiesen sind.
     * @param employee Employee als Schlüssel
     * @return List<Ticket> mit den Tickets des Mitarbeiters
     */
    public List<Ticket> getFromEmployee(Employee employee) {
        return ticketsByEmployee.get(employee);
    }

    /**
     * Gibt das nächste zu bearbeitende Ticket zurück. Das erste Kriterium ist die Priorität, das zweite das
     * Erstellungsdatum und das dritte die Position in der Datenstruktur. Wenn keine Tickets vorhanden sind, wird eine
     * Null-Referenz zurückgeben.
     * @return das Ticket, welches als nächstes bearbeitet werden soll
     */
    public Ticket next() {
        Ticket next = null;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
            // TODO: Erst Statusabfrage, dann null-Abfrage. Können Fehler auftreten?
            if(current != null) {
                if(next == null) {
                    next = current;
                } else if(next.getPriority() < current.getPriority()) {
                    next = current;
                } else if(next.getPriority() == current.getPriority()) {
                    if(current.getCreationDate().compareTo(next.getCreationDate()) < 0) {
                        next = current;
                    }
                }
            }
        }
        return next;
    }
}
