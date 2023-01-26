package com.TeamD.demo.CaseUse.Señority;

import com.TeamD.demo.Entity.Señority;
import com.TeamD.demo.Service.SeñorityService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarSeñority {
    private SeñorityService señorityService;

    public ListarSeñority(SeñorityService señorityService) {
        this.señorityService = señorityService;
    }

    public List<Señority>getAll(){
        return señorityService.getAll();
    }
}
