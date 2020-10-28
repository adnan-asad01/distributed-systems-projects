package de.uniba.dsg.dsam.model;

import java.io.Serializable;

public abstract class Incentive implements Serializable {
    private int id;

    public Incentive(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Incentive() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
