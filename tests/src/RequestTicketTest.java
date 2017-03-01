import java.util.Date;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.RequestTicket;
import de.ddi.ticketsystem.logic.Status;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class RequestTicketTest {
	int punkte = 0;
	
	public int getResult() {
		return punkte;
	}
	
	@Test(name="constructor")
	public void constructor() {
		String description = "des";
		Status status = Status.CLOSED;
		Employee employee = new Employee(null, null, null, null);
		Customer customer = new Customer(null, null, null, null);
		int priority = 1;
        String service = "dev";
        Date date = new Date();
		RequestTicket t = new RequestTicket(description, status, employee, customer, priority, date, service);
		if (StaticMethods.getValueFromField(t, "description") == description) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut description wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(t, "status") == status) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut status wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(t, "employee") == employee) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut employee wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(t, "customer") == customer) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut customer wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(t, "service") == service) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut service wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(t, "date") == date) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut date wird falsch gesetzt.");
		}
	}
	
	@Test(name="getter")
	public void getter() {
		String description = "des";
		Status status = Status.CLOSED;
		Employee employee = new Employee(null, null, null, null);
		Customer customer = new Customer(null, null, null, null);
		int priority = 1;
        String service = "dev";
        Date date = new Date();
		RequestTicket t = new RequestTicket(description, status, employee, customer, priority, date, service);
		StaticMethods.setValueToField(t, "description", description);
		StaticMethods.setValueToField(t, "status", status);
		StaticMethods.setValueToField(t, "employee", employee);
		StaticMethods.setValueToField(t, "customer", customer);
		StaticMethods.setValueToField(t, "priority", priority);
		StaticMethods.setValueToField(t, "service", service);
		StaticMethods.setValueToField(t, "date", date);
		if (t.getDescription() == description) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getDescription gibt ein falschen Wert zurück.");
		}
		if (t.getStatus() == status) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getStatus gibt ein falschen Wert zurück.");
		}
		if (t.getEmployee() == employee) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getEmployee gibt ein falschen Wert zurück.");
		}
		if (t.getCustomer() == customer) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getCustomer gibt ein falschen Wert zurück.");
		}
		if (t.getPriority() == priority) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getPriority gibt ein falschen Wert zurück.");
		}
		if (t.getService() == service) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getService gibt ein falschen Wert zurück.");
		}
		if (t.getDate() == date) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getDate gibt ein falschen Wert zurück.");
		}
	}
}
