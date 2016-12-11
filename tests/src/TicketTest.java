import java.lang.reflect.Field;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketTest {

    int punkte = 50;

    public int getResult() {
        return punkte < 0 ? 0 : punkte;
    }

    @Test(name="Getter")
    public void getter() {
        Ticket ticket = new Ticket("Beschreibung", "Status", "Employee", "Customer", 0);
        if (!ticket.getDescription().equals("Beschreibung")) {
            punkte -= 5;
            TracingFramework.printError("Die Methode getDescription gibt einen falschen Wert zurück. Erwartet: Beschreibung - Bekommen: " + ticket.getDescription());
        }
        if (!ticket.getStatus().equals("Status")) {
            punkte -= 5;
            TracingFramework.printError("Die Methode getStatus gibt einen falschen Wert zurück. Erwartet: Status - Bekommen: " + ticket.getStatus());
        }
        if (!ticket.getEmployee().equals("Employee")) {
            punkte -= 5;
            TracingFramework.printError("Die Methode getEmployee gibt einen falschen Wert zurück. Erwartet: Employee - Bekommen: " + ticket.getEmployee());
        }
        if (!ticket.getCustomer().equals("Customer")) {
            punkte -= 5;
            TracingFramework.printError("Die Methode getCustomer gibt einen falschen Wert zurück. Erwartet: Customer - Bekommen: " + ticket.getCustomer());
        }
        if (ticket.getPriority() != 0) {
            punkte -= 5;
            TracingFramework.printError("Die Methode getPriority gibt einen falschen Wert zurück. Erwartet: 1 - Bekommen: " + ticket.getPriority());
        }
    }

    @Test(name="Setter")
    public void setter() {
        Ticket ticket = new Ticket("Beschreibung", "Status", "Employee", "Customer", 0);
        ticket.setStatus("Status2");
        String status = (String) getValueFromField(ticket, "status");
        if(!status.equals("Status2")) {
            punkte -= 5;
            TracingFramework.printError("Das Attribut status wurde durch die Methode setStatus nicht geändert");
        }
        ticket.setEmployee("Employee2");
        String employee = (String) getValueFromField(ticket, "employee");
        if(!employee.equals("Employee2")) {
            punkte -= 5;
            TracingFramework.printError("Das Attribut employee wurde durch die Methode setEmployee nicht geändert");
        }
        ticket.setPriority(1);
        int priority = (int) getValueFromField(ticket, "priority");
        if(priority != 1) {
            punkte -= 5;
            TracingFramework.printError("Das Attribut priority wurde durch die Methode setPriority nicht geändert");
        }
    }

    private Object getValueFromField(Object o, String name) {
        Field field;
        try {
            field = o.getClass().getDeclaredField(name);
            field.setAccessible(true);
            Object value = field.get(o);
            return value;
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            TracingFramework.printError("Das Attribut " + name + " wurde nicht gefunden");
        }
       return null;
    }

    private void setValueToField(Object o, String name, Object content) {
        Field field;
        try {
            field = o.getClass().getDeclaredField(name);
            field.setAccessible(true);
            field.set(o, content);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            TracingFramework.printError("Das Attribut " + name + " wurde nicht gefunden");
        }
    }
}
