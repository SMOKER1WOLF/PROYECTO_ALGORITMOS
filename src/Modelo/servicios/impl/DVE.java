/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.servicios.impl;

import Clases.DetalleVenta;
import Clases.Main;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class DVE {

    public void guardarDetalleVenta(String codigo, DetalleVenta nuevoDetalle, HashMap<String, DetalleVenta> listaDetalle) {
        Main.listaDetalle.put(codigo, nuevoDetalle);
    }

    public static void eliminarCompra(String codigo, HashMap<String, DetalleVenta> listaDetalle) {
        Main.listaDetalle.remove(codigo);
    }

    public static double sacarCuenta(HashMap<String, DetalleVenta> listaDetalle) {
        double suma = 0;
        Iterator<String> it = listaDetalle.keySet().iterator();
        while (it.hasNext()) {
            String codigo = it.next();

            double subtotal = Main.listaDetalle.get(codigo).getTotal();
            suma = suma + subtotal;

        }
        return suma;
    }
}
