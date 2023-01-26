package com.TeamD.demo.Controller;

import com.TeamD.demo.CaseUse.CreateRegion;
import com.TeamD.demo.CaseUse.ListarRegion;
import com.TeamD.demo.Entity.Region;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/region")
public class RegionRestController {
    private CreateRegion createRegion;
    private ListarRegion listarRegion;

    public RegionRestController(CreateRegion createRegion, ListarRegion listarRegion) {


        this.listarRegion = listarRegion;
    }

    @GetMapping("/")
    List<Region>listaRegiones(){
       return listarRegion.regiones();
    }


    

}
