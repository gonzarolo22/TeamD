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

    @ManyToOne
    private Region regions;

    public Staff() {
    }

    public Staff(int id, String nombre, LocalDate creacion, Usuario usuario, List<Region> region, Region regions) {
        this.id = id;
        this.nombre = nombre;
        this.creacion = creacion;
        this.usuario = usuario;
        this.region = region;
        this.regions = regions;
    }
}
