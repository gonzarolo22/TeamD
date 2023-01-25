package com.TeamD.demo.Repository;

import com.TeamD.demo.Entity.Señority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeñorityRepository extends JpaRepository<Señority,Integer> {
}
