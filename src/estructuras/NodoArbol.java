/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import entidades.*;

/**
 *
 * @author danie
 */
public class NodoArbol {
    private Cliente info;
    private NodoArbol izq;
    private NodoArbol der;
    private int altura;

    public NodoArbol(Cliente info) {
        this.info = info;
        altura = 0;
    }

    public Cliente getInfo() {
        return info;
    }

    public void setInfo(Cliente info) {
        this.info = info;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
