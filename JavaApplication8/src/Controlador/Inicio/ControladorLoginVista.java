package Controlador.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ListaUsuario;
import Modelo.Usuario;

import Vista.Inicio.LoginVista;
import Vista.Inicio.MenuVista;
import Vista.Inicio.RegistroVista;
//CONTROLADOR USUARIO CITAS
import Controlador.Usuario.ControladorCitas;
import Controlador.Admin.ControladorGestionarCitas;
import javax.swing.JOptionPane;
public class ControladorLoginVista  implements ActionListener {

    private LoginVista login = new LoginVista();
    private ListaUsuario lista= new ListaUsuario();
    private Usuario usuario=new Usuario();

    public ControladorLoginVista() {
        this.login.btnLogin.addActionListener(this); 
        this.login.btnRegistrarse.addActionListener(this);
        login.setVisible(true); // Mostrar la ventana de inicio
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==login.btnLogin){ 
            String usuario = login.txtUsuario.getText(); 
            String contraseña = login.jfcontra.getText(); 
            System.out.println(usuario + " " +contraseña);
            int pos = Usuario.verificarLogueo(usuario, contraseña);
            if(pos==-1){
                //USUARIO O CONTRASEÑA INCORRECTA
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑAS INCORRECTAS");
            }
            else{
                if ( pos==1) {
                    //controlador admin
                    System.out.println("soy admin");
                    new ControladorGestionarCitas();
                } 
                if (pos == 2) {
                    //controlador usuario
                    System.out.println("soy usuario");
                    new ControladorCitas();
                    login.dispose();
                }

            }

            }

        }
}