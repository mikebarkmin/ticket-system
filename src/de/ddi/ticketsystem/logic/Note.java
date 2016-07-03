package de.ddi.ticketsystem.logic;

import java.util.Date;

public class Note {
    private String title;
    private String content;
    private Employee employee;
    private Date creationDate;

    public Note(String title, String content, Employee employee) {
        this.title = title;
        this.content = content;
        this.employee = employee;
        this.creationDate = new Date();
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
}
