package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(String value) {
        this();
        this.value = value;
    }

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }
}
