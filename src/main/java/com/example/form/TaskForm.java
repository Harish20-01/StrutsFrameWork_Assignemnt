package com.example.form;

import org.apache.struts.action.ActionForm;

public class TaskForm extends ActionForm {
    private String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}