package com.TeamD.demo.CaseUse;

import com.TeamD.demo.Entity.Region;
import com.TeamD.demo.Service.RegionService;
import org.springframework.stereotype.Component;

@Component
public class CreateRegion {
    private RegionService regionService;

    public CreateRegion(RegionService regionService) {
        this.regionService = regionService;
    }

    public Region create(Region nueva){
        return regionService.crear(nueva);
    }

}
