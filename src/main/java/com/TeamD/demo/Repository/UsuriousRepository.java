package com.TeamD.demo.Repository;

import com.TeamD.demo.Entity.Usurious;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuriousRepository extends JpaRepository<Usurious,Integer> {
}
