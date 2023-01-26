package com.TeamD.demo.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "señority")
public class Señority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nivel", nullable = false)
    private String nivel;

    @Column(name = "region_id")
    private Integer regionId;

    @OneToMany(mappedBy = "señority")
    private List<Usurious> usurious;

    @ManyToOne
    @JoinColumn(name = "region_id", updatable = false, insertable = false)
    private Region region;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

