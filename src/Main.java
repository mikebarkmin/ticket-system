public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", "Barkmin", "mb@company.de", "IT");
        Customer customer = new Customer("Gero", "Behler", "gb@uni.de", "Uni Due");

        int priority = 1;

        Ticket ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                priority);

        // Was wird ausgeben?
        customer.setFirstName("Karl");
        System.out.println(customer.getFirstName());
        System.out.println(ticket.getCustomer().getFirstName());

        priority = 2;
        System.out.println(priority);
        System.out.println(ticket.getPriority());
    }
}
