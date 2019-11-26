package com.example.springadminlte3.models;

public class TaskEntry {

    public long id;
    public String taskName;
    public int percentComplete;
    public String statusLevel;

    public TaskEntry(long id, String taskName, int percentComplete) {
        this.id = id;
        this.taskName = taskName;
        this.percentComplete = percentComplete;
        statusLevel = "danger";
        if (this.percentComplete >= 100) {
            statusLevel = "primary";
        } else if (this.percentComplete >= 90) {
            statusLevel = "success";
        } else if (this.percentComplete >= 70) {
            statusLevel = "warning";
        }
        this.statusLevel = statusLevel;
    }

}
