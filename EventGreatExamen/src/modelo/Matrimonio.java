/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author GOLDEN GAMERS
 */
public class Matrimonio extends PaqueteEvento{
    //atributos
    private String tiempoMenuCantidadPlatos;
    private boolean musicaEnVivo;
    
    //constructor

    public Matrimonio() {
    }

    public Matrimonio(String tiempoMenuCantidadPlatos, boolean musicaEnVivo, int idEvento, String tipoEvento, String descripcionEvento, int cantidadAsistentes, double tamanioRecinto, int cantidadMesas, double precio) {
        super(idEvento, tipoEvento, descripcionEvento, cantidadAsistentes, tamanioRecinto, cantidadMesas, precio);
        this.tiempoMenuCantidadPlatos = tiempoMenuCantidadPlatos;
        this.musicaEnVivo = musicaEnVivo;
    }

    

    //toString
    @Override
    public String toString() {
        return super.toString() 
                + "" 
                + "\n tiempoMenuCantidadPlatos = " + tiempoMenuCantidadPlatos 
                + "\n musicaEnVivo = " + musicaEnVivo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    //get and set
    public String getTiempoMenuCantidadPlatos() {
        return tiempoMenuCantidadPlatos;
    }

    public void setTiempoMenuCantidadPlatos(String tiempoMenuCantidadPlatos) {
        this.tiempoMenuCantidadPlatos = tiempoMenuCantidadPlatos;
    }

    public boolean isMusicaEnVivo() {
        return musicaEnVivo;
    }

    public void setMusicaEnVivo(boolean musicaEnVivo) {
        this.musicaEnVivo = musicaEnVivo;
    }
    
}
