/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioweb.gv.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author vicoe
 */
public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripExp;
    @NotBlank
    private String lugar;
    
    private int fechaInicio;
    private int fechaFin;
    private String imagen;

    //constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descripExp, String lugar, int fechaInicio, int fechaFin, String imagen) {
        this.nombreExp = nombreExp;
        this.descripExp = descripExp;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.imagen = imagen;
    }

        //getter and setter

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {    
        this.lugar = lugar;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripExp() {
        return descripExp;
    }

    public void setDescripExp(String descripExp) {
        this.descripExp = descripExp;
    }
    
    

}
