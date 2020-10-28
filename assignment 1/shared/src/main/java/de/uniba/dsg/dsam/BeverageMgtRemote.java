package de.uniba.dsg.dsam;

import de.uniba.dsg.dsam.model.BeverageDTO;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;
import de.uniba.dsg.dsam.model.TrialPackageDTO;


import java.util.List;


public interface BeverageMgtRemote {

    public List<BeverageDTO> getAllBeverage();

    public void insertBeverage(BeverageDTO beverageDTO);

    public void createBeverage(BeverageDTO beverageDTO);

}

