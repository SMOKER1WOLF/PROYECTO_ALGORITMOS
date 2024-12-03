/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.servicio;

import Clases.DetalleVenta;
import java.util.HashMap;

/**
 *
 * @author user
 */
public interface DVE {
    
    public double sacarCuenta(HashMap<String, DetalleVenta> listaDetalle);
    public void eliminarCompra(String codigo, HashMap<String, DetalleVenta> listaDetalle);
    public void guardarDetalleVenta(String codigo, DetalleVenta nuevoDetalle, HashMap<String, DetalleVenta> listaDetalle);
}
