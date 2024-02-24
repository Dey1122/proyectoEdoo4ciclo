/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import entidades.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Cola {
    
    Nodo<Reserva> primero, ultimo;
    Habitacion habitacion;
    
    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void encolar(Reserva x) {
        Nodo<Reserva> nuevo = new Nodo<>(x);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }

    public Reserva desencolar() {
        if (empty()) {
            return null;
        } else {
            Reserva x = primero.getInfo();
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSgte();
            }
            return x;
        }
    }

    public boolean empty() {
        return primero == null;
    }

    public Reserva frente() {
        return primero.getInfo();
    }

    public void clear() {
        while (primero != null) {
            primero = primero.getSgte();
        }
        ultimo = null;
    }

    public Nodo<Reserva> getPrimero() {
        return primero;
    }
    
    public void mostrar101(DefaultTableModel modelo) {
        modelo.setRowCount(0);

        Object[] titulos = {"Cliente DNI", "Tipo Habitación", "Días", "Precio Total"};
        modelo.setColumnIdentifiers(titulos);

        Nodo<Reserva> actual = primero;
        while (actual != null) {
            if (actual.getInfo().getNumeroHabitacion() == 101) {
                Object[] datos = {
                    actual.getInfo().getCliente().getDni(),
                    actual.getInfo().getNumeroHabitacion(),
                    actual.getInfo().getNumeroDias(),
                    actual.getInfo().getPrecioTotal()
                };
                modelo.addRow(datos);
                
            }
            actual = actual.getSgte();
        }
    }
    
    public void mostrar202(DefaultTableModel modelo) {
        modelo.setRowCount(0);

        Object[] titulos = {"Cliente DNI", "Tipo Habitación", "Días", "Precio Total"};
        modelo.setColumnIdentifiers(titulos);

        Nodo<Reserva> actual = primero;
        while (actual != null) {
            if (actual.getInfo().getNumeroHabitacion() == 202) {
                Object[] datos = {
                    actual.getInfo().getCliente().getDni(),
                    actual.getInfo().getNumeroHabitacion(),
                    actual.getInfo().getNumeroDias(),
                    actual.getInfo().getPrecioTotal()
                };
                modelo.addRow(datos);
                
            }
            actual = actual.getSgte();
        }
    }
    
    public void mostrar305(DefaultTableModel modelo) {
        modelo.setRowCount(0);

        Object[] titulos = {"Cliente DNI", "Tipo Habitación", "Días", "Precio Total"};
        modelo.setColumnIdentifiers(titulos);

        Nodo<Reserva> actual = primero;
        while (actual != null) {
            if (actual.getInfo().getNumeroHabitacion() == 305) {
                Object[] datos = {
                    actual.getInfo().getCliente().getDni(),
                    actual.getInfo().getNumeroHabitacion(),
                    actual.getInfo().getNumeroDias(),
                    actual.getInfo().getPrecioTotal()
                };
                modelo.addRow(datos);
                
            }
            actual = actual.getSgte();
        }
    }
    
    public void mostrar408(DefaultTableModel modelo) {
        modelo.setRowCount(0);

        Object[] titulos = {"Cliente DNI", "Tipo Habitación", "Días", "Precio Total"};
        modelo.setColumnIdentifiers(titulos);

        Nodo<Reserva> actual = primero;
        while (actual != null) {
            if (actual.getInfo().getNumeroHabitacion() == 408) {
                Object[] datos = {
                    actual.getInfo().getCliente().getDni(),
                    actual.getInfo().getNumeroHabitacion(),
                    actual.getInfo().getNumeroDias(),
                    actual.getInfo().getPrecioTotal()
                };
                modelo.addRow(datos);
                
            }
            actual = actual.getSgte();
        }
    }
    
    public void mostrar511(DefaultTableModel modelo) {
        modelo.setRowCount(0);

        Object[] titulos = {"Cliente DNI", "Tipo Habitación", "Días", "Precio Total"};
        modelo.setColumnIdentifiers(titulos);

        Nodo<Reserva> actual = primero;
        while (actual != null) {
            if (actual.getInfo().getNumeroHabitacion() == 511) {
                Object[] datos = {
                    actual.getInfo().getCliente().getDni(),
                    actual.getInfo().getNumeroHabitacion(),
                    actual.getInfo().getNumeroDias(),
                    actual.getInfo().getPrecioTotal()
                };
                modelo.addRow(datos);
                
            }
            actual = actual.getSgte();
        }
    }
    public void mostrar614(DefaultTableModel modelo) {
        modelo.setRowCount(0);

        Object[] titulos = {"Cliente DNI", "Tipo Habitación", "Días", "Precio Total"};
        modelo.setColumnIdentifiers(titulos);

        Nodo<Reserva> actual = primero;
        while (actual != null) {
            if (actual.getInfo().getNumeroHabitacion() == 614) {
                Object[] datos = {
                    actual.getInfo().getCliente().getDni(),
                    actual.getInfo().getNumeroHabitacion(),
                    actual.getInfo().getNumeroDias(),
                    actual.getInfo().getPrecioTotal()
                };
                modelo.addRow(datos);
                
            }
            actual = actual.getSgte();
        }
    }
}
