import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

import de.ddi.ticketsystem.Customer;

public class CustomerTest {

	int punkte = 0;
	
	public int getResult() {
		return punkte;
	}

    @Test(name="Konstruktor")
    public void constructor() {
        Customer customer = new Customer("Mike", "Barkmin", "m@b.de", "Paluno");
        String firstName = (String) StaticMethods.getValueFromField(customer, "firstName");
        if (firstName.equals("Mike")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut firstName nicht richtig gesetzt.");
        }
        String lastName = (String) StaticMethods.getValueFromField(customer, "lastName");
        if (lastName.equals("Barkmin")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut lastName nicht richtig gesetzt.");
        }
        String email = (String) StaticMethods.getValueFromField(customer, "email");
        if (email.equals("m@b.de")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut email nicht richtig gesetzt.");
        }
        String company = (String) StaticMethods.getValueFromField(customer, "company");
        if (company.equals("Paluno")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut company nicht richtig gesetzt.");
        }
    }

    @Test(name="Getter")
    public void getter() {
        Customer customer = new Customer("Mike", "Barkmin", "m@b.de", "Paluno");
        StaticMethods.setValueToField(customer, "firstName", "Gero");
        if (customer.getFirstName().equals("Gero")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getFirstName gibt einen falschen Wert zurück. Erwartet: Gero - Bekommen: " + customer.getFirstName());
        }
        StaticMethods.setValueToField(customer, "lastName", "Behler");
        if (customer.getLastName().equals("Behler")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getLastName gibt einen falschen Wert zurück. Erwartet: Behler - Bekommen: " + customer.getLastName());
        }
        StaticMethods.setValueToField(customer, "email", "g@b.de");
        if (customer.getEmail().equals("g@b.de")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getEmail gibt einen falschen Wert zurück. Erwartet: Behler - Bekommen: " + customer.getEmail());
        }
        StaticMethods.setValueToField(customer, "company", "DDI");
        if (customer.getCompany().equals("DDI")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getCompany gibt einen falschen Wert zurück. Erwartet: Behler - Bekommen: " + customer.getCompany());
        }
    }
}
