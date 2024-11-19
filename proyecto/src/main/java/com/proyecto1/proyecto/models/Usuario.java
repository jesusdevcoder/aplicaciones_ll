package com.proyecto1.proyecto.models;

public class Usuario {
    private Integer idCLi;
    private String nombre;
    private String apellidos;
    public Integer getIdCLi() {
        return idCLi;
    }
    public void setIdCLi(Integer idCLi) {
        this.idCLi = idCLi;
    }
    public String getNombre() {
        return nombre;
    }
    public Usuario(Integer idCLi, String nombre, String apellidos) {
        this.idCLi = idCLi;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    

}
