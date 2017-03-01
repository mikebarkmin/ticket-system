import de.ddi.ticketsystem.logic.UserManager;
import de.ddi.ticketsystem.logic.User;
import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class MalfunctionTicketTest {
	int punkte = 0;
	
	public int getResult() {
		return punkte;
	}

	@Test(name="constructor")
	public void constructor() {
		UserManager userManager = new UserManager();
		if(StaticMethods.getValueFromField(userManager, "users") != null) {
            punkte += 5;
        } else {
            TracingFramework.printError("Der Konstruktor initialisiert nicht das Attribut users");
        }
	}

	@Test(name="add")
    public void add() {
	    UserManager userManager = new UserManager();
        List<User> users = new List<>();
        User user1 = new Employee(null, null, null, null);
        User user2 = new Customer(null, null, null, null);
        StaticMethods.setValueToField(userManager, "users", users);

        userManager.add(user1);
        userManager.add(user2);

        users = (List<User>) StaticMethods.getValueFromField(userManager)
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
