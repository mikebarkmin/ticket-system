import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketTest {

    int punkte = 0;

    public int getResult() {
        return punkte;
    }
    
    @Test(name="Konstruktor")
    public void constructor() {
        Ticket ticket = new Ticket("Beschreibung", "Status", "Employee", "Customer", 0);
        String description = (String) StaticMethods.getValueFromField(ticket, "description");
        if (description.equals("Beschreibung")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut description nicht richtig gesetzt.");
        }
        String status = (String) StaticMethods.getValueFromField(ticket, "status");
        if (status.equals("Status")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut status nicht richtig gesetzt.");
        }
        String employee = (String) StaticMethods.getValueFromField(ticket, "employee");
        if (employee.equals("Employee")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut employee nicht richtig gesetzt.");
        }
        String customer = (String) StaticMethods.getValueFromField(ticket, "customer");
        if (customer.equals("Customer")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut customer nicht richtig gesetzt.");
        }
        int priority = (int) StaticMethods.getValueFromField(ticket, "priority");
        if (priority == 0) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut priority nicht richtig gesetzt.");
        }
    }

    @Test(name="Getter")
    public void getter() {
        Ticket ticket = new Ticket("Beschreibung", "Status", "Employee", "Customer", 0);
        StaticMethods.setValueToField(ticket, "description", "Beschreibung");
        if (ticket.getDescription().equals("Beschreibung")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getDescription gibt einen falschen Wert zurück. Erwartet: Beschreibung - Bekommen: " + ticket.getDescription());
        }
        StaticMethods.setValueToField(ticket, "status", "Status");
        if (ticket.getStatus().equals("Status")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getStatus gibt einen falschen Wert zurück. Erwartet: Status - Bekommen: " + ticket.getStatus());
        }
        StaticMethods.setValueToField(ticket, "employee", "Employee");
        if (ticket.getEmployee().equals("Employee")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getEmployee gibt einen falschen Wert zurück. Erwartet: Employee - Bekommen: " + ticket.getEmployee());
        }
        StaticMethods.setValueToField(ticket, "customer", "Customer");
        if (ticket.getCustomer().equals("Customer")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getCustomer gibt einen falschen Wert zurück. Erwartet: Customer - Bekommen: " + ticket.getCustomer());
        }
        StaticMethods.setValueToField(ticket, "priority", 1);
        if (ticket.getPriority() != 0) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getPriority gibt einen falschen Wert zurück. Erwartet: 1 - Bekommen: " + ticket.getPriority());
        }
    }

    @Test(name="Setter")
    public void setter() {
        Ticket ticket = new Ticket("Beschreibung", "Status", "Employee", "Customer", 0);
        ticket.setStatus("Status2");
        String status = (String) StaticMethods.getValueFromField(ticket, "status");
        if(status.equals("Status2")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut status wurde durch die Methode setStatus nicht geändert");
        }
        ticket.setEmployee("Employee2");
        String employee = (String) StaticMethods.getValueFromField(ticket, "employee");
        if(employee.equals("Employee2")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut employee wurde durch die Methode setEmployee nicht geändert");
        }
        ticket.setPriority(1);
        int priority = (int) StaticMethods.getValueFromField(ticket, "priority");
        if(priority == 1) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut priority wurde durch die Methode setPriority nicht geändert");
        }
    }
}
