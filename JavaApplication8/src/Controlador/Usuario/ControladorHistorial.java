package Controlador.Usuario;

//Vistas
import Vista.Usuario.Citas;
import Vista.Usuario.HistorialCitas;
import Vista.Usuario.Recetas;
//JFRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorHistorial implements ActionListener{
    private Citas VentanaCitas = new Citas();
    private HistorialCitas VentanaHistorialCitas = new HistorialCitas();
    private Recetas VentanaRecetas = new Recetas();
    
     public ControladorHistorial() {
         System.out.println("Estoy en historial");
        this.VentanaHistorialCitas.btnCitas.addActionListener(this);
        this.VentanaHistorialCitas.btnRecetas.addActionListener(this);
        this.VentanaHistorialCitas.btnHistorialcitas.addActionListener(this);
       
        this.VentanaHistorialCitas.btnInicio.addActionListener(this);
        this.VentanaHistorialCitas.btnCerrarsesion.addActionListener(this);
        //CENTRAR LA VENTANA Y HACERLO VISIBLE
        VentanaHistorialCitas.setLocationRelativeTo(null);
        VentanaHistorialCitas.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VentanaHistorialCitas.btnCitas) {
            //llamas al controlador citas
            new ControladorCitas();
        }
        if (e.getSource() == VentanaHistorialCitas.btnRecetas) {
            //llamas al controlador recetas
            new ControladorRecetas();
        }
        if (e.getSource() == VentanaHistorialCitas.btnHistorialcitas) {
            //llamas al controlador HistorialCitas
            new ControladorHistorial();
        }
    }
}
