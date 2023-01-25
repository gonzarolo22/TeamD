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

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "señority", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Region> region =new ArrayList<>();
}
