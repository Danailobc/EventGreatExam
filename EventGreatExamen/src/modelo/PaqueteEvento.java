/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author GOLDEN GAMERS
 */
public abstract class PaqueteEvento {//inicio clase
    //atributos
    private static int contadorId = 1;
    private int idEvento;
    private String tipoEvento;
    private String descripcionEvento;
    private int cantidadAsistentes;
    private double tamanioRecinto;
    private int cantidadMesas;
    private double precio;
    
    
    //constructores
    public PaqueteEvento() {
    }

    public PaqueteEvento(int idEvento, String tipoEvento, String descripcionEvento, int cantidadAsistentes, double tamanioRecinto, int cantidadMesas, double precio) {
        this.idEvento = contadorId++;
        this.tipoEvento = tipoEvento;
        this.descripcionEvento = descripcionEvento;
        this.cantidadAsistentes = cantidadAsistentes;
        this.tamanioRecinto = tamanioRecinto;
        this.cantidadMesas = cantidadMesas;
        this.precio = precio;
    }
    //metodos
    
    //to String
    @Override    
    public String toString() {
        return "PaqueteEvento:  " 
                + "\n Id evento = " + idEvento
                + "\n descripcionEvento = " + descripcionEvento 
                + "\n cantidadAsistentes = " + cantidadAsistentes 
                + "\n tamanioRecinto = " + tamanioRecinto +" mt2 "
                + "\n cantidadMesas = " + cantidadMesas 
                + "\n precio = " + precio 
                + "\n tipoEvento = " + tipoEvento ;
    }

    //get and set
    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public double getTamanioRecinto() {
        return tamanioRecinto;
    }

    public void setTamanioRecinto(double tamanioRecinto) {
        this.tamanioRecinto = tamanioRecinto;
    }

    public int getCantidadMesas() {
        return cantidadMesas;
    }

    public void setCantidadMesas(int cantidadMesas) {
        this.cantidadMesas = cantidadMesas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

}//fin clase
