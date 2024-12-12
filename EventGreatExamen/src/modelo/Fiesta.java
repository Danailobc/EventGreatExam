/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author GOLDEN GAMERS
 */
public class Fiesta extends PaqueteEvento{
    //atributos
    private boolean barConOSinAlcohol;
    private int numeroDjEnEscena;

    //constructor
    public Fiesta() {
    }

    public Fiesta(boolean barConOSinAlcohol, int numeroDjEnEscena, int idEvento, String tipoEvento, String descripcionEvento, int cantidadAsistentes, double tamanioRecinto, int cantidadMesas, double precio) {
        super(idEvento, tipoEvento, descripcionEvento, cantidadAsistentes, tamanioRecinto, cantidadMesas, precio);
        this.barConOSinAlcohol = barConOSinAlcohol;
        this.numeroDjEnEscena = numeroDjEnEscena;
    }

    //to string
      @Override
    public String toString() {
        return super.toString() 
                + "" 
                + "\n barConOSinAlcohol = " + barConOSinAlcohol 
                + "\n numeroDjEnEscena = " + numeroDjEnEscena; 
    }

    //get and set
    public boolean isBarConOSinAlcohol() {
        return barConOSinAlcohol;
    }

    public void setBarConOSinAlcohol(boolean barConOSinAlcohol) {
        this.barConOSinAlcohol = barConOSinAlcohol;
    }

    public int getNumeroDjEnEscena() {
        return numeroDjEnEscena;
    }

    public void setNumeroDjEnEscena(int numeroDjEnEscena) {
        this.numeroDjEnEscena = numeroDjEnEscena;
    }
    

}
