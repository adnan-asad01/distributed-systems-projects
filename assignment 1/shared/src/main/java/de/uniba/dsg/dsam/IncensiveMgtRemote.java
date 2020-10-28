package de.uniba.dsg.dsam;

import de.uniba.dsg.dsam.model.BeverageDTO;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;
import de.uniba.dsg.dsam.model.TrialPackageDTO;

import java.util.List;


public interface IncensiveMgtRemote {

    public List<Incentive> getAllIncentives();

    public void createPromotionalIncentive(PromotionalGiftDTO promotionalGiftDto);

    public void createTrialIncentive(TrialPackageDTO trialPackageDTO);


}

