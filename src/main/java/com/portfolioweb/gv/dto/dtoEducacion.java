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
public class dtoEducacion {
    
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String institucion;
    @NotBlank
    private String ubicacion;
    @NotBlank
    private int fechaInicio;
    
    private int fechaFin;
    
    private String imagen;

    public dtoEducacion(String nombreEdu, String institucion, String ubicacion, int fechaInicio, int fechaFin, String imagen) {
        this.nombreEdu = nombreEdu;
        this.institucion = institucion;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.imagen = imagen;
    }

    public dtoEducacion() {
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
    
    
    
}
