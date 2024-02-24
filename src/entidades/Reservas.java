/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import estructuras.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Reservas {
    private static Cola cola = new Cola();
    
    public static void encolar(Reserva reserva){
       cola.encolar(reserva);
    }
    
    public static void mostrarReservas101(DefaultTableModel x){
        cola.mostrar101(x);
    }
    public static void mostrarReservas202(DefaultTableModel x){
        cola.mostrar202(x);
    }
    public static void mostrarReservas305(DefaultTableModel x){
        cola.mostrar305(x);
    }
    public static void mostrarReservas408(DefaultTableModel x){
        cola.mostrar408(x);
    }
    public static void mostrarReservas511(DefaultTableModel x){
        cola.mostrar511(x);
    }
    public static void mostrarReservas614(DefaultTableModel x){
        cola.mostrar614(x);
    }
    


}
