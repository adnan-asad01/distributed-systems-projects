package de.uniba.dsg.dsam.backend.beans;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import de.uniba.dsg.dsam.BeverageMgtRemote;
import de.uniba.dsg.dsam.backend.entities.BeverageEntity;
import de.uniba.dsg.dsam.backend.entities.PromotionalGiftEntity;
import de.uniba.dsg.dsam.model.BeverageDTO;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;

import java.util.ArrayList;
import java.util.List;
@Stateless
@Remote(BeverageMgtRemote.class)
public class BeverageManagementBean implements BeverageMgtRemote {

    @PersistenceContext(type = PersistenceContextType.TRANSACTION, unitName = "anran")
    EntityManager em;

    /**
     * Default constructor.
     */
    public BeverageManagementBean() {
    }


    @Override
    public List<BeverageDTO> getAllBeverage() {
        return null;
    }

    @Override
    public void insertBeverage(BeverageDTO beverageDTO) {

    }

    @Override
    public void createBeverage(BeverageDTO beverageDTO) {
        BeverageEntity r = new BeverageEntity();
        PromotionalGiftEntity promotionalGiftEntity = new PromotionalGiftEntity();
        promotionalGiftEntity.setId(12);
        r.setIncentive(promotionalGiftEntity);
        r.setName(beverageDTO.getName());
        r.setManufacturer(beverageDTO.getManufacturer());
        r.setPrice(beverageDTO.getPrice());
        r.setQuantity(beverageDTO.getQuantity());
        em.persist(r);
        System.out.println("insert info");
    }


}
