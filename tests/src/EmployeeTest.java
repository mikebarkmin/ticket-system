import de.ddi.ticketsystem.Employee;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class EmployeeTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="compareTo")
    public void compareTo() {
        Employee e1 = new Employee("first","last",null,null);
        StaticMethods.setValueToField(e1, "firstName", "A");
        StaticMethods.setValueToField(e1, "lastName", "B");
        Employee e2 = new Employee("first","last",null,null);
        StaticMethods.setValueToField(e2, "firstName", "A");
        StaticMethods.setValueToField(e2, "lastName", "A");
        Employee e3 = new Employee("first","last",null,null);
        StaticMethods.setValueToField(e3, "firstName", "B");
        StaticMethods.setValueToField(e3, "lastName", "A");

        if (e1.compareTo(e2) > 0) {
            punkte += 4;
        } else {
            TracingFramework.printError("Der Vergleich zwischen AB und AA war falsch.");
        }

        if (e1.compareTo(e3) < 0) {
            punkte += 4;
        } else {
            TracingFramework.printError("Der Vergleich zwischen AB und BA war falsch.");
        }
    }
}
