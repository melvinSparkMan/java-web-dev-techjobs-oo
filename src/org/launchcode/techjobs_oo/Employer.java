package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField{

    private String value;

    public Employer() {

    }

    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

}
