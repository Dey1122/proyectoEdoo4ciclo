package entidades;

import estructuras.*;
import javax.swing.table.DefaultTableModel;

public class Habitacion {
    private int numero;
    private String tipo;
    private float precio;
    private String descripcion;
    private Cola reservas;

    public Habitacion(int numero, String tipo, float precio, String descripcion) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
        reservas = new Cola();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Cola getReservas() {
        return reservas;
    }
    public void mostrarReservas(DefaultTableModel modelo){
        Nodo<Reserva> p = getReservas().getPrimero();
        int i = 1;
        while(p!=null){
            String[] reserva = {String.valueOf(i),p.getInfo().getCliente().getDni(),(p.getInfo().getCliente().isEsHabitual()==true)? "Habitual":"Normal",String.valueOf(p.getInfo().getNumeroDias()), String.valueOf(p.getInfo().getPrecioTotal())};
            i++;
            modelo.addRow(reserva);
            p=p.getSgte();
        }
    }
//    public void mostrar(DefaultTableModel modelo){
//        Nodo p=primero;
//        int i = 1;
//        while(p!=null){
//            String [] comprador = {p.getInfo().getNombre(),p.getInfo().getTelefono(),p.getInfo().getTier(), String.valueOf(i)};
//            i++;
//            modelo.addRow(comprador);
//            p=p.getSgte();
//        }
//    }
    public void setReservas(Cola reservas) {
        this.reservas = reservas;
    }

    public String getNombre() {
        return " " + getNumero() + " " + getTipo() + " ";
    }
}
