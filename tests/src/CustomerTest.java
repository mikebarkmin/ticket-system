import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

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
        if (lastName.equals("Status")) {
        	punkte += 1;
        } else {
            TracingFramework.printError("Im Konstruktor wird das Attribut status nicht richtig gesetzt.");
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
        if (customer.getLastName().equals("g@b.de")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getEmail gibt einen falschen Wert zurück. Erwartet: Behler - Bekommen: " + customer.getEmail());
        }
        StaticMethods.setValueToField(customer, "company", "DDI");
        if (customer.getLastName().equals("DDI")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getCompany gibt einen falschen Wert zurück. Erwartet: Behler - Bekommen: " + customer.getCompany());
        }
    }

    @Test(name="Setter")
    public void setter() {
        Customer customer = new Customer("Mike", "Barkmin", "m@b.de", "Paluno");
        customer.setCompany("DDI");
        String company = (String) StaticMethods.getValueFromField(customer, "company");
        if(company.equals("DDI")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut company wurde durch die Methode setCompany nicht geändert");
        }
        customer.setFirstName("Gero");
        String firstName = (String) StaticMethods.getValueFromField(customer, "firstName");
        if(firstName.equals("Gero")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut firstName wurde durch die Methode setFirstName nicht geändert");
        }
        customer.setLastName("Behler");
        String lastName = (String) StaticMethods.getValueFromField(customer, "lastName");
        if(lastName.equals("Behler")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut lastName wurde durch die Methode setLastName nicht geändert");
        }
        customer.setEmail("g@b.de");
        String email = (String) StaticMethods.getValueFromField(customer, "email");
        if(email.equals("g@b.de")) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut email wurde durch die Methode setEmail nicht geändert");
        }
    }
}
