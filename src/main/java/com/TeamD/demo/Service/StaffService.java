package com.TeamD.demo.Service;

import com.TeamD.demo.Entity.Staff;
import com.TeamD.demo.Repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff>getAll(){
        return staffRepository.findAll();
    }



}
