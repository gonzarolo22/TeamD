package com.TeamD.demo.CaseUse;

import com.TeamD.demo.Entity.Region;
import com.TeamD.demo.Service.RegionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarRegion {
    private RegionService regionService;

    public ListarRegion(RegionService regionService) {
        this.regionService = regionService;
    }

    public List<Region>regiones(){
        return regionService.regiones();
    }

}
