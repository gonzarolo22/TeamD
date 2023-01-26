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

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "Email")
    private String email;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "region_id")
    private Integer regionID;

    @Column(name = "señority_id")
    private Integer señoritiId;

    @Column(name = "especialidad_id")
    private String especialidadId;

    @Column(name = "staff_id")
    private Integer staffId;

    @ManyToOne
    @JoinColumn(name = "region_id",updatable = false, insertable = false)
    private Region region;

    @ManyToOne
    @JoinColumn(name = "señority_id", updatable = false, insertable = false)
    private Señority señority;



    @ManyToOne
    @JoinColumn(name = "staff_id", insertable = false, updatable = false)
    private Staff staff;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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

    public String getEspecialidadId() {
        return especialidadId;
    }

    public void setEspecialidadId(String especialidadId) {
        this.especialidadId = especialidadId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}






