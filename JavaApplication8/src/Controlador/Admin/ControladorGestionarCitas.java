package Controlador.Admin;

//VISTAS
import Vista.Admin.GestionarCitas;
import Vista.Admin.Historial;
//JFRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorGestionarCitas implements ActionListener {
    private GestionarCitas VentanaGestionarCitas = new GestionarCitas();
    private Historial VentanaHistorial = new Historial();
    
    public ControladorGestionarCitas(){
        System.out.println("Estoy en Gestionar citas admin");
        this.VentanaGestionarCitas.btnGestionarCitas.addActionListener(this);
        this.VentanaGestionarCitas.btnHistorialPaciente.addActionListener(this);
        
        this.VentanaGestionarCitas.btnInicio.addActionListener(this);
        this.VentanaGestionarCitas.btnCerrarsesion.addActionListener(this);
        //CENTRAR LA VENTANA Y HACERLO VISIBLE
        VentanaGestionarCitas.setLocationRelativeTo(null);
        VentanaGestionarCitas.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VentanaGestionarCitas.btnGestionarCitas) {
            //llamas al controlador citas
            new ControladorGestionarCitas();
        }
        if (e.getSource() == VentanaGestionarCitas.btnHistorialPaciente) {
            //llamas al controlador recetas
            new ControladorHistorialPacientes();
        }
    }
}
