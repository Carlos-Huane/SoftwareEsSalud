package Controlador.Usuario;

//Vistas
import Vista.Usuario.Citas;
import Vista.Usuario.HistorialCitas;
import Vista.Usuario.Recetas;
//JFRAME
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorCitas implements ActionListener {
    private Citas VentanaCitas = new Citas();
    private HistorialCitas VentanaHistorialCitas = new HistorialCitas();
    private Recetas VentanaRecetas = new Recetas();
    
    public ControladorCitas() {
        System.out.println("Estoy en citas");
        this.VentanaCitas.btnCitas.addActionListener(this);
        this.VentanaCitas.btnRecetas.addActionListener(this);
        this.VentanaCitas.btnHistorialcitas.addActionListener(this);
        
        this.VentanaCitas.btnInicio.addActionListener(this);
        this.VentanaCitas.btnCerrarsesion.addActionListener(this);
        //CENTRAR LA VENTANA Y HACERLO VISIBLE
        VentanaCitas.setLocationRelativeTo(null);
        VentanaCitas.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VentanaCitas.btnCitas) {
            //llamas al controlador citas
            new ControladorCitas();
        }
        if (e.getSource() == VentanaCitas.btnRecetas) {
            //llamas al controlador recetas
            new ControladorRecetas();
        }
        if (e.getSource() == VentanaCitas.btnHistorialcitas) {
            //llamas al controlador HistorialCitas
            new ControladorHistorial();
        }
    }
}
