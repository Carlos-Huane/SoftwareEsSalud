package Controlador.Usuario;

//Vistas
import Vista.Usuario.Citas;
import Vista.Usuario.HistorialCitas;
import Vista.Usuario.Recetas;
//JFRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRecetas implements ActionListener{
    private Citas VentanaCitas = new Citas();
    private HistorialCitas VentanaHistorialCitas = new HistorialCitas();
    private Recetas VentanaRecetas = new Recetas();
    
     public ControladorRecetas() {
         System.out.println("Estoy en recetas");
        this.VentanaRecetas.btnCitas.addActionListener(this);
        this.VentanaRecetas.btnRecetas.addActionListener(this);
        this.VentanaRecetas.btnHistorialcitas.addActionListener(this);
        
        this.VentanaRecetas.btnInicio.addActionListener(this);
        this.VentanaRecetas.btnCerrarsesion.addActionListener(this);
        //CENTRAR LA VENTANA Y HACERLO VISIBLE
        VentanaRecetas.setLocationRelativeTo(null);
        VentanaRecetas.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VentanaRecetas.btnCitas) {
            //llamas al controlador citas
            new ControladorCitas();
        }
        if (e.getSource() == VentanaRecetas.btnRecetas) {
            //llamas al controlador recetas
            new ControladorRecetas();
        }
        if (e.getSource() == VentanaRecetas.btnHistorialcitas) {
            //llamas al controlador HistorialCitas
            new ControladorHistorial();
        }
    }
}
