package Modelo;

import java.util.Vector;

public class Usuario {

    private String nombre;
    private String contrasenia;
    private String dni;
    private String email;
    private String apellido, telefono;
    private String FechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public static int verificarusuarionuevo(String dni) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getDni().equalsIgnoreCase(dni)) {
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogueo(String dni, String contraseña) {
        //usuario admin para dni y contraseña "111111"
        if (dni.equalsIgnoreCase("111111") && contraseña.equalsIgnoreCase("111111")) {
            return 1;
        }
        //usuario paciente para dni y contraseña "222222"
        if (dni.equalsIgnoreCase("222222") && contraseña.equalsIgnoreCase("222222")){
            return 2;
        }
        Vector lista = ListaUsuario.mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getDni().equalsIgnoreCase(dni) && obj.getContrasenia().equalsIgnoreCase(contraseña)) {
                return i;
            }
        }
        return -1;
    }
    
    public static Vector mostrar() {
        return ListaUsuario.mostrar();

    }
}
