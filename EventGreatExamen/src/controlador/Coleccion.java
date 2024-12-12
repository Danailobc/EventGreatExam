/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextArea;
import modelo.Cliente;
import modelo.Evento;
import modelo.PaqueteEvento;

/**
 *
 * @author GOLDEN GAMERS
 */
public class Coleccion {
    //atributos
    private ArrayList<PaqueteEvento>listaPaqueteEvento;
    private ArrayList<Cliente>listaCliente;
    private ArrayList<Evento>listaEvento;

    public Coleccion() {
        this.listaPaqueteEvento = new ArrayList<PaqueteEvento> ();
        this.listaCliente = new ArrayList<Cliente> ();
        this.listaEvento = new ArrayList<Evento> ();
    }

    //metodos
    //agregar registrocliente
    public boolean agregarRegistroCliente(Cliente cliente, JTextArea agregar){
        if (this.buscarCliente(cliente.getRut())){
            System.out.println("El Cliente: " + cliente.getNombreCompleto()+ ", ya existe");
            agregar.setText("El Cliente: " + cliente.getNombreCompleto()+ " de rut " +cliente.getRut()+" ya existe");
            return false;
        }else{
            if(cliente.getRut().isEmpty()
                    ||cliente.getNombreCompleto().isEmpty()
                    ||cliente.getCorreoElectronico().isEmpty()
                    ||cliente.getNumeroTelefonico() == 0){
                agregar.setText("Campos Vacios o datos incompletos debes llenarlos");
                return false;
            }else{
                agregar.setText("Cliente agregado");
            return listaCliente.add(cliente);  
            }
        }
    }
    //listar Registro eventos
    public String listarRegistroCliente (){
        String lista = "";
        for (Cliente cliente : listaCliente) {
            lista = lista + "\nId Rut: " + cliente.getRut()
                          + "\nNombre Completo: " +cliente.getNombreCompleto()
                          + "\nCorreoElectronico: " + cliente.getCorreoElectronico()
                          + "\nNumeroTelefonico: " + cliente.getNumeroTelefonico()
                          + "\n-----------------------------------------------";
        }
        return lista;
    }
    
    //buscarcliente
    public boolean buscarCliente (String rut){
        for (Cliente cliente : listaCliente) {
            if(cliente.getRut().equalsIgnoreCase(rut)){
                System.out.println("Cliente encontrado" + cliente.toString());
                return true;
            }
        }
        System.out.println("CLIENTE NO ENCONTRADO");
        return false;
    }
    
    //eliminar
    public boolean eliminarCliente (String rut){
        for (Cliente cliente : listaCliente) {
            if(cliente.getRut().equals(rut)){
                listaCliente.remove(cliente);
                System.out.println("Cliente ELIMINADO: " + rut);
                return true;
            }
        }System.out.println("Cliente NO EXISTE");
        return false;
    }
    
    public String mostrarDatosCliente (String rut){
        String lista = "";
        for (Cliente cliente : listaCliente) {
            if (cliente.getRut().equals(rut)){
                lista = lista + "\nRut: " + cliente.getRut()
                          + "\nNombreCompleto: "+cliente.getNombreCompleto()
                          + "\nCorreoElectronico: " +cliente.getCorreoElectronico()
                          + "\nNumeroTelefonico: " + cliente.getNumeroTelefonico()
                          + "\n-----------------------------------------------";
            }
        }
        return lista;
    }
    
    private boolean validarLongitudRut(String rut) {
        return rut.length() == 10||rut.length() == 9;
    }
    
    public boolean modificarRutCliente(String rut, String nuevoRut) {
        if (validarLongitudRut(rut) && validarLongitudRut(nuevoRut)) {
            for (Cliente cliente : listaCliente) {
                if (cliente.getRut().equals(rut)) {
                    System.out.println("El rut del Cliente: " + cliente.getRut());
                    cliente.setRut(nuevoRut);
                    System.out.println("Se ha modificado por: " + cliente.getRut());
                    System.out.println("");
                    return true;
                }
            }
        } else {
            System.out.println("Debes ingresar 9 o 10 caracteres en la modificacion del rut");
        }
        return false; 
    }

    
    public boolean modificarNombreCliente (String rut , String nuevoNombre){
        for (Cliente cliente : listaCliente){
            if(cliente.getRut().equals(rut)){
                System.out.println("El Nombre del Cliente : " +cliente.getNombreCompleto());
                cliente.setNombreCompleto(nuevoNombre);
                System.out.println("Se ha modificado por : " +cliente.getNombreCompleto());
                System.out.println("");  
            }
        }
        return false;
    }
    
    public boolean modificarCorreoCliente (String rut , String nuevoCorreo){
        for (Cliente cliente : listaCliente){
            if(cliente.getRut().equals(rut)){
                System.out.println("El Correo del Cliente : " +cliente.getCorreoElectronico());
                cliente.setCorreoElectronico(nuevoCorreo);
                System.out.println("Se ha modificado por : " +cliente.getCorreoElectronico());
                System.out.println("");  
            }
        }
        return false;
    }
    
    public boolean modificarTelefonoCliente (String rut , int nuevoTelefono){
        for (Cliente cliente : listaCliente){
            if(cliente.getRut().equals(rut)){
                System.out.println("El Telefono del Cliente : " +cliente.getNumeroTelefonico());
                cliente.setNumeroTelefonico(nuevoTelefono);
                System.out.println("Se ha modificado por : " +cliente.getNumeroTelefonico());
                System.out.println("");  
            }
        }
        return false;
    }
    
    //agregar RegistroPaqueteEventos
    public boolean agregarRegPaqueteEventos(PaqueteEvento paqueteEvento, JTextArea agregarTexto){
        if(this.buscarPaqueteEventos(paqueteEvento.getTipoEvento())){
            System.out.println("El Evento " + paqueteEvento.getTipoEvento()+ ", ya existe");
            return false;
        }else {
            if (paqueteEvento.getIdEvento()==0
                    ||paqueteEvento.getTipoEvento().isEmpty()
                    ||paqueteEvento.getDescripcionEvento().isEmpty()
                    ||paqueteEvento.getCantidadAsistentes()==0
                    ||paqueteEvento.getTamanioRecinto()== 0.0
                    ||paqueteEvento.getCantidadMesas()==0
                    ||paqueteEvento.getPrecio()==0.0){
                agregarTexto.setText("Campos Vacios o datos incompletos debes llenarlos");
                return false;
            }else{
                agregarTexto.setText("Paquete de evento agregado");
                return listaPaqueteEvento.add(paqueteEvento);  
            }
        }
    }

    //lista RegistroPaqueteEventos 
    public String listarRegPaqueteEventos (){
        String lista = "";
        for (PaqueteEvento paqueteEvento : listaPaqueteEvento) {
            lista = lista + "\n"+paqueteEvento.toString()
                          /*+ "\n DescripcionEvento: " +paqueteEvento.getTipoEvento()
                          + "\n DescripcionEvento: " +paqueteEvento.getDescripcionEvento()
                          + "\n CantidadAsistentes: " + paqueteEvento.getCantidadAsistentes()
                          + "\n TamanioRecinto: " + paqueteEvento.getTamanioRecinto() + " mt2 "
                          + "\n CantidadMesas: " + paqueteEvento.getCantidadMesas()
                          + "\n Precio: " + paqueteEvento.getPrecio()*/
                          + "\n";
        }
        return lista;
    }
    
    //buscar paqueteEventos
    public boolean buscarPaqueteEventos (String tipoEvento){
        for (PaqueteEvento paqueteEvento : listaPaqueteEvento) {
            if(paqueteEvento.getTipoEvento().equalsIgnoreCase(tipoEvento)){
                System.out.println("Evento encontrado" + paqueteEvento.toString());
                return true;
            }
        }
        System.out.println("NUEVO REGISTRO");
        return false;
    }
    
    //eliminar paquete de eventos
    public boolean eliminarPaqueteEvento(int id) {
        Iterator<PaqueteEvento> iterator = listaPaqueteEvento.iterator();
        while (iterator.hasNext()) {
            PaqueteEvento paqueteEvento = iterator.next();
            if (paqueteEvento.getIdEvento() == id) {
                iterator.remove();
                System.out.println("Paquete de Evento ELIMINADO: " + id);
                return true;
            }
        }
        System.out.println("Paquete de Evento NO EXISTE: " + id);
        return false;
    }

    
    //agregar evento
    public boolean agregarEvento(Evento evento, JTextArea agregarTextoEvent) {
        if (evento.getFechaHora().isEmpty()||evento.getFechaHora().equals(0)){
            agregarTextoEvent.setText("Campos Vacios o datos incompletos debes llenarlos");
            return false;
        }else{
            return listaEvento.add(evento); 
        }
        
    }
    
    //lista Eventos 
    public String listarEventos (){
        String lista = "";
        for (Evento evento : listaEvento) {
            lista = lista + "\n Cliente: " + evento.getCliente()
                          + "\n PaqueteEvento: " +evento.getPaqueteEvento()
                          + "\n FechaHora: " + evento.getFechaHora()
                          + "\n-----------------------------------------------";
        }
        return lista;
    }
    
    public boolean eliminarEventoSolicitado (String fechaHora){
        for (Evento evento : listaEvento) {
            if(evento.getFechaHora().equals(fechaHora)){
                listaEvento.remove(evento);
                System.out.println("Evento de fecha: "+ fechaHora + " ELIMINADO: ");
                return true;
            }
        }System.out.println("Cliente NO EXISTE");
        return false;
    }
    
     
    //Metodo personalizado obt: data
    public ArrayList<Cliente> listarClientes() {
     return  listaCliente;
    }
    
    public ArrayList<PaqueteEvento> listarPaqueteEvento() {
     return  listaPaqueteEvento;
    }
    
    
    //get and set
    public ArrayList<PaqueteEvento> getListaPaqueteEvento() {
        return listaPaqueteEvento;
    }

    public void setListaPaqueteEvento(ArrayList<PaqueteEvento> listaPaqueteEvento) {
        this.listaPaqueteEvento = listaPaqueteEvento;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList<Evento> getListaEvento() {
        return listaEvento;
    }

    public void setListaEvento(ArrayList<Evento> listaEvento) {
        this.listaEvento = listaEvento;
    }
    
   
}//fin clase
