package Controlador.Admin;

//VISTAS
import Vista.Admin.GestionarCitas;
import Vista.Admin.Historial;
//JFRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorHistorialPacientes implements ActionListener {
    private GestionarCitas VentanaGestionarCitas = new GestionarCitas();
    private Historial VentanaHistorial = new Historial();
    
    public ControladorHistorialPacientes(){
        System.out.println("Estoy en Gestionar citas admin");
        this.VentanaHistorial.btnGestionarCitas.addActionListener(this);
        this.VentanaHistorial.btnHistorialcitas.addActionListener(this);
        
        this.VentanaHistorial.btnInicio1.addActionListener(this);
        this.VentanaHistorial.btnCerrarSesion1.addActionListener(this);
        //CENTRAR LA VENTANA Y HACERLO VISIBLE
        VentanaHistorial.setLocationRelativeTo(null);
        VentanaHistorial.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VentanaHistorial.btnGestionarCitas) {
            //llamas al controlador citas
            new ControladorGestionarCitas();
        }
        if (e.getSource() == VentanaHistorial.btnHistorialcitas) {
            //llamas al controlador recetas
            new ControladorHistorialPacientes();
        }
    }
}
