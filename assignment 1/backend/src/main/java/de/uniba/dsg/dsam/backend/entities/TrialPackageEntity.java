package de.uniba.dsg.dsam.backend.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@DiscriminatorValue(value = "TF")
public class TrialPackageEntity extends IncentiveEntity {

    private String name;
    private String type;


    public TrialPackageEntity(int id, String name, String type) {
        super(id);
        this.name = name;
        this.type = type;
    }

    public TrialPackageEntity() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
