package com.TeamD.demo.Controller;

import com.TeamD.demo.CaseUse.Staff.ListarStaff;
import com.TeamD.demo.Entity.Staff;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private ListarStaff listarStaff;

    public StaffRestController(ListarStaff listarStaff) {
        this.listarStaff = listarStaff;
    }


    @GetMapping("/")
    List<Staff>listar(){
        return listarStaff.getAll();
    }


}
