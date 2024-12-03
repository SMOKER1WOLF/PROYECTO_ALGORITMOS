/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class DetalleVenta {

    String item;
    int codPro;
    String descripcion;
    int idProm;
    int cntd;
    double sub;
    double add;
    double dcto;
    double total;
    
    

    public int getIdProm() {
        return idProm;
    }

    public void setIdProm(int idProm) {
        this.idProm = idProm;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCntd() {
        return cntd;
    }

    public void setCntd(int cntd) {
        this.cntd = cntd;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getDcto() {
        return dcto;
    }

    public void setDcto(double dcto) {
        this.dcto = dcto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

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
