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
public class Opcion {
    private int idOpc;
    private String nombreOpc;
    private boolean etadoOpc;

    public Opcion(int idOpc, String nombreOpc, boolean etadoOpc) {
        this.idOpc = idOpc;
        this.nombreOpc = nombreOpc;
        this.etadoOpc = etadoOpc;
    }

    public int getIdOpc() {
        return idOpc;
    }

    public void setIdOpc(int idOpc) {
        this.idOpc = idOpc;
    }

    public String getNombreOpc() {
        return nombreOpc;
    }

    public void setNombreOpc(String nombreOpc) {
        this.nombreOpc = nombreOpc;
    }

    public boolean isEtadoOpc() {
        return etadoOpc;
    }

    public void setEtadoOpc(boolean etadoOpc) {
        this.etadoOpc = etadoOpc;
    }

    
}
