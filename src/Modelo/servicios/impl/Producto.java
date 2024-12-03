/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.servicios.impl;

import Herramientas.Conexion;
import Herramientas.LE;
import Modelo.EntidadProducto;
import Modelo.servicio.ProductoServicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ANTHONY
 */
public class Producto implements ProductoServicios {
     
    PreparedStatement ps ;
    ResultSet rs;
    
    
    Conexion con = new Conexion();
    Connection acces;
    
    @Override
    public EntidadProducto recogerDatos(int id ){
        EntidadProducto ep = new EntidadProducto();
        String sql = "select * from Producto where idProducto = ? ";
        try{
            acces = con.establecerConexion();
            ps = acces.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
                while(rs.next()){
                    ep.setIdProducto(rs.getInt(1));
                    ep.setNombreProducto(rs.getString(2));
                    ep.setDescripcionProducto(rs.getString(3));
                    ep.setPrecioProducto(rs.getDouble(4));

                }
        }catch(Exception e){
            System.out.println(e);
            LE.mostrarError("Error al conectarse con la base de datos");
        }
        return ep;
    }
}
