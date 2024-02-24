/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import entidades.*;

/**
 *
 * @author daniel
 */
public class NodoDoble {
    private Habitacion dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(Habitacion dato) {
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }

    public NodoDoble(Habitacion dato, NodoDoble siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
        anterior = null;
    }

    public NodoDoble(Habitacion dato, NodoDoble anterior, NodoDoble siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
        anterior = null;
    }

    public Habitacion getDato() {
        return dato;
    }

    public void setDato(Habitacion dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

}
