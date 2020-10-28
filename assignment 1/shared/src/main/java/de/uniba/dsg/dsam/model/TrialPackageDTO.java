package de.uniba.dsg.dsam.model;

import java.io.Serializable;

public class TrialPackageDTO extends Incentive implements Serializable {
    public TrialPackageDTO(int id, String name, String type) {
        super(id, name, type);
    }
    public TrialPackageDTO() {
        //super();
    }
}
