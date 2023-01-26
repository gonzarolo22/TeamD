package com.TeamD.demo.Controller;

import com.TeamD.demo.CaseUse.Señority.ListarSeñority;
import com.TeamD.demo.Entity.Señority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/señority")
public class SeñorityRestController {
    private ListarSeñority listarSeñority;

    public SeñorityRestController(ListarSeñority listarSeñority) {
        this.listarSeñority = listarSeñority;
    }

    @GetMapping("/")
    List<Señority>listar(){
        return listarSeñority.getAll();
    }
}
