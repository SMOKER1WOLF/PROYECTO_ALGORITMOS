/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Herramientas.LE;
import Herramientas.Prevalencia;
import Modelo.EntidadUsuario;
import Modelo.servicios.impl.Usuario;
import Vistas.LoginView;
import Vistas.MenuView;
import Vistas.RegistroView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class LoginControlador implements ActionListener {

    private LoginView login;
    private Usuario usuario;

    public LoginControlador(LoginView log, Usuario user) {
        this.login = log;
        this.usuario = user;
        this.login.Ingresar.addActionListener(this);
        this.login.Registar.addActionListener(this);
    }

    public void iniciar() {
        login.setTitle("Login");
        login.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(login.logo, "C:/Users/user/Desktop/imagenes/logo.png");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.Ingresar) {
            EntidadUsuario eu = new EntidadUsuario();
            eu = usuario.obtenerUsuario(login.txtcorreo.getText(), login.txtcontraseña.getText());

            if (login.txtcorreo.getText().equals("") || login.txtcontraseña.getText().equals("")) {
                LE.mostrarAdvertencia("No puede deja casillas vacias");
                login.txtcorreo.requestFocus();
            } else {
                if (eu.getCorreo() != null && eu.getPsw() != null) {
                    LE.mostrarInformacion("Registro exitoso");
                    Prevalencia.setUsuario(eu);//obtener el ususario en todo el proyecto
                    
                    MenuView menu = new MenuView();
                    MenuControlador mncrtl = new MenuControlador(menu);
                    mncrtl.iniciar();
                    menu.setVisible(true);
                    
                    login.dispose();
                } else {
                    LE.mostrarError("Datos incorrectos");
                    login.txtcorreo.requestFocus();
                }
            }
        } else if (e.getSource() == login.Registar) {
            Usuario usu = new Usuario();
            RegistroView reg = new RegistroView();
            RegistroControlador registro = new RegistroControlador(reg, usu);
            registro.iniciar();
            reg.setVisible(true);
            login.dispose();
        }

    }

}
