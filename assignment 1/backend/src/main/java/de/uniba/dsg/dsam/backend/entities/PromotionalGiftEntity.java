package de.uniba.dsg.dsam.backend.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue( value="PG" )
public class PromotionalGiftEntity extends IncentiveEntity implements Serializable {
    private String name;
    private String type;

    public PromotionalGiftEntity( int id, String name, String type  )
    {
        super( id );
        this.name = name;
        this.type = type;
    }
    public PromotionalGiftEntity( )
    {
        super( );
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
