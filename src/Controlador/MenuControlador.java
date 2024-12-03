/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Venta;
import Herramientas.Conexion;
import Herramientas.LE;
import Herramientas.Prevalencia;
import Modelo.EntidadUsuario;
import Modelo.servicios.impl.Usuario;
import Vistas.LoginView;
import Vistas.MenuView;
import Vistas.VentaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class MenuControlador implements ActionListener {

    private MenuView menu;

    Venta vnt = new Venta();
    Usuario usu = new Usuario();
    LoginView login = new LoginView();
    VentaView venta = new VentaView();

    public MenuControlador(MenuView menu) {
        this.menu = menu;

        this.menu.COMPRA.addActionListener(this);
        this.menu.COMPRA1.addActionListener(this);
        this.menu.COMPRA2.addActionListener(this);
        this.menu.COMPRA3.addActionListener(this);
        this.menu.COMPRA4.addActionListener(this);
        this.menu.COMPRA5.addActionListener(this);
        this.menu.cerrarSesion.addActionListener(this);
        this.menu.comprar.addActionListener(this);
    }

    public void iniciar() {
        menu.setTitle("Menu");
        menu.setLocationRelativeTo(null);

        menu.txtbienvenida.setText("Bienvenido(a): " + Prevalencia.getUsuario().getNomb() + " " + Prevalencia.getUsuario().getApllP() + " " + Prevalencia.getUsuario().getApllM());
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.fondo, "C:/Users/user/Desktop/Imagenes/FONDO FUEGO.JPG");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.menu, "C:/Users/user/Desktop/Imagenes/menu.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.platillo1, "C:/Users/user/Desktop/Imagenes/platillo1.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.jLabel1, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.detalles, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.platillo2, "C:/Users/user/Desktop/Imagenes/platillo2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.platillo3, "C:/Users/user/Desktop/Imagenes/platillo3.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.detalles2, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.platillo4, "C:/Users/user/Desktop/Imagenes/platillo4.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.detalles2, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.detalles1, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.platillo5, "C:/Users/user/Desktop/Imagenes/platillo5.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.detalles3, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.platillo6, "C:/Users/user/Desktop/Imagenes/platillo6.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(menu.detalles4, "C:/Users/user/Desktop/Imagenes/fondo.png");

        menu.COMPRA.setName("COMPRA");
        menu.COMPRA1.setName("COMPRA1");
        menu.COMPRA2.setName("COMPRA2");
        menu.COMPRA3.setName("COMPRA3");
        menu.COMPRA4.setName("COMPRA4");
        menu.COMPRA5.setName("COMPRA5");
        menu.cerrarSesion.setName("cerrarSesion");
        menu.comprar.setName("comprar");
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonName = source.getName();

        switch (buttonName) {

            case "COMPRA":
                VentaControlador venta1 = new VentaControlador(venta, 2, "C:/Users/user/Desktop/Imagenes/platillo2.png");
                venta1.iniciar();
                venta.setVisible(true);
                menu.dispose();
                break;

            case "COMPRA1":
                VentaControlador venta2 = new VentaControlador(venta, 1, "C:/Users/user/Desktop/Imagenes/platillo1.png");
                venta2.iniciar();
                venta.setVisible(true);
                menu.dispose();
                break;

            case "COMPRA2":
                VentaControlador venta3 = new VentaControlador(venta, 3, "C:/Users/user/Desktop/Imagenes/platillo3.png");
                venta3.iniciar();
                venta.setVisible(true);
                menu.dispose();
                break;

            case "COMPRA3":
                VentaControlador venta4 = new VentaControlador(venta, 4, "C:/Users/user/Desktop/Imagenes/platillo4.png");
                venta4.iniciar();
                venta.setVisible(true);
                menu.dispose();
                break;

            case "COMPRA4":
                VentaControlador venta5 = new VentaControlador(venta, 5, "C:/Users/user/Desktop/Imagenes/platillo5.png");
                venta5.iniciar();
                venta.setVisible(true);
                menu.dispose();
                break;

            case "COMPRA5":
                VentaControlador venta6 = new VentaControlador(venta, 6, "C:/Users/user/Desktop/Imagenes/platillo6.png");
                venta6.iniciar();
                venta.setVisible(true);
                menu.dispose();
                break;

            case "cerrarSesion":
                LE.mostrarInformacion("Hasta la proxima " + Prevalencia.getUsuario().getNomb() + " " + Prevalencia.getUsuario().getApllP() + " " + Prevalencia.getUsuario().getApllM());
                Prevalencia.setUsuario(null);

                LoginControlador nuevaSesion = new LoginControlador(login, usu);
                nuevaSesion.iniciar();
                menu.dispose();
                login.setVisible(true);

                Conexion conexion = new Conexion();
                conexion.disconnect();

                break;

            case "comprar":
                LE.mostrarInformacion(buttonName);
                break;

        }
    }
}
