package com.example.RobertsKunicins.My_App.models;

/**
 * Created by RobertsKunicins on 3/10/2017.
 */

public class Ssomething {
    private String name;
    private boolean check;
    private String description;

    public Ssomething(String name, boolean check, String description) {
        this.name = name;
        this.check = check;
        this.description = description;
    }

    public Ssomething(String name) {
        this.name = name;
        this.check = false;
        this.description = null;//???
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
