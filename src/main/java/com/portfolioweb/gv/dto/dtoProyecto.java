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
public class dtoProyecto {
    @NotBlank
    private String nombrePro;
    @NotBlank
    private String descripPro;
    private String link;
    private int anio;
    private String imagen;

    public dtoProyecto(String nombrePro, String descripPro, String link, int anio, String imagen) {
        this.nombrePro = nombrePro;
        this.descripPro = descripPro;
        this.link = link;
        this.anio = anio;
        this.imagen = imagen;
    }

    public dtoProyecto() {
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripPro() {
        return descripPro;
    }

    public void setDescripPro(String descripPro) {
        this.descripPro = descripPro;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }




}
