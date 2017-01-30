import util.BinaryTree;
import util.BinaryTreeNode;
import util.List;
import util.ListNode;

import de.ddi.ticketsystem.Employee;
import de.ddi.ticketsystem.Ticket;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class BinaryTreeTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="insert")
    public void insert() {
        BinaryTree<Employee,List<Ticket>> bt = this.generateBinaryTree();
        Employee employee = new Employee("Z","Z", null, null);
        List<Ticket> list = new List<>();
        bt.insert(employee, list);
        BinaryTreeNode<?,?> currBtn = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(bt, "root");
        do {
            Employee emp = (Employee) StaticMethods.getValueFromField(currBtn, "key");
            if (emp.compareTo(employee) > 0) {
               BinaryTreeNode<?,?> smaller = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(currBtn, "smaller");
               if (smaller != null) {
                   currBtn = smaller;
               } else {
                   TracingFramework.printError("Das Schlüssel Wert Paar wurde nicht richtig eingefügt.");
                   break;
               }
            } else if (emp.compareTo(employee) < 0) {
                BinaryTreeNode<?,?> larger = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(currBtn, "larger");
                if (larger != null) {
                    currBtn = larger;
                } else {
                   TracingFramework.printError("Das Schlüssel Wert Paar wurde nicht richtig eingefügt.");
                    break;
                }
            } else {
                punkte += 10;
                break;
            }
        } while (currBtn != null);
    }

    @Test(name="get") 
    public void get() {
        BinaryTree<Employee,List<Ticket>> bt = this.generateBinaryTree();
        Employee employee = new Employee("Z","Z", null, null);
        List<?> list = new List<>();
        BinaryTreeNode<?,?> newBtn = new BinaryTreeNode<>(employee, list);
        BinaryTreeNode<?,?> currBtn = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(bt, "root");
        do {
            Employee emp = (Employee) StaticMethods.getValueFromField(currBtn, "key");
            if (emp.compareTo(employee) > 0) {
               BinaryTreeNode<?,?> smaller = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(currBtn, "smaller");
               if (smaller != null) {
                   currBtn = smaller;
               } else {
                   StaticMethods.setValueToField(currBtn, "smaller", newBtn);
                   break;
               }
            } else if (emp.compareTo(employee) < 0) {
                BinaryTreeNode<?,?> larger = (BinaryTreeNode<?,?>) StaticMethods.getValueFromField(currBtn, "larger");
                if (larger != null) {
                    currBtn = larger;
                } else {
                    StaticMethods.setValueToField(currBtn, "larger", newBtn);
                    break;
                }
            } else {
                break;
            }
        } while (currBtn != null);

        if (bt.get(employee) == list) {
            punkte += 10;
        } else {
            TracingFramework.printError("Die Methode get gibt nicht den richtigen Wert zurück.");
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
