package de.uniba.dsg.dsam.model;


import java.io.Serializable;

public class PromotionalGiftDTO extends Incentive implements Serializable {

//    int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public PromotionalGiftDTO(int id, String name, String type) {
        super(id, name, type);

    }

    public PromotionalGiftDTO() {
        //super();
    }

}
