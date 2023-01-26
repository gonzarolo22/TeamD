package com.TeamD.demo.Service;

import com.TeamD.demo.Entity.Señority;
import com.TeamD.demo.Repository.SeñorityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeñorityService {
    private SeñorityRepository señorityRepository;

    public SeñorityService(SeñorityRepository señorityRepository) {
        this.señorityRepository = señorityRepository;
    }


    public List<Señority>getAll(){
        return señorityRepository.findAll();
    }

}
