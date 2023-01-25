package com.TeamD.demo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(length = 50, nullable = false)
    private String nombre;

    private LocalDate creacion;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "staff",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Region>region=new ArrayList<>();

    @OneToMany(mappedBy = "staff", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Especialidad> especialidad=new ArrayList<>();

   @ManyToOne
    private Region regions;


}
