package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.MalfunctionTicket;
import de.ddi.ticketsystem.logic.OrderTicket;
import de.ddi.ticketsystem.logic.RequestTicket;
import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Ticket;
import java.awt.*;
import java.awt.BorderLayout;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class TicketsView extends View {

    private List<Ticket> tickets;
    private JPanel body;

    public TicketsView(ViewManager viewManager) {
        super(viewManager);
        tickets = viewManager.getTicketManager().getAll();
        body = new JPanel();
        updateBody();
    }

    @Override
    protected String getName() {
        return "Tickets";
    }

    private void updateBody() {
        body.removeAll();
        body.setLayout(new GridLayout(0, 2, 10, 10));
        tickets.forEach(ticket -> body.add(createTicketPanel(ticket)));
        body.revalidate();
    }

    @Override
    public JPanel getBody() {
        return body;
    }

    public JPanel createTicketPanel(Ticket ticket) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 5),
                BorderFactory.createEmptyBorder(5, 5, 10, 10)
            )
        );

        JPanel body = new JPanel();
        body.setLayout(new BoxLayout(body, BoxLayout.PAGE_AXIS));
        JLabel status = new JLabel(
            "Status: " + ticket.getStatus()
        );
        body.add(status);

        JLabel priority = new JLabel(
            "Priority: " + ticket.getPriority()
        );
        body.add(priority);

        body.add(new JLabel(
            ticket.getDescription().substring(0, ticket.getDescription().length() > 50 ? 50 : ticket.getDescription().length()) + "..."
        ));

        JPanel ticketMenu = new JPanel();

        JButton show = new JButton("show");
        show.addActionListener(e -> viewManager.setNextView(new TicketView(viewManager, ticket)));
        ticketMenu.add(show);

        JButton edit = new JButton("edit");
        ticketMenu.add(edit);

        JButton delete = new JButton("delete");
        ticketMenu.add(delete);

        panel.add(body, BorderLayout.CENTER);

        panel.add(ticketMenu, BorderLayout.SOUTH);
        return panel;
    }

    @Override
    public JPanel getMenu() {
        JPanel menu = new JPanel();

        JButton createTicket = new JButton("Create");
        menu.add(createTicket);

        JButton oldestTicket = new JButton("Oldest");
        oldestTicket.addActionListener(e -> {
            Ticket ticket = viewManager.getTicketManager().getOldest();
            viewManager.setNextView(new TicketView(viewManager, ticket));
        });
        menu.add(oldestTicket);

        JButton nextTicket = new JButton("Next");
        nextTicket.addActionListener(e -> {
            Ticket ticket = viewManager.getTicketManager().next();
            viewManager.setNextView(new TicketView(viewManager, ticket));
        });
        menu.add(nextTicket);

        JButton sort = new JButton("Sort");
        sort.addActionListener(e -> {
            String[] possibilities = {"Employee", "Customer", "Date", "Priority"};
            String s = (String) JOptionPane.showInputDialog(
                    body,
                    "Select a criteria for sorting the tickets",
                    "Sort Tickets",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    possibilities[0]);
            switch(s) {
                case "Employee":
                    tickets.sort((t1, t2) -> t1.getEmployee().compareTo(t2.getEmployee()));
                    break;
                case "Customer":
                    tickets.sort((t1, t2) -> t1.getCustomer().compareTo(t2.getCustomer()));
                    break;
                case "Date":
                    tickets.sort((t1, t2) -> t1.getCreationDate().compareTo(t2.getCreationDate()));
                    break;
                case "Priority":
                    tickets.sort((t1, t2) -> t1.getPriority() - t2.getPriority());
                    break;
            }
            updateBody();
        });
        menu.add(sort);

        return menu;
    }
}
