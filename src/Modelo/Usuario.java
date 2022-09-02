/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author velez
 */
public class Usuario {
    
    private String Uusario, nombreUsuario, contraseña;
    private int idRol;
    private boolean estado;

    public Usuario(String Uusario, String nombreUsuario, String contraseña, int idRol, boolean estado) {
        this.Uusario = Uusario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.idRol = idRol;
        this.estado = estado;
    }

    public String getUusario() {
        return Uusario;
    }

    public void setUusario(String Uusario) {
        this.Uusario = Uusario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
