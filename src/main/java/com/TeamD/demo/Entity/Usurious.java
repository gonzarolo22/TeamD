package com.TeamD.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usurious")
public class Usurious {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;



    @Column(name = "Email")
    private String email;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "region_id")
    private Integer regionID;

    @Column(name = "señority_id")
    private Integer señoritiId;

    @Column(name = "staff_id")
    private Integer staffId;

    @ManyToOne
    @JoinColumn(name = "region_id",updatable = false, insertable = false)
    private Region region;

    



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getRegionID() {
        return regionID;
    }

    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    public Integer getSeñoritiId() {
        return señoritiId;
    }

    public void setSeñoritiId(Integer señoritiId) {
        this.señoritiId = señoritiId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}






