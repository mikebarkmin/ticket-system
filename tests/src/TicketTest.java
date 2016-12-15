import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

import java.util.Date;

import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.Employee;
import de.ddi.ticketsystem.Customer;

public class TicketTest {

    int punkte = 0;

    public int getResult() {
        return punkte;
    }
    
    @Test(name="Konstruktor")
    public void constructor() {
        Employee employee = new Employee("Gero", "Behler", "g@b.de", "DDI");
        Customer customer = new Customer("Mike", "Barkmin", "m@b.de", "Paluno");
        Ticket ticket = new Ticket("Beschreibung", "Status", employee, customer, 0);
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
        Employee ticketEmployee = (Employee) StaticMethods.getValueFromField(ticket, "employee");
        if (ticketEmployee == employee) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut employee nicht richtig gesetzt.");
        }
        Customer ticketCustomer = (Customer) StaticMethods.getValueFromField(ticket, "customer");
        if (ticketCustomer == customer) {
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
        Date creationDate = (Date) StaticMethods.getValueFromField(ticket, "creationDate");
        if (creationDate != null) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut creationDate nicht richtig gesetzt.");
        }
    }

    @Test(name="Getter")
    public void getter() {
        Employee employee = new Employee("Gero", "Behler", "g@b.de", "DDI");
        Customer customer = new Customer("Mike", "Barkmin", "m@b.de", "Paluno");
        Ticket ticket = new Ticket("Beschreibung", "Status", employee, customer, 0);
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
        StaticMethods.setValueToField(ticket, "employee", employee);
        if (ticket.getEmployee().equals(employee)) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getEmployee gibt einen falschen Wert zurück.");
        }
        StaticMethods.setValueToField(ticket, "customer", customer);
        if (ticket.getCustomer().equals(customer)) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getCustomer gibt einen falschen Wert zurück.");
        }
        StaticMethods.setValueToField(ticket, "priority", 1);
        if (ticket.getPriority() != 0) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getPriority gibt einen falschen Wert zurück. Erwartet: 1 - Bekommen: " + ticket.getPriority());
        }
        Date creationDate = new Date();
        StaticMethods.setValueToField(ticket, "creationDate", creationDate);
        if (ticket.getCreationDate() == creationDate) {
        	punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getCreationDate gibt einen falschen Wert zurück.");
        }

    }

    @Test(name="Setter")
    public void setter() {
        Employee employee = new Employee("Gero", "Behler", "g@b.de", "DDI");
        Customer customer = new Customer("Mike", "Barkmin", "m@b.de", "Paluno");
        Ticket ticket = new Ticket("Beschreibung", "Status", employee, customer, 0);
        ticket.setStatus("Status2");
        String status = (String) StaticMethods.getValueFromField(ticket, "status");
        if(status.equals("Status2")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut status wurde durch die Methode setStatus nicht geändert");
        }
        Employee employee2 = new Employee("Gero", "Behler", "g@b.de", "DDI");
        ticket.setEmployee(employee2);
        Employee ticketEmployee = (Employee) StaticMethods.getValueFromField(ticket, "employee");
        if(ticketEmployee.equals(employee2)) {
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
