package com.TeamD.demo.Repository;

import com.TeamD.demo.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository< Staff, Integer> {
}
