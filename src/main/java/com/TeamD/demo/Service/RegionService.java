package com.TeamD.demo.Service;

import com.TeamD.demo.Entity.Region;
import com.TeamD.demo.Repository.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    private RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    public Region crear(Region nueva){
        return regionRepository.save(nueva);
    }

    public List<Region>regiones(){
        return regionRepository.findAll();
    }



}
