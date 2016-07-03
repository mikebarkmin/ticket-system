package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;

public abstract class Manager {
    protected Access access;

    protected Manager(Access access) {
        this.access = access;
    }

    public abstract void save();

    protected abstract void load();
}
