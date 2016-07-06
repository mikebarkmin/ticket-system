package de.ddi.ticketsystem.logic;

import java.util.Date;

public class Note implements Saveable{
    private String title;
    private String content;
    private Employee employee;
    private Date creationDate;

    public Note(String title, String content, Employee employee) {
        this.title = title;
        this.content = content;
        this.employee = employee;
        creationDate = new Date();
    }

    public Note(String title, String content, Employee employee, Date creationDate) {
        this(title, content, employee);
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String saveToText() {
        String text = title + ";" + content + ";" + creationDate + ";";
        return text;
    }
}
