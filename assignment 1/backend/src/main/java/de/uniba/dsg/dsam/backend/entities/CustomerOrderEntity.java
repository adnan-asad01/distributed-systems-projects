package de.uniba.dsg.dsam.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerOrderEntity {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
