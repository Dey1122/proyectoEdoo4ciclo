package entidades;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private boolean esHabitual;
    private double descuento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isEsHabitual() {
        return esHabitual;
    }

    public void setEsHabitual(boolean esHabitual) {
        this.esHabitual = esHabitual;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
