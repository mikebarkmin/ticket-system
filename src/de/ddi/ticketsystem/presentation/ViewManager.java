package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.NoteManager;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import de.ddi.ticketsystem.data.DataException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Der ViewManager verwaltet die Benutzeransicht.
 */
public class ViewManager extends JFrame {

    private static final long serialVersionUID = 84329534615134532L;

    /**
     * UserManager
     */
    private UserManager userManager;
    /**
     * TicketManager
     */
    private TicketManager ticketManager;
    /**
     * NoteManager
     */
    private NoteManager noteManager;
    /**
     * Historie der aufgerufenen Views
     */
    private Stack<View> viewStack;
    /**
     * Scanner, um die Eingaben des Benutzer abzufangen
     */
    private Container container;

    /**
     * Erstellt eine Instanz zur Verwaltung verschiedener Anzeigen.
     * @param userManager Ein UserManager zum Zugriff auf die Nutzer
     * @param ticketManager Ein TicketManager zum Zugriff auf die Tickets
     * @param noteManager Ein NoteManager zum Zugriff auf die Notizen
     */
    public ViewManager(UserManager userManager, TicketManager ticketManager, NoteManager noteManager) {
        super("Ticketsystem");

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                String options[] = new String[] { "Speichern und beenden", "Beenden", "Abbrechen" };
                System.exit(0);
            }
        });
        this.userManager = userManager;
        this.ticketManager = ticketManager;
        this.noteManager = noteManager;

        this.setLayout(new BorderLayout());
        this.container = this.getContentPane();

        this.setJMenuBar(constructMenuBar());

        this.setPreferredSize(new Dimension(800, 600));
        this.pack();
        this.setVisible(true);
    }

    private JMenuBar constructMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenu = new JMenuItem("Save");
        saveMenu.addActionListener(e -> this.save());
        fileMenu.add(saveMenu);
        JMenuItem loadMenu = new JMenuItem("Load");
        loadMenu.addActionListener(e -> this.load());
        fileMenu.add(loadMenu);

        menuBar.add(fileMenu);

        JMenu navigationMenu = new JMenu("Navigation");
        JMenuItem logoutMenu = new JMenuItem("Logout");
        logoutMenu.addActionListener(e -> this.run());
        navigationMenu.add(logoutMenu);

        JMenuItem backMenu = new JMenuItem("Backwards");
        backMenu.addActionListener(e -> this.goBackwards());
        navigationMenu.add(backMenu);

        menuBar.add(navigationMenu);

        return menuBar;
    }

    public void goBackwards() {
        if (viewStack.size() > 1) {
            viewStack.pop();
            View view = viewStack.peek();
            showView(view);
        }
    }

    /**
     * Startet den ViewManager mit der Anzeige des Logins.
     */
    public void run() {
        load();
        userManager.logout();
        viewStack = new Stack<>();
        // erstelle einen LoginView und füge ihn dem ViewStack hinzu
        setNextView(new LoginView(this));
    }

    private void load() {
        try {
            userManager.load();
            noteManager.load();
            ticketManager.load();
        } catch (DataException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void save() {
        try {
            userManager.save();
            ticketManager.save();
            noteManager.save();
        } catch (DataException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Internal error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Einen View auf den ViewStack legen, sodass dieser als nächstes angezeigt wird.
     * @param view View
     */

    public void setNextView(View view) {
        viewStack.push(view);
        showView(view);
    }

    public void showView(View view) {
        container.removeAll();
        container.add(view.getHeader(), BorderLayout.NORTH);
        // Use optional Scrollpane, when body is too long.
        JScrollPane scrollPane = new JScrollPane(view.getBody());
        scrollPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        container.add(scrollPane, BorderLayout.CENTER);
        container.add(view.getMenu(), BorderLayout.SOUTH);
        repaint();
        revalidate();
    }

    /**
     * Gibt den UserManager zurück
     * @return UserManager
     */
    public UserManager getUserManager() {
        return userManager;
    }

    /**
     * Gibt den TicketManager zurück
     * @return TicketManager
     */
    public TicketManager getTicketManager() {
        return ticketManager;
    }

}
