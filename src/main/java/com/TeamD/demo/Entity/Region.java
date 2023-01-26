package com.TeamD.demo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pais")
    private String pais;

    @OneToMany(mappedBy = "region")
    private List<Usurious> usurious;

    @OneToMany(mappedBy = "region")
    private List<Señority>señorities;

    @OneToMany(mappedBy = "region")
    private List<Staff>staff;

    public List<Usurious> getUsurious() {
        return usurious;
    }

    public void setUsurious(List<Usurious> usurious) {
        this.usurious = usurious;
    }

    public List<Señority> getSeñorities() {
        return señorities;
    }

    public void setSeñorities(List<Señority> señorities) {
        this.señorities = señorities;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }




}







