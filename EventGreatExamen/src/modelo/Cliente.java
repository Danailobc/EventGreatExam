/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author GOLDEN GAMERS
 */
public class Cliente {
    //atributos
    private String rut;
    private String nombreCompleto;
    private String correoElectronico;
    private int numeroTelefonico;
    //constructor

    public Cliente() {
    }

    public Cliente(String rut, String nombreCompleto, String correoElectronico, int numeroTelefonico) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
    }
    
    //metodos
    public void mostrarDatos (){
        System.out.println("------ Datos Cliente------");
        System.out.println("Rut" + rut);
        System.out.println("nombreCompleto" + nombreCompleto);
        System.out.println("correoElectronico" + correoElectronico);
        System.out.println("numeroTelefonico" + numeroTelefonico);
    }
    // Método para validar la longitud del RUT
    public boolean validarLargoRut() {
        return rut.length() == 10||rut.length() == 9;
    }
    
    public boolean validarLargoTelefono() {
        String numeroComoString = String.valueOf(numeroTelefonico);
        return numeroComoString.length() == 9;
    }
    
    //to String
    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", correoElectronico=" + correoElectronico + ", numeroTelefonico=" + numeroTelefonico + '}';
    }

    //get and set
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    
}