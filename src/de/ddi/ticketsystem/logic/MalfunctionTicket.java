package de.ddi.ticketsystem.logic;

public class MalfunctionTicket extends Ticket {
    private String deviceService;

    public MalfunctionTicket(String description, Status status, Employee employee, Customer customer, int priority, String deviceService) {
        super(description, status, employee, customer, priority);
        this.deviceService = deviceService;
    }

    public String getDeviceService() {
        return deviceService;
    }

    @Override
    public String saveToText() {
        String text = "MALFUNCTION;";
        text += super.saveToText();
        text += this.deviceService + ";";
        return text;
    }
}
