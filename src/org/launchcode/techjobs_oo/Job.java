package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }



    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (getEmployer().getValue().equals("")) {
            this.employer = new Employer("Data not available");
        }
        if (getLocation().getValue().equals("")) {
            this.location = new Location("Data not available");
        }
        if (getPositionType().getValue().equals("")) {
            this.positionType = new PositionType("Data not available");
        }
        if (getCoreCompetency().getValue().equals("")) {
            this.coreCompetency = new CoreCompetency("Data not available");
        }
        if (getName().equals("")) {
            this.name = "Data not available";
        }


        String jobPosting = "\nID: " + this.id +
                "\nName: " + getName() +
                "\nEmployer: " + getEmployer().getValue() +
                "\nLocation: " + getLocation().getValue() +
                "\nPosition Type: " + getPositionType().getValue() +
                "\nCore Competency: " + getCoreCompetency().getValue() +
                "\n";
        return jobPosting;
    }


}
