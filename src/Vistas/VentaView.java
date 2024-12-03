package Vistas;

import Modelo.EntidadProducto;
import Modelo.servicios.impl.Producto;
import Clases.Promocion;
import Modelo.servicios.impl.Usuario;
import Clases.DetalleVenta;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentaView extends javax.swing.JFrame {

    MenuView m1 = new MenuView();
    String url;
    private int ID;
    EntidadProducto ep = new EntidadProducto();
    Producto pro = new Producto();
    public double precio;
    DecimalFormat df = new DecimalFormat();

    //ATRIBUTOS DE DETALLEVENTA
    private String dscpPlato = "";
    private String descripcion;
    public double cuenta;
    public double descuento;

    //ATRIBUTOS PROPIOS
    private static Usuario user;
    public double adicional = 0;
    public double costoPlatos;
    public double ad1, ad2, ad3, ad4, ad5, ad6, ad7;
    String ds1 = "";
    String ds2 = "";
    String ds3 = "";
    String ds4 = "";
    String ds5 = "";
    String ds6 = "";
    String ds7 = "";
    int i = 0;

    //metodo para pasar el valor de jframe a jframe 
    public void traerPlatillo(String url) {
        this.url = url;
    }

    public VentaView() {
        initComponents();

//        m1 = MenuView.traerMenu();
//
//        nCC.setVisible(false);
//        nIK.setVisible(false);
//        nF.setVisible(false);
//        nS.setVisible(false);
//        cc.setVisible(false);
//        ik.setVisible(false);
//        fnt.setVisible(false);
//        sp.setVisible(false);
//        pp.setVisible(false);
//        arr.setVisible(false);
//        ens.setVisible(false);
//        nPP.setVisible(false);
//        nARR.setVisible(false);
//        nENS.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cntdPlatos = new javax.swing.JComboBox<>();
        btnAdd1 = new javax.swing.JRadioButton();
        btnAdd2 = new javax.swing.JRadioButton();
        btnAdd3 = new javax.swing.JRadioButton();
        btnAdd4 = new javax.swing.JRadioButton();
        txtprecio = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        AtrAs = new javax.swing.JButton();
        nCC = new javax.swing.JTextField();
        nIK = new javax.swing.JTextField();
        nF = new javax.swing.JTextField();
        nS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdd5 = new javax.swing.JRadioButton();
        btnAdd6 = new javax.swing.JRadioButton();
        btnAdd7 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nENS = new javax.swing.JTextField();
        nARR = new javax.swing.JTextField();
        nPP = new javax.swing.JTextField();
        razonDescuento = new javax.swing.JLabel();
        ens = new javax.swing.JLabel();
        arr = new javax.swing.JLabel();
        pp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        gris1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        ik = new javax.swing.JLabel();
        fnt = new javax.swing.JLabel();
        sp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gris = new javax.swing.JLabel();
        detalles = new javax.swing.JLabel();
        lblplatillo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        capat = new javax.swing.JLabel();
        fondoventa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cntdPlatos.setBackground(new java.awt.Color(0, 0, 0));
        cntdPlatos.setForeground(new java.awt.Color(255, 255, 0));
        cntdPlatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        cntdPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntdPlatosActionPerformed(evt);
            }
        });
        getContentPane().add(cntdPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        btnAdd1.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd1.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd1.setText("Coca Cola (600ml)");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        btnAdd2.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd2.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd2.setText("Inka Cola (600ml)");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        btnAdd3.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd3.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd3.setText("Fanta (600ml)");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, 20));

        btnAdd4.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd4.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd4.setText("Sprite (600ml)");
        btnAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        txtprecio.setForeground(new java.awt.Color(255, 255, 255));
        txtprecio.setText("precio");
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 60, 30));

        txtCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCuenta.setForeground(new java.awt.Color(255, 255, 0));
        txtCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCuenta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 60, 30));

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(btnActualizar.getFont().deriveFont((float)20));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 0));
        btnActualizar.setText("  ↻  Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnActualizar.setFocusPainted(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 210, 60));

        btnComprar.setBackground(new java.awt.Color(0, 0, 0));
        btnComprar.setFont(btnComprar.getFont().deriveFont((float)28));
        btnComprar.setForeground(new java.awt.Color(255, 255, 0));
        btnComprar.setText("🛒");
        btnComprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComprar.setFocusPainted(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 70, 50));

        AtrAs.setBackground(new java.awt.Color(0, 0, 0));
        AtrAs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrAs.setForeground(new java.awt.Color(255, 255, 0));
        AtrAs.setText("Atras ←");
        AtrAs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AtrAs.setFocusPainted(false);
        AtrAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrAsActionPerformed(evt);
            }
        });
        getContentPane().add(AtrAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, -1));

        nCC.setBackground(new java.awt.Color(51, 51, 51));
        nCC.setForeground(new java.awt.Color(255, 255, 255));
        nCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nCC.setText("1");
        nCC.setBorder(null);
        nCC.setCaretColor(new java.awt.Color(0, 0, 0));
        nCC.setDragEnabled(true);
        nCC.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 40, -1));

        nIK.setBackground(new java.awt.Color(51, 51, 51));
        nIK.setForeground(new java.awt.Color(255, 255, 255));
        nIK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nIK.setText("1");
        nIK.setBorder(null);
        nIK.setCaretColor(new java.awt.Color(0, 0, 0));
        nIK.setDragEnabled(true);
        nIK.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nIK, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 40, -1));

        nF.setBackground(new java.awt.Color(51, 51, 51));
        nF.setForeground(new java.awt.Color(255, 255, 255));
        nF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nF.setText("1");
        nF.setBorder(null);
        nF.setCaretColor(new java.awt.Color(0, 0, 0));
        nF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nF, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 40, -1));

        nS.setBackground(new java.awt.Color(51, 51, 51));
        nS.setForeground(new java.awt.Color(255, 255, 255));
        nS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nS.setText("1");
        nS.setBorder(null);
        nS.setCaretColor(new java.awt.Color(0, 0, 0));
        nS.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nS, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 40, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Extras:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, -1, -1));

        btnAdd5.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd5.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd5.setText("Papas a la parrilla (4 unds)");
        btnAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, -1, -1));

        btnAdd6.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd6.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd6.setText("Arroz (150g)");
        btnAdd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, -1, -1));

        btnAdd7.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd7.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd7.setText("Ensalada");
        btnAdd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, -1, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("S/6.00");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("S/5.00");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("S/3.50");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, -1, -1));

        nENS.setBackground(new java.awt.Color(51, 51, 51));
        nENS.setForeground(new java.awt.Color(255, 255, 255));
        nENS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nENS.setText("1");
        nENS.setBorder(null);
        nENS.setCaretColor(new java.awt.Color(0, 0, 0));
        nENS.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nENS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 390, 40, -1));

        nARR.setBackground(new java.awt.Color(51, 51, 51));
        nARR.setForeground(new java.awt.Color(255, 255, 255));
        nARR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nARR.setText("1");
        nARR.setBorder(null);
        nARR.setCaretColor(new java.awt.Color(0, 0, 0));
        nARR.setDragEnabled(true);
        nARR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nARR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, 40, -1));

        nPP.setBackground(new java.awt.Color(51, 51, 51));
        nPP.setForeground(new java.awt.Color(255, 255, 255));
        nPP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nPP.setText("1");
        nPP.setBorder(null);
        nPP.setCaretColor(new java.awt.Color(0, 0, 0));
        nPP.setDragEnabled(true);
        nPP.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(nPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, 40, -1));

        razonDescuento.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        razonDescuento.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(razonDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 480, 30));

        ens.setForeground(new java.awt.Color(204, 204, 204));
        ens.setText("N°Extras");
        getContentPane().add(ens, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, -1, -1));

        arr.setForeground(new java.awt.Color(204, 204, 204));
        arr.setText("N°Extras");
        getContentPane().add(arr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, -1, -1));

        pp.setForeground(new java.awt.Color(204, 204, 204));
        pp.setText("N°Extras");
        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio: S/.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 60, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contiene: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        txtdescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtdescripcion.setText("descripcion");
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 460, 60));

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnombre.setText("nombre");
        txtnombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 460, 40));
        getContentPane().add(gris1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 490, 10));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("S/2.50");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("S/3.00");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("S/3.00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("S/2.50");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        cc.setForeground(new java.awt.Color(204, 204, 204));
        cc.setText("N°Gaseosas");
        getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));

        ik.setForeground(new java.awt.Color(204, 204, 204));
        ik.setText("N°Gaseosas");
        getContentPane().add(ik, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        fnt.setForeground(new java.awt.Color(204, 204, 204));
        fnt.setText("N°Gaseosas");
        getContentPane().add(fnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        sp.setForeground(new java.awt.Color(204, 204, 204));
        sp.setText("N°Gaseosa");
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gaseosas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° de platos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, -1, -1));
        getContentPane().add(gris, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 490, 80));

        detalles.setText("jLabel1");
        getContentPane().add(detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 490, 460));
        getContentPane().add(lblplatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 570, 470));

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("don sabor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 60));

        capat.setText("jLabel9");
        getContentPane().add(capat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1180, 640));

        fondoventa.setForeground(new java.awt.Color(0, 0, 0));
        fondoventa.setText("jLabel1");
        getContentPane().add(fondoventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setID(int ID) {
        this.ID = ID;

        ep = pro.recogerDatos(ID);
        String dsc = "<html><p>" + ep.getDescripcionProducto() + "</p></html>";

        txtnombre.setText(ep.getNombreProducto());
        //Con el metodo ValueOf logramos convertir de Double a String
        txtprecio.setText(String.valueOf(ep.getPrecioProducto()));
        txtdescripcion.setText(dsc);
        ImageIcon im = new ImageIcon(url);
        lblplatillo.setIcon(im);

        this.precio = ep.getPrecioProducto();
    }

    public void setPosicionCuenta(int i) {
        this.i = i;
    }


    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed

        if (btnAdd1.isSelected() == true) {
            ad1 = 3;
            nCC.setVisible(true);
            cc.setVisible(true);
            ds1 = " , " + nCC.getText() + " Coca Cola";
        } else {
            ad1 = 0;
            nCC.setVisible(false);
            cc.setVisible(false);
            ds1 = "";
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed

        if (btnAdd2.isSelected() == true) {
            ad2 = 3;
            nIK.setVisible(true);
            ik.setVisible(true);
            ds2 = " , " + nIK.getText() + " Inka Kola";
        } else {
            ad2 = 0;
            nIK.setVisible(false);
            ik.setVisible(false);
            ds2 = "";
        }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
 
        if (btnAdd3.isSelected() == true) {
            ad3 = 2.5;
            nF.setVisible(true);
            fnt.setVisible(true);
            ds3 = " , " + nF.getText() + " Fanta";
        } else {
            ad3 = 0;
            nF.setVisible(false);
            fnt.setVisible(false);
            ds3 = "";
        }
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd4ActionPerformed

        if (btnAdd4.isSelected() == true) {
            ad4 = 2.5;
            nS.setVisible(true);
            sp.setVisible(true);
            ds4 = " , " + nS.getText() + " Sprite";
        } else {
            ad4 = 0;
            nS.setVisible(false);
            sp.setVisible(false);
            ds4 = "";
        }
    }//GEN-LAST:event_btnAdd4ActionPerformed

    private void AtrAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrAsActionPerformed

    }//GEN-LAST:event_AtrAsActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        adicional = ad1 * Integer.parseInt(nCC.getText()) + ad2 * Integer.parseInt(nIK.getText()) + ad3 * Integer.parseInt(nF.getText()) + ad4 * Integer.parseInt(nS.getText()) + ad5 * Integer.parseInt(nPP.getText()) + ad6 * Integer.parseInt(nARR.getText()) + ad7 * Integer.parseInt(nENS.getText());
        costoPlatos = this.precio * Integer.parseInt(cntdPlatos.getSelectedItem().toString());
        Promocion p = new Promocion();
        p = p.determinarDscto(Integer.parseInt(cntdPlatos.getSelectedItem().toString()));
        this.cuenta = costoPlatos + adicional - p.getDescuento();
        txtCuenta.setText(df.format(cuenta)); //imprimimos el total en un formato de 0.00, más amigable al usuario
        descripcion = dscpPlato + ds1 + ds2 + ds3 + ds4 + ds5 + ds6 + ds7;
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cntdPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntdPlatosActionPerformed
//
//        int cntdPl = Integer.parseInt(cntdPlatos.getSelectedItem().toString());
//        if (cntdPl > 0) {
//            dscpPlato = String.valueOf(cntdPl) + " " + ep.getNombreProducto();
//        } else {
//            dscpPlato = "";
//        }
//        Promocion p = new Promocion();
//        p = p.determinarDscto(Integer.parseInt(cntdPlatos.getSelectedItem().toString()));
//        razonDescuento.setText(p.getRazon());
//        cuenta = (this.precio * cntdPl) + adicional;
//

    }//GEN-LAST:event_cntdPlatosActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
//
//        if (btnComprar.isEnabled() == true && cuenta > 0) {
//            i++;
//            String pocision = "Pd" + i;
//            DetalleVentaFinal dvf = new DetalleVentaFinal();
//            Promocion p = new Promocion();
//            p = p.determinarDscto(Integer.parseInt(cntdPlatos.getSelectedItem().toString()));
////toma los atributos del ususario que haga login para pasarlo a cada detalle
//            DetalleVenta ndv = new DetalleVenta();
//            ndv.setItem(pocision);
//            ndv.setCodPro(ep.getIdProducto());
//            ndv.setDescripcion(descripcion);
//            ndv.setCntd(Integer.parseInt(cntdPlatos.getSelectedItem().toString()));
//            ndv.setSub(cuenta);
//            ndv.setAdd(adicional);
//            ndv.setIdProm(p.getIdPromo());
//            ndv.setDcto(p.getDescuento());
//            ndv.setTotal(cuenta - p.getDescuento());
//            ndv.guardarDetalleVenta(ndv.getItem(), ndv, LoginView.listaDetalle);
//            System.out.println(" codigo de compra: " + ndv.getItem() + " monto de la compra: " + ndv.getTotal());
//
////se usa el metodo sacarCuenta de la clase detalleVenta(este metodo suma todas las compras que haga
////el usurio en el programa, despues se lo envia al menu haciendo la funcion de un carrito)
//            m1.getPosicionCuenta(i);
////se utiliza para retornar el indice del codigo del detalleVenta al menu1, siendo posible almacenar 
////todas las compras en un hashMap listaDetalle
//            this.dispose();
//            m1.setVisible(true);
//        } else {
//            JOptionPane.showMessageDialog(null, "No ha comprado nada");
//        }
    }//GEN-LAST:event_btnComprarActionPerformed


    private void btnAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd5ActionPerformed
        if (btnAdd5.isSelected() == true) {
            ad5 = 6;
            nPP.setVisible(true);
            pp.setVisible(true);
            ds5 = " , " + nPP.getText() + " Papas a la parrilla";
        } else {
            ad5 = 0;
            nPP.setVisible(false);
            pp.setVisible(false);
            ds5 = "";
        }
    }//GEN-LAST:event_btnAdd5ActionPerformed

    private void btnAdd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd6ActionPerformed
        if (btnAdd6.isSelected() == true) {
            ad6 = 5;
            nARR.setVisible(true);
            arr.setVisible(true);
            ds6 = " , " + nARR.getText() + " Porcion de arroz";
        } else {
            ad6 = 0;
            nARR.setVisible(false);
            arr.setVisible(false);
            ds6 = "";
        }
    }//GEN-LAST:event_btnAdd6ActionPerformed

    private void btnAdd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd7ActionPerformed
        if (btnAdd7.isSelected() == true) {
            ad7 = 3.5;
            nENS.setVisible(true);
            ens.setVisible(true);
            ds7 = " , " + nENS.getText() + " Ensalada";
        } else {
            ad7 = 0;
            nENS.setVisible(false);
            ens.setVisible(false);
            ds7 = "";
        }

    }//GEN-LAST:event_btnAdd7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AtrAs;
    public javax.swing.JLabel arr;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JRadioButton btnAdd1;
    public javax.swing.JRadioButton btnAdd2;
    public javax.swing.JRadioButton btnAdd3;
    public javax.swing.JRadioButton btnAdd4;
    public javax.swing.JRadioButton btnAdd5;
    public javax.swing.JRadioButton btnAdd6;
    public javax.swing.JRadioButton btnAdd7;
    public javax.swing.JButton btnComprar;
    public javax.swing.JLabel capat;
    public javax.swing.JLabel cc;
    public javax.swing.JComboBox<String> cntdPlatos;
    public javax.swing.JLabel detalles;
    public javax.swing.JLabel ens;
    public javax.swing.JLabel fnt;
    public javax.swing.JLabel fondoventa;
    public javax.swing.JLabel gris;
    public javax.swing.JLabel gris1;
    public javax.swing.JLabel ik;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lblplatillo;
    public javax.swing.JTextField nARR;
    public javax.swing.JTextField nCC;
    public javax.swing.JTextField nENS;
    public javax.swing.JTextField nF;
    public javax.swing.JTextField nIK;
    public javax.swing.JTextField nPP;
    public javax.swing.JTextField nS;
    public javax.swing.JLabel pp;
    public javax.swing.JLabel razonDescuento;
    public javax.swing.JLabel sp;
    public javax.swing.JLabel txtCuenta;
    public javax.swing.JLabel txtdescripcion;
    public javax.swing.JLabel txtnombre;
    public javax.swing.JLabel txtprecio;
    // End of variables declaration//GEN-END:variables
}
