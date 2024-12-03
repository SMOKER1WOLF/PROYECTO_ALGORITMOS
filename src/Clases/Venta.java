/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Herramientas.Conexion;
import Modelo.EntidadDetalleVenta;
import Modelo.EntidadVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ANTHONY
 */
public class Venta {

    PreparedStatement ps;
    ResultSet rs;

    EntidadVenta ev = new EntidadVenta();
    Conexion con = new Conexion();
    Connection acces;
    int rpt = 0;

    public int idVenta() {
        int idv = 0;
        String sql = "select max(idVenta) from Venta";
        try {
            acces = con.establecerConexion();
            ps = acces.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idv = rs.getInt(1);
            }
        } catch (Exception e) {

        }
        return idv;
    }

    public int guardarVenta(EntidadVenta ven) {
        EntidadVenta ev = new EntidadVenta();
        String sql = "insert into Venta (idUsuario,fechaVenta,monto) values (?,?,?)";
        try {
            acces = con.establecerConexion();
            ps = acces.prepareStatement(sql);
            ps.setInt(1, ven.getIdUsuario());
            ps.setString(2, ven.getFecha());
            ps.setDouble(3, ven.getMonto());

            rpt = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println(e);
        }
        return rpt;
    }

    public int guradarDetalleVenta(EntidadDetalleVenta edv) {
        String sql = "insert into detalleVenta (idProducto,idVenta,idPromocion,unidadesVendidas,precioNeto,precioAdicionales,precioVentaFinal) values (?,?,?,?,?,?,?)";
        try {
            acces = con.establecerConexion();
            ps = acces.prepareStatement(sql);
            ps.setInt(1, edv.getIdProducto());
            ps.setInt(2, edv.getIdVenta());
            ps.setInt(3, edv.getIdPromocion());
            ps.setInt(4, edv.getCntd());
            ps.setDouble(5, edv.getPrecioNeto());
            ps.setDouble(6, edv.getPrecioAdicional());
            ps.setDouble(7, edv.getPrecioVentaFinal());
            rpt = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rpt;
    }

    public EntidadVenta traerId(String idU, String fecha, double monto) {
        EntidadVenta evu = new EntidadVenta();
        String sql = "select * from Venta where idUsuario = ? and fechaVenta = ? and monto = ? ";
        try {
            acces = con.establecerConexion();
            ps = acces.prepareStatement(sql);
            ps.setString(1, idU);
            ps.setString(2, fecha);
            ps.setDouble(3, monto);
            rs = ps.executeQuery();
            while (rs.next()) {
                evu.setIdVenta(rs.getInt(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return evu;
    }


}
