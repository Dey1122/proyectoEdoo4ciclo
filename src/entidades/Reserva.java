package entidades;

public class Reserva {
    private Cliente cliente;
    private int numeroHabitacion;
    private int numeroDias;
    private double precioTotal;

    public Reserva(Cliente cliente, int numeroHabitacion, int numeroDias, double precioTotal) {
        this.cliente = cliente;
        this.numeroHabitacion = numeroHabitacion;
        this.numeroDias = numeroDias;
        this.precioTotal = precioTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
