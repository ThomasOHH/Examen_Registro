/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Model;

/**
 *
 * @author User
 */
public class Registro {

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getContactodeemergencia() {
        return contactodeemergencia;
    }

    public void setContactodeemergencia(String contactodeemergencia) {
        this.contactodeemergencia = contactodeemergencia;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getTipodesangre() {
        return tipodesangre;
    }

    public void setTipodesangre(String tipodesangre) {
        this.tipodesangre = tipodesangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    
    private String nombrecompleto;
    private String dni;
    private String residencia;
    private String contactodeemergencia;
    private String teléfono ;
    private String tipodesangre;
    private String alergias ;
    private int distancia ;
}
