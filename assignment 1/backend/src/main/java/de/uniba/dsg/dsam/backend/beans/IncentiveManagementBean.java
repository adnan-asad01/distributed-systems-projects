package de.uniba.dsg.dsam.backend.beans;

import de.uniba.dsg.dsam.IncensiveMgtRemote;
import de.uniba.dsg.dsam.backend.entities.PromotionalGiftEntity;
import de.uniba.dsg.dsam.backend.entities.TrialPackageEntity;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;
import de.uniba.dsg.dsam.model.TrialPackageDTO;


import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Remote(IncensiveMgtRemote.class)
public class IncentiveManagementBean implements IncensiveMgtRemote {
    @PersistenceContext(type = PersistenceContextType.TRANSACTION, unitName = "anran")
    EntityManager em;


    @Transactional
    @Override
    public List<Incentive> getAllIncentives() {
        List<TrialPackageEntity> rooms = em.createNamedQuery("getTrialList").getResultList();
        return convert(rooms);
    }

    @Transactional
    @Override
    public void createPromotionalIncentive(PromotionalGiftDTO promotionalGiftDto) {
        PromotionalGiftEntity r = new PromotionalGiftEntity();
        r.setName(promotionalGiftDto.getName());
        r.setId(87);
        em.detach(r);
        System.out.println("insert info" + promotionalGiftDto.getName());

    }

    @Transactional
    @Override
    public void createTrialIncentive(TrialPackageDTO trialPackageDTO) {
        TrialPackageEntity r = new TrialPackageEntity();
        r.setName(trialPackageDTO.getName());
        // r.setId(13);
        em.persist(r);
        System.out.println("Trial info" + trialPackageDTO.getName());
    }

    private List<Incentive> convert(List<TrialPackageEntity> rooms) {
        List<Incentive> ret = new ArrayList<>();
        if (rooms != null) {
            for (TrialPackageEntity r : rooms) {
                ret.add(convert(r));
            }
        }
        return ret;
    }

    private Incentive convert(TrialPackageEntity r) {
        return new TrialPackageDTO(r.getId(), r.getName(), r.getType());
    }

}
