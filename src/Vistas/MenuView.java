package Vistas;

import Modelo.EntidadUsuario;
import Modelo.servicios.impl.Usuario;
import Clases.DetalleVenta;
import Herramientas.Prevalencia;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MenuView extends javax.swing.JFrame {

    EntidadUsuario eu = new EntidadUsuario();
    Usuario user = new Usuario();
    public static MenuView m1 = new MenuView();
    

    private double cuenta = 0;
    private int iretornado = 0;
    DecimalFormat df = new DecimalFormat("0.00");


    public MenuView() {
        initComponents();

        eu = Prevalencia.getUsuario();

//        vercuenta.setText(String.valueOf(df.format(DetalleVenta.sacarCuenta(LoginView.listaDetalle))));



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vercuenta = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        COMPRA5 = new javax.swing.JButton();
        COMPRA4 = new javax.swing.JButton();
        COMPRA3 = new javax.swing.JButton();
        COMPRA2 = new javax.swing.JButton();
        COMPRA = new javax.swing.JButton();
        COMPRA1 = new javax.swing.JButton();
        txtbienvenida = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        platillo6 = new javax.swing.JLabel();
        detalles4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        platillo5 = new javax.swing.JLabel();
        detalles3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        platillo4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        detalles1 = new javax.swing.JLabel();
        detalles2 = new javax.swing.JLabel();
        platillo2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        platillo3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        detalles = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        platillo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        vercuenta1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        vercuenta2 = new javax.swing.JLabel();
        menu1 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();
        menu2 = new javax.swing.JLabel();
        platillo7 = new javax.swing.JLabel();
        detalles5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vercuenta.setFont(vercuenta.getFont().deriveFont((float)20));
        vercuenta.setForeground(new java.awt.Color(255, 255, 0));
        vercuenta.setText("0.0");
        getContentPane().add(vercuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 70, 90, 40));

        cerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        cerrarSesion.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 0));
        cerrarSesion.setText("Cerrar sesión");
        cerrarSesion.setBorderPainted(false);
        cerrarSesion.setFocusPainted(false);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        comprar.setBackground(new java.awt.Color(0, 0, 0));
        comprar.setFont(comprar.getFont().deriveFont((float)28));
        comprar.setForeground(new java.awt.Color(255, 255, 0));
        comprar.setText("🛒");
        comprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comprar.setFocusPainted(false);
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 70, 60, 40));

        COMPRA5.setBackground(new java.awt.Color(0, 0, 0));
        COMPRA5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        COMPRA5.setForeground(new java.awt.Color(255, 255, 0));
        COMPRA5.setText("+");
        COMPRA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRA5ActionPerformed(evt);
            }
        });
        getContentPane().add(COMPRA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 600, -1, 20));

        COMPRA4.setBackground(new java.awt.Color(0, 0, 0));
        COMPRA4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        COMPRA4.setForeground(new java.awt.Color(255, 255, 0));
        COMPRA4.setText("+");
        COMPRA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRA4ActionPerformed(evt);
            }
        });
        getContentPane().add(COMPRA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 370, -1, 20));

        COMPRA3.setBackground(new java.awt.Color(0, 0, 0));
        COMPRA3.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        COMPRA3.setForeground(new java.awt.Color(255, 255, 0));
        COMPRA3.setText("+");
        COMPRA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRA3ActionPerformed(evt);
            }
        });
        getContentPane().add(COMPRA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, -1, 20));

        COMPRA2.setBackground(new java.awt.Color(0, 0, 0));
        COMPRA2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        COMPRA2.setForeground(new java.awt.Color(255, 255, 0));
        COMPRA2.setText("+");
        COMPRA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRA2ActionPerformed(evt);
            }
        });
        getContentPane().add(COMPRA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, 20));

        COMPRA.setBackground(new java.awt.Color(0, 0, 0));
        COMPRA.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        COMPRA.setForeground(new java.awt.Color(255, 255, 0));
        COMPRA.setText("+");
        COMPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRAActionPerformed(evt);
            }
        });
        getContentPane().add(COMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, 20));

        COMPRA1.setBackground(new java.awt.Color(0, 0, 0));
        COMPRA1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        COMPRA1.setForeground(new java.awt.Color(255, 255, 0));
        COMPRA1.setText("+");
        COMPRA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPRA1ActionPerformed(evt);
            }
        });
        getContentPane().add(COMPRA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, 20));

        txtbienvenida.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        txtbienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtbienvenida.setText("bienvenida");
        getContentPane().add(txtbienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("S/23.90");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, -1, -1));

        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText(" Fritas + 1 Porción de Arroz con Choclo.");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 530, -1, -1));

        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("1 Pechuga Criolla + 1 Porción de Papas");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, -1, -1));

        jLabel27.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Pechuga a la parrilla");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

        platillo6.setText("jLabel1");
        platillo6.setAutoscrolls(true);
        getContentPane().add(platillo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 470, 190, 160));
        getContentPane().add(detalles4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 220, 160));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("S/33.90");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, -1, -1));

        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText(" de Papas a la parrilla.");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, -1, -1));

        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("fritos + 1 Ensalada Fresca + 1 Porción");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("1 Churrasco + 2 tajadas de plátanos");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, -1, -1));

        jLabel22.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Churrasco");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, -1, -1));

        platillo5.setText("jLabel1");
        platillo5.setAutoscrolls(true);
        getContentPane().add(platillo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 240, 190, 160));
        getContentPane().add(detalles3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, 220, 160));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("S/39.90");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, -1, -1));

        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("de Papas a la parrilla.");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("fritos + 1 Ensalada Fresca + 1 Porción");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, -1));

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("1 Bife Angosto + 2 tajadas de plátanos");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bife Angosto");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        platillo4.setText("jLabel1");
        platillo4.setAutoscrolls(true);
        getContentPane().add(platillo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 190, 160));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("S/25.90");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("parrilleras + 1 palito de anticucho.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("con choclo + 1 porción de papas");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("1 Bife de cerdo + 1 porción de arroz ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bife de cerdo con anticucho");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));
        getContentPane().add(detalles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 220, 160));
        getContentPane().add(detalles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 220, 160));

        platillo2.setText("jLabel1");
        platillo2.setAutoscrolls(true);
        getContentPane().add(platillo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 190, 160));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Pechuga parrillera con chorizo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("1 Pechuga + 1 porción de arroz con");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        platillo3.setText("jLabel1");
        platillo3.setAutoscrolls(true);
        getContentPane().add(platillo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 190, 160));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("choclo + 1 porción de papas + 1");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S/ 21.90");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("chorizo.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/23.90");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("papas parrilleras + 1 salchicha.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));
        getContentPane().add(detalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 220, 160));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("1 Filete de pierna + 1 porción de ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("arroz con choclo + 1 porción de");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Filete de pierna con salchicha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        platillo1.setText("jLabel1");
        platillo1.setAutoscrolls(true);
        getContentPane().add(platillo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 190, 160));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 160));

        menu.setText("jLabel1");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 240, 110));

        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));

        vercuenta1.setFont(vercuenta1.getFont().deriveFont((float)20));
        vercuenta1.setForeground(new java.awt.Color(255, 255, 0));
        vercuenta1.setText("0.0");
        getContentPane().add(vercuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 70, 90, 40));

        fondo1.setText("jLabel1");
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));

        fondo2.setText("jLabel1");
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));

        vercuenta2.setFont(vercuenta2.getFont().deriveFont((float)20));
        vercuenta2.setForeground(new java.awt.Color(255, 255, 0));
        vercuenta2.setText("0.0");
        getContentPane().add(vercuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 70, 90, 40));

        menu1.setText("jLabel1");
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 240, 110));

        fondo3.setText("jLabel1");
        getContentPane().add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));

        menu2.setText("jLabel1");
        getContentPane().add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 240, 110));

        platillo7.setText("jLabel1");
        platillo7.setAutoscrolls(true);
        getContentPane().add(platillo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 190, 160));
        getContentPane().add(detalles5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 220, 160));
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public static MenuView traerMenu() {
//        return MenuView.m1;
//    }


    //pasa el numero de pedidos que el cliente tenga dentro de una misma compra

//    public void getPosicionCuenta(int iretornado) {
//        this.iretornado = iretornado;
//        vercuenta.setText(String.valueOf(df.format(DetalleVenta.sacarCuenta(LoginView.listaDetalle))));
//    }


    private void COMPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRAActionPerformed

    }//GEN-LAST:event_COMPRAActionPerformed

    private void COMPRA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRA1ActionPerformed

    }//GEN-LAST:event_COMPRA1ActionPerformed

    private void COMPRA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRA2ActionPerformed

    }//GEN-LAST:event_COMPRA2ActionPerformed

    private void COMPRA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRA3ActionPerformed

    }//GEN-LAST:event_COMPRA3ActionPerformed

    private void COMPRA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRA4ActionPerformed

    }//GEN-LAST:event_COMPRA4ActionPerformed

    private void COMPRA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPRA5ActionPerformed
//
//        Venta v6 = new Venta();
//        String url = "src/imagenes/platillo6.png";
//        v6.traerPlatillo(url);
//        v6.setID(6);
//
//        v6.setPosicionCuenta(iretornado);
//        v6.setVisible(true);
//        this.setVisible(false);

    }//GEN-LAST:event_COMPRA5ActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed

    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
//        if (DetalleVenta.sacarCuenta(LoginView.listaDetalle) > 0) {
//            DetalleVentaFinal dvfn = new DetalleVentaFinal();
////            dvfn.setcuentaF(cuenta);
//            dvfn.setVisible(true);
//            this.setVisible(false);
////        dvfn.setDato(cuenta);
//        } else {
//            JOptionPane.showMessageDialog(null, "No ha registrado ninguna venta");
//        }

    }//GEN-LAST:event_comprarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton COMPRA;
    public javax.swing.JButton COMPRA1;
    public javax.swing.JButton COMPRA2;
    public javax.swing.JButton COMPRA3;
    public javax.swing.JButton COMPRA4;
    public javax.swing.JButton COMPRA5;
    public javax.swing.JButton cerrarSesion;
    public javax.swing.JButton comprar;
    public javax.swing.JLabel detalles;
    public javax.swing.JLabel detalles1;
    public javax.swing.JLabel detalles2;
    public javax.swing.JLabel detalles3;
    public javax.swing.JLabel detalles4;
    public javax.swing.JLabel detalles5;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel fondo1;
    public javax.swing.JLabel fondo2;
    public javax.swing.JLabel fondo3;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel menu;
    public javax.swing.JLabel menu1;
    public javax.swing.JLabel menu2;
    public javax.swing.JLabel platillo1;
    public javax.swing.JLabel platillo2;
    public javax.swing.JLabel platillo3;
    public javax.swing.JLabel platillo4;
    public javax.swing.JLabel platillo5;
    public javax.swing.JLabel platillo6;
    public javax.swing.JLabel platillo7;
    public javax.swing.JLabel txtbienvenida;
    public javax.swing.JLabel vercuenta;
    public javax.swing.JLabel vercuenta1;
    public javax.swing.JLabel vercuenta2;
    // End of variables declaration//GEN-END:variables
}
