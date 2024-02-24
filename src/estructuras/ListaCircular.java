/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class ListaCircular {
    private Nodo<Integer> U;

    public ListaCircular() {
        U = null;
    }

    public void ingresarInicio(int n) {
        Nodo<Integer> nuevo = new Nodo<>(n);
        if (U == null) {
            U = nuevo;
            nuevo.setSgte(U);
        } else {
            nuevo.setSgte(U.getSgte());
            U.setSgte(nuevo);
        }
    }

    public void insertarFinal(int n) {
        Nodo<Integer> nuevo = new Nodo<>(n);
        if (U == null) {
            U = nuevo;
            nuevo.setSgte(U);
        } else {
            nuevo.setSgte(U.getSgte());
            U.setSgte(nuevo);
            U = nuevo;
        }
    }

    public int contar() {
        if (U == null) {
            return 0;
        } else {
            int c = 0;
            Nodo<Integer> p = U.getSgte();
            do {
                c++;
                p = p.getSgte();
            } while (p != U.getSgte());
            return c;
        }
    }

    public boolean eliminar(int valor) {
        if (U == null) // la lista está vacía
            return false;
        if (U.getInfo() == valor && U.getSgte() == U) { // ultimo es el unico dato?
            U = null;
            return true;
        }
        Nodo<Integer> ant = U, p = U.getSgte();
        do {
            if (p.getInfo() == valor) {
                ant.setSgte(p.getSgte());
                if (p == U)// el dato a eliminar es el ultimo?
                    U = ant;
                return true;
            }
            ant = ant.getSgte();
            p = p.getSgte();
        } while (ant != U);
        return false;
    }

    public Nodo<Integer> buscar(int n) {
        if (U == null) {
            Nodo<Integer> p = U.getSgte();
            do {
                if (p.getInfo().equals(n))
                    return p;
                p = p.getSgte();
            } while (p != U.getSgte());
            return null;
        } else {
            return null;
        }
    }

    public void insertarPos(int pos, int n) {
        if (pos == contar() + 1)
            insertarFinal(n);
        else {
            if (pos == 1) {
                ingresarInicio(n);
            } else {
                if (U != null) {
                    Nodo<Integer> nuevo = new Nodo<>(n);
                    Nodo<Integer> q = U, p = U.getSgte();
                    int c = 0;
                    do {
                        c++;
                        if (c == pos) {
                            break;
                        }
                        q = q.getSgte();
                        p = p.getSgte();
                    } while (p != U.getSgte());
                    if (p != U.getSgte()) {
                        nuevo.setSgte(p);
                        q.setSgte(nuevo);
                    } else {
                        JOptionPane.showMessageDialog(null, "posicion fuera del total");
                    }
                }
            }
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        if (U != null) {
            Object dato[][] = new Object[contar()][1];
            String titulo[] = { "Descuentos" };
            Nodo<Integer> p = U.getSgte();
            int c = -1;
            do {
                c++;
                dato[c][0] = p.getInfo() + "%";
                p = p.getSgte();
            } while (p != U.getSgte());
            modelo.setDataVector(dato, titulo);
        } else {
            String titulo[] = { "Descuentos" };
            modelo.setDataVector(null, titulo);
        }
    }

    private int generarNumeroAleatorio(int minimo, int maximo) {
        Random rand = new Random();
        return rand.nextInt(maximo - minimo + 1) + minimo;
    }

    public int numerosRandom() {
        return generarNumeroAleatorio(1, contar());
    }

    public int eliminarAlAzar() {
        int num = numerosRandom();
        int c = 0;
        Nodo<Integer> p = U.getSgte();
        do {
            c++;
            if (c == num) {
                int x = p.getInfo();
                eliminar(p.getInfo());
                return x;
            }
            p = p.getSgte();

        } while (p != U.getSgte());
        return -1;
    }
}
