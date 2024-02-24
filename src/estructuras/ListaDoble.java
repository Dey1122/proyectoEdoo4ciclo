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
public class ListaDoble {
    private NodoDoble primero;
    private NodoDoble ultimo;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    public NodoDoble getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDoble primero) {
        this.primero = primero;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }
    public Habitacion getxNumero(int num){
        NodoDoble p = primero;
        for(int i=1;i<num;i++){
            p = p.getSiguiente();
        }
        return p.getDato();
    }
    public void insertarAlFinal(Habitacion info) {
        NodoDoble nuevo = new NodoDoble(info);
        if (primero == null) {
            nuevo.setSiguiente(null);
            nuevo.setAnterior(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(null);
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

}
