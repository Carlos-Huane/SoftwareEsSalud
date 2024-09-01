package Modelo;

import java.util.Date;

public class Receta {
    private String nombreMedicamento;
    private int cantidad;
    private Date fechaPrescripcion;
    private String doctorPrescriptor;
    private Paciente paciente;

    // Constructor
    public Receta(String nombreMedicamento, int cantidad, Date fechaPrescripcion, String doctorPrescriptor, Paciente paciente) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantidad = cantidad;
        this.fechaPrescripcion = fechaPrescripcion;
        this.doctorPrescriptor = doctorPrescriptor;
        this.paciente = paciente;
    }

    // Getters y Setters
    public String getNombreMedicamento() { return nombreMedicamento; }
    public void setNombreMedicamento(String nombreMedicamento) { this.nombreMedicamento = nombreMedicamento; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Date getFechaPrescripcion() { return fechaPrescripcion; }
    public void setFechaPrescripcion(Date fechaPrescripcion) { this.fechaPrescripcion = fechaPrescripcion; }

    public String getDoctorPrescriptor() { return doctorPrescriptor; }
    public void setDoctorPrescriptor(String doctorPrescriptor) { this.doctorPrescriptor = doctorPrescriptor; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
}
