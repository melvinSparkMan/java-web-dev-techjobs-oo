package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    public static int id;
    public static int nextId;
    public String value;

    public JobField(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public static int getId() {
//        id = nextId;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return JobField.nextId;
    }



    public static void setNextId(int aNextId) {
        JobField.nextId = aNextId;
        JobField.id = JobField.nextId++;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
