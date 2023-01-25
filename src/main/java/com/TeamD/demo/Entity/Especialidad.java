package com.TeamD.demo.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "name")
    private String nombre;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "especialidad", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Region> region=new ArrayList<>();

   @ManyToOne
    private Staff staff;

}