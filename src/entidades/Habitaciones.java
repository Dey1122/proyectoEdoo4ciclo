/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import estructuras.*;
/**
 *
 * @author danie
 */
public class Habitaciones {
    private static ListaDoble  habitaciones =new ListaDoble();

    public Habitaciones() {
        crearHabitaciones();
    }
    
   public static void crearHabitaciones() {
        int[] numeros = {101, 202, 305, 408, 511, 614};
        String[] tipos = {"Individual", "Doble", "Suite", "Doble", "Individual", "Suite"};
        float[] precios = {50.0f, 80.0f, 120.0f, 90.0f, 60.0f, 130.0f};
        String[] descripciones = {
            "Habitación individual con vista a la ciudad.\nDisfrute de una estancia confortable en esta acogedora habitación, equipada con todas las comodidades necesarias.",
            "Amplia habitación doble con comodidades modernas.\nPerfecta para parejas o amigos que deseen compartir un espacio cómodo y acogedor.",
            "Suite de lujo con todas las comodidades.\nRelájese y disfrute de un ambiente elegante con amplias instalaciones y servicios exclusivos.",
            "Habitación doble con balcón privado.\nDisfrute de las vistas y la brisa fresca desde su propio espacio al aire libre.",
            "Habitación individual con baño privado.\nUna opción perfecta para aquellos que buscan privacidad y comodidad durante su estancia.",
            "Suite con amplio espacio y vistas panorámicas.\nExperimente el lujo en cada rincón de esta espaciosa suite con todas las comodidades."
        };
        for (int i = 0; i < numeros.length; i++) {
            Habitacion habitacion = new Habitacion(numeros[i], tipos[i], precios[i],descripciones[i]);
            habitaciones.insertarAlFinal(habitacion);
        }
    }
   public static Habitacion getHabitaciones(int num){
       return habitaciones.getxNumero(num);
   }
 
}
