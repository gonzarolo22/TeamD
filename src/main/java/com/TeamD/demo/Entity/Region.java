package com.TeamD.demo.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Señority señority;

    @ManyToOne
    private Especialidad especialidad;

    @ManyToOne
    private Staff staff;

    @OneToMany(mappedBy = "regions", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Staff>staff_r=new ArrayList<>();



}
