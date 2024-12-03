/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Herramientas.LE;
import Modelo.EntidadDVE;
import Modelo.EntidadProducto;
import Modelo.servicios.impl.Producto;
import Vistas.MenuView;
import Vistas.VentaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 *
 * @author user
 */
public class VentaControlador implements ActionListener {

    Producto pro = new Producto();
    EntidadProducto prod = new EntidadProducto();
    EntidadDVE dve = new EntidadDVE();
    VentaView v = new VentaView();

    private VentaView venta;
    private String url;

    public VentaControlador(VentaView venta, int id, String url) {
        this.venta = venta;
        this.prod = pro.recogerDatos(id);
        this.url = url;

        this.venta.AtrAs.addActionListener(this);
        this.venta.btnActualizar.addActionListener(this);
        this.venta.btnComprar.addActionListener(this);

    }

    //DATOS PARA LA ENTIDA DVE nooooooooo
    private double costoPlatos;
    private double adicional;
    private double total;
    private double ad1, ad2, ad3, ad4, ad5, ad6, ad7; //precio adicional
    private String ds1 = ""; //descripcion adicional
    private String ds2 = "";
    private String ds3 = "";
    private String ds4 = "";
    private String ds5 = "";
    private String ds6 = "";
    private String ds7 = "";

    public void iniciar() {
        venta.setTitle("Venta");
        venta.setLocationRelativeTo(null);
        venta.txtnombre.setText(prod.getNombreProducto());
        venta.txtdescripcion.setText("<html><p>" + prod.getDescripcionProducto() + "</p></html>");
        venta.txtprecio.setText(String.valueOf(prod.getPrecioProducto()));

        rsscalelabel.RSScaleLabel.setScaleLabel(venta.lblplatillo, url);
        rsscalelabel.RSScaleLabel.setScaleLabel(venta.fondoventa, "C:/Users/user/Desktop/Imagenes/logo don sabor.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(venta.gris, "C:/Users/user/Desktop/Imagenes/gris.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(venta.detalles, "C:/Users/user/Desktop/Imagenes/fondo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(venta.gris1, "C:/Users/user/Desktop/Imagenes/gris.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(venta.capat, "C:/Users/user/Desktop/Imagenes/griso.png");

        venta.AtrAs.setName("atras");
        venta.btnActualizar.setName("btnActualizar");
        venta.btnComprar.setName("btnComprar");

        venta.nCC.setVisible(false);
        venta.cc.setVisible(false);
        venta.nIK.setVisible(false);
        venta.ik.setVisible(false);
        venta.nF.setVisible(false);
        venta.fnt.setVisible(false);
        venta.nS.setVisible(false);
        venta.sp.setVisible(false);
        venta.nARR.setVisible(false);
        venta.arr.setVisible(false);
        venta.nPP.setVisible(false);
        venta.pp.setVisible(false);
        venta.nENS.setVisible(false);
        venta.ens.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonName = source.getName();

        switch (buttonName) {
            case "atras":
                MenuView menu = new MenuView();
                MenuControlador mncrtl = new MenuControlador(menu);
                mncrtl.iniciar();
                menu.setVisible(true);
                venta.dispose();
                break;

            case "btnActualizar":
                if (venta.btnAdd1.isSelected() == true) {
                    ad1 = 3;
                    venta.nCC.setVisible(true);
                    venta.cc.setVisible(true);
                    ds1 = " , " + venta.nCC.getText() + " Coca Cola";
                } else {
                    ad1 = 0;
                    venta.nCC.setVisible(false);
                    venta.cc.setVisible(false);
                    ds1 = "";
                }
                if (venta.btnAdd2.isSelected() == true) {
                    ad2 = 3;
                    venta.nIK.setVisible(true);
                    venta.ik.setVisible(true);
                    ds2 = " , " + venta.nIK.getText() + " Inka Kola";
                } else {
                    ad2 = 0;
                    venta.nIK.setVisible(false);
                    venta.ik.setVisible(false);
                    ds2 = "";
                }

                if (venta.btnAdd3.isSelected() == true) {
                    ad3 = 2.5;
                    venta.nF.setVisible(true);
                    venta.fnt.setVisible(true);
                    ds3 = " , " + venta.nF.getText() + " Fanta";
                } else {
                    ad3 = 0;
                    venta.nF.setVisible(false);
                    venta.fnt.setVisible(false);
                    ds3 = "";
                }
                if (venta.btnAdd4.isSelected() == true) {
                    ad4 = 2.5;
                    venta.nS.setVisible(true);
                    venta.sp.setVisible(true);
                    ds4 = " , " + venta.nS.getText() + " Sprite";
                } else {
                    ad4 = 0;
                    venta.nS.setVisible(false);
                    venta.sp.setVisible(false);
                    ds4 = "";
                }
                if (venta.btnAdd5.isSelected() == true) {
                    ad5 = 6;
                    venta.nPP.setVisible(true);
                    venta.pp.setVisible(true);
                    ds5 = " , " + venta.nPP.getText() + " Papas a la parrilla";
                } else {
                    ad5 = 0;
                    venta.nPP.setVisible(false);
                    venta.pp.setVisible(false);
                    ds5 = "";
                }
                if (venta.btnAdd6.isSelected() == true) {
                    ad6 = 5;
                    venta.nARR.setVisible(true);
                    venta.arr.setVisible(true);
                    ds6 = " , " + venta.nARR.getText() + " Porcion de arroz";
                } else {
                    ad6 = 0;
                    venta.nARR.setVisible(false);
                    venta.arr.setVisible(false);
                    ds6 = "";
                }
                if (venta.btnAdd7.isSelected() == true) {
                    ad7 = 3.5;
                    venta.nENS.setVisible(true);
                    venta.ens.setVisible(true);
                    ds7 = " , " + venta.nENS.getText() + " Ensalada";
                } else {
                    ad7 = 0;
                    venta.nENS.setVisible(false);
                    venta.ens.setVisible(false);
                    ds7 = "";
                }

                adicional = ad1 * Integer.parseInt(venta.nCC.getText()) + ad2 * Integer.parseInt(venta.nIK.getText()) + ad3 * Integer.parseInt(venta.nF.getText()) + ad4 * Integer.parseInt(venta.nS.getText()) + ad5 * Integer.parseInt(venta.nPP.getText()) + ad6 * Integer.parseInt(venta.nARR.getText()) + ad7 * Integer.parseInt(venta.nENS.getText());
                costoPlatos = prod.getPrecioProducto() * Integer.parseInt(venta.cntdPlatos.getSelectedItem().toString());
                total = costoPlatos + adicional;
                String descripcion = venta.cntdPlatos.getSelectedItem() + prod.getNombreProducto() + ds1 + ds2 + ds3 + ds4 + ds5 + ds6 + ds7;
                LE.mostrarInformacion(descripcion);
                LE.mostrarInformacion(String.valueOf(total));
                break;

            case "btnComprar":
//                System.out.println(ad1);
//                adicional = ad1 * Integer.parseInt(venta.nCC.getText()) + ad2 * Integer.parseInt(venta.nIK.getText()) + ad3 * Integer.parseInt(venta.nF.getText()) + ad4 * Integer.parseInt(venta.nS.getText()) + ad5 * Integer.parseInt(venta.nPP.getText()) + ad6 * Integer.parseInt(venta.nARR.getText()) + ad7 * Integer.parseInt(venta.nENS.getText());
//                costoPlatos = this.venta.precio * Integer.parseInt(venta.cntdPlatos.getSelectedItem().toString());
//                double total = costoPlatos + adicional;
//                String descripcion = prod.getNombreProducto() + ds1 + ds2 + ds3 + ds4 + ds5 + ds6 + ds7;
//                LE.mostrarInformacion(descripcion);
//                LE.mostrarInformacion(String.valueOf(total));
                break;

        }

//        if (e.getSource() == venta.btnAdd1) {
//            StringBuilder selectedOptions = new StringBuilder();
//        }
    }
}
