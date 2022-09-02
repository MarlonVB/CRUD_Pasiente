/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author velez
 */
public class Paciente {
    private String cedual, nombre, apellido, edad, estado_civil, tipo_sangre, peso, talla, historia_clinica, sexo, patologia, fecha_nac, telefono, direccion;

    public Paciente(String cedual, String nombre, String apellido, String edad, String estado_civil, String tipo_sangre, String peso, String talla, String historia_clinica, String sexo, String patologia, String fecha_nac, String telefono, String direccion) {
        this.cedual = cedual;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.tipo_sangre = tipo_sangre;
        this.peso = peso;
        this.talla = talla;
        this.historia_clinica = historia_clinica;
        this.sexo = sexo;
        this.patologia = patologia;
        this.fecha_nac = fecha_nac;
        this.telefono= telefono;
        this.direccion= direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedual() {
        return cedual;
    }

    public void setCedual(String cedual) {
        this.cedual = cedual;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getHistoria_clinica() {
        return historia_clinica;
    }

    public void setHistoria_clinica(String historia_clinica) {
        this.historia_clinica = historia_clinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

   
    
}
