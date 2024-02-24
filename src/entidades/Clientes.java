/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import estructuras.ArbolAvl;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class Clientes {
    private static ArbolAvl arbolito = new ArbolAvl();
    public static void insertar(Cliente cli){
        arbolito.insertar(cli);
    }
    public static void eliminar(String dni){
        arbolito.eliminarDato(dni);
    }
    public static void mostrar(DefaultTableModel x){
        arbolito.preOrden(x);
    }
    public static Cliente buscarCliente(String dato){
        if(arbolito.buscar(dato)!=null)
            return arbolito.buscar(dato).getInfo(); 
        return null;
    }
    
}
