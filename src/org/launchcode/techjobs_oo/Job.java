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

    //getters and setters

    public int getId() {
        return id;
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

    //methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public String toString(){
        String jobId = Integer.toString(this.getId());
        String jobName = this.getName();
        String jobEmployer = String.valueOf(this.getEmployer());
        String jobLocation = String.valueOf(this.getLocation());
        String jobPositionType = String.valueOf(this.getPositionType());
        String jobCompetency = String.valueOf(getCoreCompetency());

        String[] jobInfo = {jobId, jobName, jobEmployer, jobLocation, jobPositionType, jobCompetency};
        for(int i = 0; i < jobInfo.length; i++){
            if (jobInfo[i].isBlank()){
                jobInfo[i] = "Data not available";
            }
        }

        return "\n ID: " + jobInfo[0] + "\n Name: " + jobInfo[1] + "\n Employer: " + jobInfo[2] + "\n Location: " + jobInfo[3] + "\n Position Type: " + jobInfo[4]
                + "\n Core Competency: " + jobInfo[5] + "\n";

    }

}
