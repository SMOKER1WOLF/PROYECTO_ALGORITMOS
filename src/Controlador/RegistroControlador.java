/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Herramientas.LE;
import Modelo.servicios.impl.Usuario;
import Vistas.LoginView;
import Vistas.RegistroView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class RegistroControlador implements ActionListener {
    
    private RegistroView registro;
    private Usuario usuario;
    
    Usuario usu = new Usuario();
    LoginView login = new LoginView();
    RegistroView reg = new RegistroView();

    public RegistroControlador(RegistroView reg, Usuario user) {
        this.registro = reg;
        this.usuario = user;
        this.registro.btnRegistrar.addActionListener(this);
        this.registro.btnAtras.addActionListener(this);
    }

    public void iniciar() {
        registro.setTitle("Registro");
        registro.setLocationRelativeTo(null);
        String[] distritos = {"VILLA EL SALVADOR", "VILLA MARIA DEL TRIUNFO", "SAN JUAN DE MIRAFLORES", "LURIN", "SANTIAGO DE SURCO", "CHORRILLOS", "SAN BORJA", "MIRAFLORES", "BARRANCO", "SURQUILLO", "LA MOLINA"};
        for (int t = 0; t <= distritos.length - 1; t++) {
            registro.cbxDistritos.addItem(distritos[t]);
        }
        rsscalelabel.RSScaleLabel.setScaleLabel(registro.lblLogo, "C:/Users/user/Desktop/imagenes/logoBN.png");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registro.btnRegistrar) {
            if (registro.txtDNI.getText().isEmpty() || registro.txtNombre.getText().isEmpty() || registro.txtAP.getText().isEmpty() || registro.txtAM.getText().isEmpty() || registro.txtCorreo.getText().isEmpty() || registro.txtPass.getText().isEmpty() || registro.txtTelefono.getText().isEmpty() || registro.txtDireccion.getText().isEmpty() || registro.cbxDistritos.getSelectedItem().toString().isEmpty()) {

                LE.mostrarAdvertencia("*Debe llenar los campos solicitados*");
            } else {

                String DNI = registro.txtDNI.getText();
                String nomb = registro.txtNombre.getText();
                String apllP = registro.txtAP.getText();
                String apllM = registro.txtAM.getText();
                String correo = registro.txtCorreo.getText();
                String psw = registro.txtPass.getText();
                String tlf = registro.txtTelefono.getText();
                String distrito = registro.cbxDistritos.getSelectedItem().toString();
                String direccion = registro.txtDireccion.getText();
                Object[] x = new Object[9];
                x[0] = DNI;
                x[1] = nomb;
                x[2] = apllP;
                x[3] = apllM;
                x[4] = correo;
                x[5] = psw;
                x[6] = tlf;
                x[7] = distrito;
                x[8] = direccion;

                usuario.Registrar(x);
                LE.mostrarInformacion("Registro exitoso");

                LoginControlador ctrl = new LoginControlador(login, usu);
                ctrl.iniciar();
                login.setVisible(true);
                registro.dispose();
            }

        } else if (e.getSource() == registro.btnAtras) {

            LoginControlador ctrl = new LoginControlador(login, usu);
            ctrl.iniciar();
            login.setVisible(true);
            registro.dispose();
        }

    }
}
