package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    private static int id;

    private String value;

    public CoreCompetency() {
        this.id = JobField.id;

    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:



    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }


}
