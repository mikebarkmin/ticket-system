import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.Employee;
import util.List;
import util.ListNode;
import util.BinaryTree;
import util.BinaryTreeNode;
import de.ddi.ticketsystem.TicketManager;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketManagerTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }
    // bla
    @Test(name="Konstruktor")
    public void constructur() {
        TicketManager ticketManager = new TicketManager();
        if (StaticMethods.getValueFromField(ticketManager, "tickets") != null) {
            punkte += 5;
        } else {
            TracingFramework.printError("Der Konstruktor initialisiert nicht das Attribut tickets");
        }
        if (StaticMethods.getValueFromField(ticketManager, "ticketsByEmployee") != null) {
            punkte += 5;
        } else {
            TracingFramework.printError("Der Konstruktor initialisiert nicht das Attribut ticketsByEmployee");
        }
    }

    @Test(name="add")
    public void add() {
        TicketManager ticketManager = new TicketManager();
        List<Ticket> tickets = new List<Ticket>();
        BinaryTree<Employee, List<Ticket>> ticketsByEmployee = new BinaryTree<>();
        Employee employee = new Employee(null, null, null, null);
        StaticMethods.setValueToField(employee, "firstName", "Dum");
        StaticMethods.setValueToField(employee, "lastName", "Tum");
        Ticket ticket1 = new Ticket(null, null, employee, null, 3);
        StaticMethods.setValueToField(ticketManager, "tickets", tickets);
        StaticMethods.setValueToField(ticketManager, "ticketsByEmployee", ticketsByEmployee);

        ticketManager.add(ticket1);

        List<?> t = (List<?>) StaticMethods.getValueFromField(ticketManager, "tickets");
        ListNode<?> head = (ListNode<?>) StaticMethods.getValueFromField(t, "head");
        Object value = StaticMethods.getValueFromField(head, "value");
        if (value == ticket1) {
            punkte += 6;
        } else {
            TracingFramework.printError("Die Methode add hat das Ticket nicht zur Liste hinzugefügt.");
            return;
        }
        BinaryTreeNode<?,?> root = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(ticketsByEmployee, "root");
        List<?> employeeTickets = (List<?>) StaticMethods.getValueFromField(root, "value");
        Object curr = StaticMethods.getValueFromField(employeeTickets, "head");
        punkte -= 6;
        boolean found = false;
        while (curr != null) {
            if (StaticMethods.getValueFromField(curr, "value") == ticket1) {
                punkte += 6;
                found = true;
                return;
            }
            curr = StaticMethods.getValueFromField(curr, "next");
        }
        if (!found) {
            TracingFramework.printError("Die Methode add hat das Ticket nicht zum Binärbaum hinzugefügt.");
        }
    }

    @Test(name="getFromEmployee")
    public void getFromEmployee() {
        TicketManager ticketManager = new TicketManager();
        BinaryTree<Employee, List<Ticket>> bt = generateBinaryTree();
        StaticMethods.setValueToField(ticketManager, "ticketsByEmployee", bt);
        Object root = StaticMethods.getValueFromField(bt, "root");
        Object smaller = StaticMethods.getValueFromField(root, "smaller");
        Employee employee = (Employee) StaticMethods.getValueFromField(smaller, "key");

        List<Ticket> tickets = ticketManager.getFromEmployee(employee);
        Object curr = StaticMethods.getValueFromField(tickets, "head");
        punkte += 10;
        while (curr != null) {
            Object value = StaticMethods.getValueFromField(curr, "value");
            if (StaticMethods.getValueFromField(value, "employee") != employee) {
                punkte -= 10;
                TracingFramework.printError("Die Methode getFromEmployee gibt eine falsche Liste zurück");
                break;
            }
            curr = StaticMethods.getValueFromField(curr, "next");
        }
    }

    private BinaryTree<Employee,List<Ticket>> generateBinaryTree() {
        Employee[] employees = new Employee[7];
        employees[0] = new Employee("z","a",null,null);
        StaticMethods.setValueToField(employees[0], "firstName", "z");
        StaticMethods.setValueToField(employees[0], "lastName", "a");
        employees[1] = new Employee("A","A",null,null);
        StaticMethods.setValueToField(employees[1], "firstName", "A");
        StaticMethods.setValueToField(employees[1], "lastName", "A");
        employees[2] = new Employee("A","B",null,null);
        StaticMethods.setValueToField(employees[2], "firstName", "A");
        StaticMethods.setValueToField(employees[2], "lastName", "B");
        employees[3] = new Employee("A","C",null,null);
        StaticMethods.setValueToField(employees[3], "firstName", "A");
        StaticMethods.setValueToField(employees[3], "lastName", "C");
        employees[4] = new Employee("A","D",null,null);
        StaticMethods.setValueToField(employees[4], "firstName", "A");
        StaticMethods.setValueToField(employees[4], "lastName", "D");
        employees[5] = new Employee("A","E",null,null);
        StaticMethods.setValueToField(employees[5], "firstName", "A");
        StaticMethods.setValueToField(employees[5], "lastName", "E");
        employees[6] = new Employee("A","F",null,null);
        StaticMethods.setValueToField(employees[6], "firstName", "A");
        StaticMethods.setValueToField(employees[6], "lastName", "F");

        BinaryTree<Employee, List<Ticket>> ticketsByEmployee = new BinaryTree<>();
        for (int i = 0; i < employees.length; i++) {
            BinaryTreeNode<Employee, List<Ticket>> btn = new BinaryTreeNode<>(null, null);
            List<Ticket> tickets = new List<>();
            for (int k = 0; k <= i; k++) {
                Ticket ticket = new Ticket(null, null, employees[i], null, 0);
                Object curr = StaticMethods.getValueFromField(tickets, "head");
                if (curr == null) {
                    ListNode<Ticket> ln = new ListNode<>();
                    ln.setValue(ticket);
                    StaticMethods.setValueToField(tickets, "head", ln);
                } else {
                    while (StaticMethods.getValueFromField(curr, "next") != null) {
                        curr = StaticMethods.getValueFromField(curr, "next");
                    }
                    ListNode<Ticket> ln = new ListNode<>();
                    ln.setValue(ticket);
                    StaticMethods.setValueToField(curr, "next", ln);
                }
            }
            StaticMethods.setValueToField(btn, "value", tickets);
            StaticMethods.setValueToField(btn, "key", employees[i]);
            Object curr = StaticMethods.getValueFromField(ticketsByEmployee, "root");
            if (curr == null) {
                StaticMethods.setValueToField(ticketsByEmployee, "root", btn);
            } else {
                do {
                    Employee key = (Employee) StaticMethods.getValueFromField(curr, "key");
                    String currName = (String) StaticMethods.getValueFromField(key, "firstName") + (String) StaticMethods.getValueFromField(key, "lastName");
                    String name = (String) StaticMethods.getValueFromField(employees[i], "firstName") + (String) StaticMethods.getValueFromField(employees[i], "lastName");
                    if (currName.compareTo(name) < 0) {
                        if(StaticMethods.getValueFromField(curr, "larger") == null) {
                            StaticMethods.setValueToField(curr, "larger", btn);
                            break;
                        } else {
                            curr = StaticMethods.getValueFromField(curr, "larger");
                        }
                    } else if (currName.compareTo(name) > 0) {
                        if(StaticMethods.getValueFromField(curr, "smaller") == null) {
                            StaticMethods.setValueToField(curr, "smaller", btn);
                            break;
                        } else {
                            curr = StaticMethods.getValueFromField(curr, "smaller");
                        }
                    }
                } while(curr != null);
            }
        }
        return ticketsByEmployee;
    }
}
