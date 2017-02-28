import de.ddi.ticketsystem.Customer;
import de.ddi.ticketsystem.Employee;
import de.ddi.ticketsystem.MalfunctionTicket;
import de.ddi.ticketsystem.Status;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class MalfunctionTicketTest {
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
        String deviceService = "dev";
		MalfunctionTicket t = new MalfunctionTicket(description, status, employee, customer, priority, deviceService);
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
		if (StaticMethods.getValueFromField(t, "deviceService") == deviceService) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut deviceService wird falsch gesetzt.");
		}
	}
	
	@Test(name="getter")
	public void getter() {
		String description = "des";
		Status status = Status.CLOSED;
		Employee employee = new Employee(null, null, null, null);
		Customer customer = new Customer(null, null, null, null);
		int priority = 1;
        String deviceService = "dev";
		MalfunctionTicket t = new MalfunctionTicket(description, status, employee, customer, priority, deviceService);
		StaticMethods.setValueToField(t, "description", description);
		StaticMethods.setValueToField(t, "status", status);
		StaticMethods.setValueToField(t, "employee", employee);
		StaticMethods.setValueToField(t, "customer", customer);
		StaticMethods.setValueToField(t, "priority", priority);
		StaticMethods.setValueToField(t, "deviceService", deviceService);
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
		if (t.getDeviceService()) == deviceService) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getDeviceService gibt ein falschen Wert zurück.");
		}
	}
}
