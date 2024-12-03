/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.servicios.impl;

import Herramientas.Conexion;
import Herramientas.LE;
import Modelo.EntidadUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import Modelo.servicio.UsuraioServicios;

public class Usuario implements UsuraioServicios {

    PreparedStatement ps;
    ResultSet rs;

    EntidadUsuario eu = new EntidadUsuario();
    Conexion con = new Conexion();
    Connection acces;

    @Override
    public EntidadUsuario obtenerUsuario(String correo, String contraseña) {
        if (eu != null) {
            String sql = "select * from Usuario where correo = ? and contraseña = ? ";
            try {
                acces = con.establecerConexion();
                ps = acces.prepareStatement(sql);
                ps.setString(1, correo);
                ps.setString(2, contraseña);
                rs = ps.executeQuery();
                while (rs.next()) {
                    eu.setId(rs.getInt(1));
                    eu.setDNI(rs.getString(2));
                    eu.setNomb(rs.getString(3));
                    eu.setApllP(rs.getString(4));
                    eu.setApllM(rs.getString(5));
                    eu.setCorreo(rs.getString(6));
                    eu.setPsw(rs.getString(7));
                    eu.setTlf(rs.getString(8));
                    eu.setDistrito(rs.getString(9));
                    eu.setDireccion(rs.getString(10));
                }

            } catch (Exception e) {
                System.out.println(e);
                LE.mostrarError("Error en la conexion a la base de datos");
            }

        }
        return eu;
    }

    @Override
    public int Registrar(Object[] x) {
        int r = 0;
        String sql = "insert into Usuario (DNI, nombreUsuario, apLLPaterno, apLLMaterno, correo, contraseña, telefono, distrito, direccion) values (?,?,?,?,?,?,?,?,?)";
        try {
            acces = con.establecerConexion();
            ps = acces.prepareStatement(sql);
            ps.setObject(1, x[0]);
            ps.setObject(2, x[1]);
            ps.setObject(3, x[2]);
            ps.setObject(4, x[3]);
            ps.setObject(5, x[4]);
            ps.setObject(6, x[5]);
            ps.setObject(7, x[6]);
            ps.setObject(8, x[7]);
            ps.setObject(9, x[8]);
            r = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
}
