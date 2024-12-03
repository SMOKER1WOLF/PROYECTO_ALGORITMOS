/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelo.EntidadDetalleVenta;
import Modelo.EntidadUsuario;
import Modelo.EntidadVenta;
import Clases.Venta;
import Clases.DetalleVenta;
import java.awt.print.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetalleVentaFinal extends javax.swing.JFrame {

    //ATRIBUTOS PAR BASE DE DATOS
    static int cod;
    static String descripcion;
    static int cntd;
    static double sub;
    static double dcto;
    static double total;
    //ATRIBUTOS NECESARIOS
    int n = LoginView.listaDetalle.size();
    MenuView m1 = new MenuView();
    EntidadUsuario eu = new EntidadUsuario();
    Venta v = new Venta();
    EntidadVenta ev = new EntidadVenta();
    EntidadDetalleVenta edv = new EntidadDetalleVenta();
    static int indiceDistrito;
    private String fecha;
    private String cliente;
    private double cuentaF;
    private static int item = 0;

    private double promo;
//    private String codigo;
    private String opc = null;
    DefaultTableModel modelo = new DefaultTableModel();
    DecimalFormat df = new DecimalFormat("0.00");
    private int m = 1;
    private double envio;

//METODOS DE BASE DE DATOS------------------------------------------------------------
    void traerDV(int codigo, String dscpt, double sub, double dscto, double total) {
        DetalleVentaFinal.cod = codigo;
        DetalleVentaFinal.descripcion = dscpt;
        DetalleVentaFinal.sub = sub;
        DetalleVentaFinal.dcto = dscto;
        DetalleVentaFinal.total = total;

        item++;

    }

    public static void traerIndice(int indice) {
        DetalleVentaFinal.indiceDistrito = indice;
    }
//------------------------------------------------------------------------------------------------

    public DetalleVentaFinal() {

        initComponents();

        m1 = MenuView.traerMenu();
        eu = LoginView.traerDatos();

        Calendar fecha = new GregorianCalendar();
        this.fecha = "" + fecha.get(Calendar.YEAR) + "-" + fecha.get(Calendar.MONTH) + "-" + fecha.get(Calendar.DAY_OF_MONTH);
        txtFecha.setText(this.fecha);

        if (indiceDistrito <= 10) {
            envio = 6;
            if (indiceDistrito <= 5) {
                envio = 4;
                if (indiceDistrito <= 2) {
                    envio = 3;
                }
            }
        }

        String columnas[] = {"Item", "Cod.Pro", "Descripción", "Sub", "Dscto", "Total",};

        modelo.setColumnIdentifiers(columnas);

        detalleProductos.setModel(modelo);

        //MODIFICA EL TAMAÑO DE LAS CELDAS
        detalleProductos.getColumnModel().getColumn(0).setPreferredWidth(1);
        detalleProductos.getColumnModel().getColumn(0).setResizable(false);
        detalleProductos.getColumnModel().getColumn(1).setPreferredWidth(1);
        detalleProductos.getColumnModel().getColumn(1).setResizable(false);
        detalleProductos.getColumnModel().getColumn(2).setPreferredWidth(400);
        detalleProductos.getColumnModel().getColumn(2).setResizable(false);
        detalleProductos.getColumnModel().getColumn(3).setPreferredWidth(1);
        detalleProductos.getColumnModel().getColumn(3).setResizable(false);
        detalleProductos.getColumnModel().getColumn(4).setPreferredWidth(1);
        detalleProductos.getColumnModel().getColumn(4).setResizable(false);
        detalleProductos.getColumnModel().getColumn(5).setPreferredWidth(1);
        detalleProductos.getColumnModel().getColumn(5).setResizable(false);

        for (int j = this.m; j <= n; j++) { //ESTA MANERA HACE QUE SE SE PUEDA EXTRAER EN ORDEN TODOS LOS CODIGOS DE VENTA
            String codigo = "Pd" + j;
            if (!(LoginView.listaDetalle.get(codigo) == null)) {
                Object[] x = new Object[]{codigo, LoginView.listaDetalle.get(codigo).getCodPro(), LoginView.listaDetalle.get(codigo).getDescripcion(), df.format(LoginView.listaDetalle.get(codigo).getSub()), df.format(LoginView.listaDetalle.get(codigo).getDcto()), df.format(LoginView.listaDetalle.get(codigo).getTotal())};
                modelo.addRow(x);
                comboCOD.addItem(codigo);
                detalleProductos.setModel(modelo);
            } else {
                n++;
            }
        }

        cuentaF = DetalleVenta.sacarCuenta(LoginView.listaDetalle) + envio;
        mostrarTotal.setText(df.format(cuentaF));
        cliente = eu.getNomb() + " " + eu.getApllP() + " " + eu.getApllM();
        lblNom.setText(cliente);
        lblDir.setText(eu.getDistrito() + " - " + eu.getDireccion());
        lblTel.setText(eu.getTlf());
        txtDNI.setText(eu.getDNI());

        costoEnvio.setText(String.valueOf(envio));
        rsscalelabel.RSScaleLabel.setScaleLabel(logoEmpresa, "src/Imagenes/logo.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReciboVenta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleProductos = new javax.swing.JTable();
        ConfirmarPedido = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblDir = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        mostrarTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoEmpresa = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        comboCOD = new javax.swing.JComboBox<>();
        SUBTITULO1 = new javax.swing.JLabel();
        SUBTITULO2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        SUBTITULO3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        costoEnvio = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReciboVenta.setBackground(new java.awt.Color(0, 0, 0));
        ReciboVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ReciboVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detalleProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detalleProductos.setToolTipText("");
        detalleProductos.setAlignmentX(10.0F);
        detalleProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        detalleProductos.setRowHeight(50);
        jScrollPane2.setViewportView(detalleProductos);

        ReciboVenta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 280, 730, 201));

        ConfirmarPedido.setBackground(new java.awt.Color(51, 51, 51));
        ConfirmarPedido.setForeground(new java.awt.Color(255, 255, 0));
        ConfirmarPedido.setText("Confirmar");
        ConfirmarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ConfirmarPedido.setFocusable(false);
        ConfirmarPedido.setRequestFocusEnabled(false);
        ConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarPedidoActionPerformed(evt);
            }
        });
        ReciboVenta.add(ConfirmarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 730, 96, 30));

        cancelar.setBackground(new java.awt.Color(51, 51, 51));
        cancelar.setForeground(new java.awt.Color(255, 255, 0));
        cancelar.setText("Atras ←");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelar.setFocusable(false);
        cancelar.setRequestFocusEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        ReciboVenta.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 729, 77, 29));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FECHA:");
        ReciboVenta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 70, -1));

        lblNom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNom.setForeground(new java.awt.Color(255, 255, 255));
        lblNom.setText("NOMBRE");
        ReciboVenta.add(lblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 320, 30));

        lblDir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDir.setForeground(new java.awt.Color(255, 255, 255));
        lblDir.setText("DIRECCION");
        ReciboVenta.add(lblDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 320, 30));

        lblTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTel.setForeground(new java.awt.Color(255, 255, 255));
        lblTel.setText("TELEFONO");
        ReciboVenta.add(lblTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 220, 30));

        mostrarTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostrarTotal.setForeground(new java.awt.Color(255, 255, 255));
        mostrarTotal.setText("0.00");
        ReciboVenta.add(mostrarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 66, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DIRECCIÓN :");
        ReciboVenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI:");
        ReciboVenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CLIENTE:");
        ReciboVenta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TELÉFONO :");
        ReciboVenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        logoEmpresa.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        logoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        ReciboVenta.add(logoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 260, 90));

        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(204, 255, 255));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtFecha.setText("FECHA");
        ReciboVenta.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 169, -1));

        comboCOD.setForeground(new java.awt.Color(0, 0, 0));
        comboCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCODActionPerformed(evt);
            }
        });
        ReciboVenta.add(comboCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        SUBTITULO1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SUBTITULO1.setForeground(new java.awt.Color(255, 255, 255));
        SUBTITULO1.setText("RESUMEN DE COMPRAS");
        ReciboVenta.add(SUBTITULO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        SUBTITULO2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SUBTITULO2.setForeground(new java.awt.Color(255, 255, 255));
        SUBTITULO2.setText("COSTO DE ENVIO");
        ReciboVenta.add(SUBTITULO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona el código de la compra que desea descartar ");
        ReciboVenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 20));

        btnActualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar.setFont(btnActualizar.getFont().deriveFont((float)14));
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
        ReciboVenta.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 99, -1));

        SUBTITULO3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SUBTITULO3.setForeground(new java.awt.Color(255, 255, 255));
        SUBTITULO3.setText("MODIFICAR COMPRAS");
        ReciboVenta.add(SUBTITULO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Presione el boton actualizar de Resumen de compras");
        ReciboVenta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("El costo de delivery es de : ");
        ReciboVenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, 20));

        costoEnvio.setForeground(new java.awt.Color(255, 255, 255));
        ReciboVenta.add(costoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 60, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total: ");
        ReciboVenta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 40, 30));

        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(255, 255, 255));
        ReciboVenta.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 20));

        getContentPane().add(ReciboVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarPedidoActionPerformed
        Impresion imp = new Impresion();
        imp.setSize(250, 780);
        imp.setVisible(true);
        imp.setDatos(fecha, cliente, eu.getTlf(), eu.getDistrito(), eu.getDireccion(), df.format(DetalleVenta.sacarCuenta(LoginView.listaDetalle)), df.format(DetalleVenta.sacarCuenta(LoginView.listaDetalle)+envio), df.format(this.envio));
        guardarVenta();
        guardarDetalle();
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(imp);
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        }
        JOptionPane.showMessageDialog(null, "PEDIDO EN CAMINO");
        this.dispose();
        imp.dispose();
    }//GEN-LAST:event_ConfirmarPedidoActionPerformed

    void guardarVenta() {
        ev.setIdUsuario(eu.getId());
        ev.setFecha(fecha);
        ev.setMonto(cuentaF);

        v.guardarVenta(ev);
    }

    void guardarDetalle() {
        
//        EntidadVenta ev1 = v .traerId(String.valueOf(ev.getIdUsuario()), ev.getFecha(), ev.getMonto());

        for (int j = this.m; j <= n; j++) { //ESTA MANERA HACE QUE SE SE PUEDA EXTRAER EN ORDEN TODOS LOS CODIGOS DE VENTA
            String codigo = "Pd" + j;
            if (!(LoginView.listaDetalle.get(codigo) == null)) {
                edv.setIdProducto(LoginView.listaDetalle.get(codigo).getCodPro());
                edv.setIdVenta(v.idVenta());
                edv.setIdPromocion(LoginView.listaDetalle.get(codigo).getIdProm());
                edv.setCntd(LoginView.listaDetalle.get(codigo).getCntd());
                edv.setPrecioNeto(LoginView.listaDetalle.get(codigo).getSub());
                edv.setPrecioAdicional(LoginView.listaDetalle.get(codigo).getAdd());
                edv.setPrecioVentaFinal(LoginView.listaDetalle.get(codigo).getTotal());
                
                v.guradarDetalleVenta(edv);
                
            } else {
                n++;
            }
        }

    }
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        m1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_cancelarActionPerformed

    private void comboCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCODActionPerformed

        opc = comboCOD.getSelectedItem().toString();

    }//GEN-LAST:event_comboCODActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        DetalleVenta.eliminarCompra(opc, LoginView.listaDetalle);//hace que se elimine el elemento seleccionado en el comboCOD
        this.m = 1;
        //HACE LA FUNCION DE REFRESCAR LA VENTANA Y ACTUALIZAR LA TABLA
        DetalleVentaFinal nv = new DetalleVentaFinal();
        nv.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleVentaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmarPedido;
    private javax.swing.JPanel ReciboVenta;
    private javax.swing.JLabel SUBTITULO1;
    private javax.swing.JLabel SUBTITULO2;
    private javax.swing.JLabel SUBTITULO3;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> comboCOD;
    private javax.swing.JLabel costoEnvio;
    private javax.swing.JTable detalleProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JLabel mostrarTotal;
    private javax.swing.JLabel txtDNI;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables

}
