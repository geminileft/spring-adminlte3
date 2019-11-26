package com.example.springadminlte3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String taskName;
    private int percentComplete;

    private Task() {}

    @Override
    public String toString() {
        return String.format(
                "Task[id=%d, taskName='%s', percentComplete='%d']",
                id, taskName, percentComplete);
    }

    public long getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPercentComplete() {
        return percentComplete;
    }
}
