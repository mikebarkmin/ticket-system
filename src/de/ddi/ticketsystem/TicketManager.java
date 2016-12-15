package de.ddi.ticketsystem;

/**
 * Der TicketManager ist für die Verwaltung von Tickets zuständig
 */
public class TicketManager {
    /**
     * Gespeicherte Tickets
     */
    private Ticket[] tickets;
    /**
     * Anzahl der gespeicherten Tickets
     */
    private int count = 0;

    /**
     * Erzeugt ein Objekt vom Typ TicketManager
     * @param size maximale Anzahl der Tickets, die der TickerManager verwalten kann
     */
    public TicketManager(int size) {
        tickets = new Ticket[size];
    }

    /**
     * Fügt am Ende der verwalteten Tickets das Übergebene an. Wenn kein Platz vorhanden ist, wird eine Fehlermeldung
     * ausgegeben.
     * @param ticket das hinzugefügt werden soll
     */
    public void add(Ticket ticket) {
        // Zunächst wird überprüft, ob noch Platz in Array vorhanden ist, um ein weiteres Ticket zu speichern.
        // Wenn die Länge des Arrays mindestens ein Platz kleiner ist als die momentane Anzahl der gespeicherten
        // Tickets, dann wird das Ticket abgespeichert. Sonst wird eine Fehlerausgabe erzeugt.
        if (count < tickets.length) {
            // Anzahl der gespeicherten Tickets erhöhen und das Ticket an dieser Stelle im Array hinterlegen.
            tickets[count++] = ticket;
        } else {
            // Ausgabe, wenn kein Platz mehr vorhanden ist.
            System.out.println("Der TicketManager ist voll!");
        }
    }

    /**
     * Entfernt das übergebene Ticket aus der Datenstruktur.
     * @param ticket das entfernt werden soll
     */
    public void remove(Ticket ticket) {
        // Das ganze Array durchlaufen
        for(int i = 0; i < tickets.length; i++) {
            // Die momentane Stelle im Array zwischenspeichern. Kann auch null sein!
            Ticket current = tickets[i];
            // Überprüfen, ob das zu löschende Ticket und die momentane Stelle das gleiche Objekt ist.
            if(current != null && current.equals(ticket)) {
                // Stelle im Array auf null setzten, um das Ticket aus dem Array zu löschen.
                tickets[i] = null;
                // Schleife abbrechen, um weitere unnötige Berechnungen zu sparen, da das Ticket schon gelöscht wurde
                break;
            }
        }
    }

    /**
     * Gibt alle Tickets aus der Datenstruktur zurück. Sind keine Tickets vorhanden wird ein leeres Array zurückgeben,
     * dessen Länge der Länge entspricht, die im Konstruktor angegeben wurde.
     * @return alle Tickets in einem Array
     */
    public Ticket[] getAll() {
        return tickets;
    }

    /**
     * Die Methode gibt das älteste Ticket zurück oder eine Null-Referenz, wenn kein Ticket in der Datenstruktur
     * existiert.
     *
     * @return das älteste Ticket
     */
    public Ticket getOldest() {
        // initialisieren der Variablen oldest, in der das älteste Ticket gespeichert werden soll
        Ticket oldest = null;
        // Das ganze Array durchlaufen, um das Älteste herauszufinden
        for (int i = 0; i < tickets.length; i++) {
            // Überprüfen, ob die momentane Stelle im Array nicht leer ist
            if (tickets[i] != null) {
                // Wenn noch kein Ältestes zwischengespeichert wurde, dann speichern wir das momentane Ticket als Ältestes.
                // Wenn dies nicht der Fall ist, werden die Erstellungsdaten des momentane Ältesten und es momentanen Tickets
                // verglichen. Ist das momentane Ticket älter, dann wird es als Ältestes zwischengespeichert.
                if (oldest == null) {
                    oldest = tickets[i];
                } else if (tickets[i].getCreationDate().compareTo(oldest.getCreationDate()) < 0) {
                    oldest = tickets[i];
                }
            }
        }
        // das älteste Ticket wird zurückgeben, wenn eins gefunden wurde, sonst wird null zurückgegeben.
        return oldest;
    }

    /**
     * Gibt das nächste zu bearbeitende Ticket zurück. Das erste Kriterium ist die Priorität, das zweite das
     * Erstellungsdatum und das dritte die Position in der Datenstruktur. Wenn keine Tickets vorhanden sind, wird eine
     * Null-Referenz zurückgeben.
     * @return das Ticket, welches als nächstes bearbeitet werden soll
     */
    public Ticket next() {
        // initialisieren der Variable next, in der das nächste Ticket gespeichert werden soll
        Ticket next = null;
        // Das ganze Array durchlaufen, um das Nächste herauszufinden.
        for(int i = 0; i < tickets.length; i++) {
            // Überprüfen, ob die momentane Stelle im Array nicht leer ist
            if(tickets[i] != null) {
                // Wenn noch kein Nächstes zwischengespeichert wurde, dann speichern wir das momentane Ticket als Nächstes.
                // Wenn dies nicht der Fall ist, werden die Prioritäten der beiden Tickets miteinander verglichen.
                // Ist die Priorität vom momentanen Ticket größere als vom Nächsten, dann wird diese Ticket
                // zwischengespeichert. Sind die Prioritäten gleich, dann werden die Erstellungsdaten verglichen. Hat
                // das momentane Ticket ein älteres Erstellungsdatum als das Nächste, wird es als Nächstes
                // zwischengespeichert.
                if(next == null) {
                    next = tickets[i];
                } else if(next.getPriority() < tickets[i].getPriority()) {
                    next = tickets[i];
                } else if(next.getPriority() == tickets[i].getPriority()) {
                    if(tickets[i].getCreationDate().compareTo(next.getCreationDate()) < 0) {
                        next = tickets[i];
                    }
                }
            }
        }
        // das nächste Ticket wird zurückgeben, wenn eines gefunden wurde, sonst wird null zurückgegeben.
        return next;
    }
}
