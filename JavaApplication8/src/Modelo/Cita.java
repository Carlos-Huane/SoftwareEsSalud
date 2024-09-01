package Modelo;

import java.util.Date;

public class Cita {
    private Date fecha;
    private String especialidad;
    private String sede;
    private Paciente paciente;
    private Administrador administrador;
    private String doctorAsignado;
    private boolean esPrioritaria;

    // Constructor
    public Cita(Date fecha, String especialidad, String sede, Paciente paciente, String doctorAsignado) {
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.sede = sede;
        this.paciente = paciente;
        this.doctorAsignado = doctorAsignado;
        this.esPrioritaria = false; // Por defecto, no es prioritaria
    }

    // Getters y Setters
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public String getDoctorAsignado() { return doctorAsignado; }
    public void setDoctorAsignado(String doctorAsignado) { this.doctorAsignado = doctorAsignado; }

    public boolean isEsPrioritaria() { return esPrioritaria; }
    public void setEsPrioritaria(boolean esPrioritaria) { this.esPrioritaria = esPrioritaria; }
}
