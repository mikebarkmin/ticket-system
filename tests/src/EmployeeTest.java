import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

import de.ddi.ticketsystem.Employee;

public class EmployeeTest {

	int punkte = 0;
	
	public int getResult() {
		return punkte;
	}
	
	@Test(name="Konstruktor")
    public void constructor() {
		Employee employee = new Employee("Karl", "Meier", "karl.meier@abc.de", "IT");
        String firstName = (String) StaticMethods.getValueFromField(employee, "firstName");
        if (firstName.equals("Karl")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut firstName nicht richtig gesetzt.");
        }
        String lastName = (String) StaticMethods.getValueFromField(employee, "lastName");
        if (lastName.equals("Meier")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut lastName nicht richtig gesetzt.");
        }
        String email = (String) StaticMethods.getValueFromField(employee, "email");
        if (email.equals("karl.meier@abc.de")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut email nicht richtig gesetzt.");
        }
        String department = (String) StaticMethods.getValueFromField(employee, "department");
        if (department.equals("IT")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut department nicht richtig gesetzt.");
        }
    }
	
	@Test(name="Getter")
    public void getter() {
        Employee employee = new Employee("Karl", "Meier", "karl.meier@abc.de", "IT");
        StaticMethods.setValueToField(employee, "firstName", "Carla");
        if (employee.getFirstName().equals("Carla")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getFirstName gibt einen falschen Wert zurück. Erwartet: Carla - Bekommen: " + employee.getFirstName());
        }
        StaticMethods.setValueToField(employee, "lastName", "Meyer");
        if (employee.getLastName().equals("Meyer")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getLastName gibt einen falschen Wert zurück. Erwartet: Meyer - Bekommen: " + employee.getLastName());
        }
        StaticMethods.setValueToField(employee, "email", "carla@meyer@fgh.ij");
        if (employee.getEmail().equals("carla@meyer@fgh.ij")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getEmail gibt einen falschen Wert zurück. Erwartet: carla@meyer@fgh.ij - Bekommen: " + employee.getEmail());
        }
        StaticMethods.setValueToField(employee, "department", "IT-Sicherheit");
        if (employee.getDepartment().equals("IT-Sicherheit")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getDepartment gibt einen falschen Wert zurück. Erwartet: IT-Sicherheit - Bekommen: " + employee.getDepartment());
        }
    }
}
