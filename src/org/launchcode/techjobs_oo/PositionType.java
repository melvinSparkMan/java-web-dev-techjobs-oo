package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField{




    public PositionType() {
        id = JobField.getId();
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.


    @Override
    public String toString() {
        return value;
    }

}
