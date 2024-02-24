/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import entidades.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class ArbolAvl {
    private NodoArbol raiz;

    public ArbolAvl() {
        raiz = null;
    }

    public ArbolAvl(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public boolean esVacia() {
        return raiz == null;
    }
    public NodoArbol buscar(String dato){
        return buscar(dato,raiz);
    }
    private NodoArbol buscar(String dato,NodoArbol actual){
       if(actual == null)
           return null;
       if(dato.equals(actual.getInfo().getDni()))
           return actual;
       //reemplazar por actual.setInfo(modificacion); 
       if(dato.compareTo(actual.getInfo().getDni())<0)
           return buscar(dato,actual.getIzq());
       return buscar(dato,actual.getDer());   
    }
    public void insertar(Cliente x) {
        raiz = insertarAVL(raiz, x);
    }

    private NodoArbol insertarAVL(NodoArbol nodoActual, Cliente x) {
        if (nodoActual == null) {
            return (new NodoArbol(x));
        }
        // recorrido normal de arbol BB
        if (x.getDni().compareTo(nodoActual.getInfo().getDni()) < 0)
            nodoActual.setIzq(insertarAVL(nodoActual.getIzq(), x));
        else if (x.getDni().compareTo(nodoActual.getInfo().getDni()) > 0)
            nodoActual.setDer(insertarAVL(nodoActual.getDer(), x));
        else // Si la clave esta duplicada retorna eL mismo nodo encontrado
            return nodoActual;
        // Actualizacion de la altura
        nodoActual.setAltura(1 + max(getAltura(nodoActual.getIzq()), getAltura(nodoActual.getDer())));
        int fe = getFactorEquilibrio(nodoActual);
        if (fe > 1 && x.getDni().compareTo(nodoActual.getIzq().getInfo().getDni()) < 0)
            return rotarDerecha(nodoActual);
        if (fe < -1 && x.getDni().compareTo(nodoActual.getDer().getInfo().getDni()) > 0)
            return rotarIzquierda(nodoActual);
        if (fe > 1 && x.getDni().compareTo(nodoActual.getIzq().getInfo().getDni()) > 0) {
            nodoActual.setIzq(rotarIzquierda(nodoActual.getIzq()));
            return rotarDerecha(nodoActual);
        }
        if (fe < -1 && x.getDni().compareTo(nodoActual.getDer().getInfo().getDni()) < 0)
            return nodoActual;
        return nodoActual;
    }

    public NodoArbol rotarDerecha(NodoArbol actual) {
        NodoArbol nuevaR = actual.getIzq();
        NodoArbol temp = nuevaR.getDer();
        // rotacion
        nuevaR.setDer(actual);
        actual.setIzq(temp);
        // Actualizar alturas
        actual.setAltura(max(getAltura(actual.getIzq()), getAltura(actual.getIzq()) + 1));
        nuevaR.setAltura(max(getAltura(nuevaR.getIzq()), getAltura(nuevaR.getIzq()) + 1));
        return nuevaR;
    }

    public NodoArbol rotarIzquierda(NodoArbol actual) {
        NodoArbol nuevaR = actual.getDer(); // nodo derecho del que necesita ser rotado
        NodoArbol temp = nuevaR.getIzq();
        // rotacion
        nuevaR.setIzq(actual);
        actual.setDer(temp);
        // Actualizar alturas
        actual.setAltura(max(getAltura(actual.getIzq()), getAltura(actual.getDer()) + 1));
        nuevaR.setAltura(max(getAltura(nuevaR.getIzq()), getAltura(nuevaR.getDer()) + 1));
        return nuevaR;
    }

    public int getAltura(NodoArbol actual) {
        if (actual == null)
            return 0;
        return actual.getAltura(); // no se necesita recorrer pq se actualiza.
    }

    public int max(int a, int b) {
        return (a > b) ? a : b; // if simplificado como en js
    }

    public int getFactorEquilibrio(NodoArbol actual) {
        if (actual == null)
            return 0;
        return getAltura(actual.getIzq()) - getAltura(actual.getDer());
    }
    public void eliminarDato(String dato){
        raiz = eliminarAVL(raiz, dato);
    }
    private NodoArbol eliminarAVL(NodoArbol nodoActual, String key) {
        if (nodoActual == null)
            return nodoActual;
        if (key.compareTo(nodoActual.getInfo().getDni()) < 0) {
            nodoActual.setIzq(eliminarAVL(nodoActual.getIzq(), key));
        } else if (key.compareTo(nodoActual.getInfo().getDni()) > 0) {
            nodoActual.setDer(eliminarAVL(nodoActual.getDer(), key));
        } else {
            // El nodo es igual a la clave, se elimina
            // Nodo con un hijo o es hoja
            if ((nodoActual.getIzq() == null) || (nodoActual.getDer() == null)) {
                NodoArbol temp = null;
                if (temp == nodoActual.getIzq()) {
                    temp = nodoActual.getDer();
                } else {
                    temp = nodoActual.getIzq();
                }

                // Caso que no tiene hijos
                if (temp == null) {
                    nodoActual = null; // Se elimina dejandolo en null
                } else {
                    // Caso con un hijo
                    nodoActual = temp; // Elimina el valor actual reemplazandolo por su hijo
                }
            } else {
                // Nodo con dos hijos, se busca el predecesor
                NodoArbol temp = buscarMaximo(nodoActual.getIzq());

                // Se copia el dato del predecesor
                nodoActual.setInfo(temp.getInfo());

                // Se elimina el predecesor
                nodoActual.setIzq(eliminarAVL(nodoActual.getIzq(), temp.getInfo().getDni()));
            }
        }
        // Si solo tiene un nodo
        if (nodoActual == null)
            return nodoActual;

        // Actualiza altura
        nodoActual.setAltura(max(nodoActual.getIzq().getAltura(), nodoActual.getDer().getAltura() + 1));

        // Calcula factor de equilibrio (FE)
        int fe = getFactorEquilibrio(nodoActual);

        // Se realizan las rotaciones pertinentes dado el FE
        // Caso Rotacion Simple Derecha
        if (fe < 1 && getFactorEquilibrio(nodoActual.getIzq()) >= 0) {
            return rotarDerecha(nodoActual);
        }

        // Caso Rotacion Simple Izquierda
        if (fe > -1 && getFactorEquilibrio(nodoActual.getDer()) <= 0) {
            return rotarIzquierda(nodoActual);
        }

        // Caso Rotacion Doble Izquierda-Derecha
        if (fe > 1 && getFactorEquilibrio(nodoActual.getIzq()) < 0) {
            nodoActual.setIzq(rotarIzquierda(nodoActual.getIzq()));
            return rotarDerecha(nodoActual);
        }

        // Caso Rotacion Doble Derecha-Izquierda
        if (fe < -1 && getFactorEquilibrio(nodoActual.getDer()) > 0) {
            nodoActual.setDer(rotarDerecha(nodoActual.getDer()));
            return rotarIzquierda(nodoActual);
        }

        return nodoActual;
    }

    public NodoArbol buscarMaximo(NodoArbol p) {
        return buscarMax(p);
    }

    private NodoArbol buscarMax(NodoArbol actual) {
        if (actual == null)
            return null;
        else if (actual.getDer() == null)
            return actual;
        else
            return buscarMax(actual.getDer());
    }

    public void limpiarTabla(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    public void agregarFila(DefaultTableModel modelo, Cliente a) {
        Object fila[] = { a.getDni(), a.getNombre(), a.getApellido(),
                (a.isEsHabitual() == true) ? "Habitual" : "Normal", a.getDescuento() };
        modelo.addRow(fila);
    }

    public void preOrden(DefaultTableModel modelo) {
        String titulos[] = { "Dni", "Nombre", "Apellidos", "Tipo", "Descuento" };
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        preOrden(raiz, modelo);
    }

    private void preOrden(NodoArbol r, DefaultTableModel modelo) {
        if (r != null) {
            agregarFila(modelo, r.getInfo());
            preOrden(r.getIzq(), modelo);
            preOrden(r.getDer(), modelo);
        }
    }
}
