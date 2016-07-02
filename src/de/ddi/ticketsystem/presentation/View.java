package de.ddi.ticketsystem.presentation;

import java.util.Scanner;

public abstract class View {
    protected Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public abstract void run();
}
