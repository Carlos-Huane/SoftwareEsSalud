package Modelo;

public class Administrador {
    private String nombre;
    private String apellido;
    private String dni;
    private String codigoSeguridad;

    // Constructor
    public Administrador(String nombre, String apellido, String dni, String codigoSeguridad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getCodigoSeguridad() { return codigoSeguridad; }
    public void setCodigoSeguridad(String codigoSeguridad) { this.codigoSeguridad = codigoSeguridad; }
}
