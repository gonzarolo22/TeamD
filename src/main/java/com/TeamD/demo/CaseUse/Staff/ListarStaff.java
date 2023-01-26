package com.TeamD.demo.CaseUse.Staff;

import com.TeamD.demo.Entity.Staff;
import com.TeamD.demo.Service.StaffService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarStaff {
    private StaffService staffService;

    public ListarStaff(StaffService staffService) {
        this.staffService = staffService;
    }

    public List<Staff>getAll(){
        return staffService.getAll();
    }


}
