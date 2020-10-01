package com.project.offer.tasksetter.entities;


import java.io.Serializable;

public class SpamTask {

    private String spamTaskTheme;
    private String spamTaskText;

    public SpamTask() {
    }

    public SpamTask(String spamTaskTheme, String spamTaskText) {
        this.spamTaskTheme = spamTaskTheme;
        this.spamTaskText = spamTaskText;
    }

    public String getSpamTaskTheme() {
        return spamTaskTheme;
    }

    public void setSpamTaskTheme(String spamTaskTheme) {
        this.spamTaskTheme = spamTaskTheme;
    }

    public String getSpamTaskText() {
        return spamTaskText;
    }

    public void setSpamTaskText(String spamTaskText) {
        this.spamTaskText = spamTaskText;
    }
}
