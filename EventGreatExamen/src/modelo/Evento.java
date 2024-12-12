
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 *
 * @author GOLDEN GAMERS
 */

public class Evento {
    private Cliente cliente;
    private PaqueteEvento paqueteEvento;
    private String fechaHora;
    
    //constructor
    public Evento() {
    }

    public Evento(Cliente cliente, PaqueteEvento paqueteEvento, String fechaHora) {
        this.cliente = cliente;
        this.paqueteEvento = paqueteEvento;
        this.fechaHora = fechaHora;
    }
    
    //to string

    @Override
    public String toString() {
        return "Evento{" + "cliente=" + cliente + ", paqueteEvento=" + paqueteEvento + ", fechaHora=" + fechaHora + '}';
    }
    
    //get and set

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteEvento getPaqueteEvento() {
        return paqueteEvento;
    }

    public void setPaqueteEvento(PaqueteEvento paqueteEvento) {
        this.paqueteEvento = paqueteEvento;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
    
}