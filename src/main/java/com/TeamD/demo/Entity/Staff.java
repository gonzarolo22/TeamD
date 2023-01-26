package com.TeamD.demo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(name = "region_id")
    private Integer regioId;

    private LocalDate creacion;

    @OneToMany(mappedBy = "staff")
    private List<Usurious> usurious;

    @ManyToOne
    @JoinColumn(name = "region_id", insertable = false, updatable = false)
    private Region region;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }
}