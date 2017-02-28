import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.OrderTicket;
import de.ddi.ticketsystem.logic.Status;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class OrderTicketTest {
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
        String vendor = "ven";
        String article = "art";
        String address = "add";
        int quantity = 0;
		OrderTicket ot = new OrderTicket(description, status, employee, customer, priority, vendor, article, address, quantity);
		if (StaticMethods.getValueFromField(ot, "description") == description) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut description wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(ot, "status") == status) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut status wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(ot, "employee") == employee) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut employee wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(ot, "customer") == customer) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut customer wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(ot, "vendor") == vendor) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut vendor wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(ot, "article") == article) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut article wird falsch gesetzt.");
		}
		if (StaticMethods.getValueFromField(ot, "address") == address) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut address wird falsch gesetzt.");
		}
		if ((int) StaticMethods.getValueFromField(ot, "quantity") == quantity) {
			punkte += 1;
		} else {
			TracingFramework.printError("Das Attribut quantity wird falsch gesetzt.");
		}
	}
	
	@Test(name="getter")
	public void getter() {
		String description = "des";
		Status status = Status.CLOSED;
		Employee employee = new Employee(null, null, null, null);
		Customer customer = new Customer(null, null, null, null);
		int priority = 1;
        String vendor = "ven";
        String article = "art";
        String address = "add";
        int quantity = 0;
		OrderTicket ot = new OrderTicket(description, status, employee, customer, priority, vendor, article, address, quantity);
		StaticMethods.setValueToField(ot, "description", description);
		StaticMethods.setValueToField(ot, "status", status);
		StaticMethods.setValueToField(ot, "employee", employee);
		StaticMethods.setValueToField(ot, "customer", customer);
		StaticMethods.setValueToField(ot, "priority", priority);
		StaticMethods.setValueToField(ot, "vendor", vendor);
		StaticMethods.setValueToField(ot, "article", article);
		StaticMethods.setValueToField(ot, "address", address);
		StaticMethods.setValueToField(ot, "quantity", quantity);
		if (ot.getDescription() == description) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getDescription gibt ein falschen Wert zurück.");
		}
		if (ot.getStatus() == status) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getStatus gibt ein falschen Wert zurück.");
		}
		if (ot.getEmployee() == employee) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getEmployee gibt ein falschen Wert zurück.");
		}
		if (ot.getCustomer() == customer) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getCustomer gibt ein falschen Wert zurück.");
		}
		if (ot.getPriority() == priority) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getPriority gibt ein falschen Wert zurück.");
		}
		if (ot.getVendor()) == vendor) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getVendor gibt ein falschen Wert zurück.");
		}
		if (ot.getArticle() == article) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getArticle gibt ein falschen Wert zurück.");
		}
		if (ot.getAddress() == address) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getAddress gibt ein falschen Wert zurück.");
		}
		if (ot.getQuantity() == quantity) {
			punkte += 1;
		} else {
			TracingFramework.printError("Die Methode getQuantity gibt ein falschen Wert zurück.");
		}
	}
}
