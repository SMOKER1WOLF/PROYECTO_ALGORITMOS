/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANTHONY
 */
public class EntidadDetalleVenta {
    private int idDV;
    private int idVenta;
    private int idProducto;
    private int idPromocion;
    private int cntd;
    private double precioNeto;
    private double precioAdicional;
    private double precioVentaFinal;
//-------------------    
//    double cuentaF;
//-------------------
    public EntidadDetalleVenta() {
    }

    public EntidadDetalleVenta(int idDV, int idVenta, int idProducto, int idPromocion, int cntd, double precioNeto, double precioAdicional, double precioVentaFinal) {
        this.idDV = idDV;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.idPromocion = idPromocion;
        this.cntd = cntd;
        this.precioNeto = precioNeto;
        this.precioAdicional= precioAdicional;
        this.precioVentaFinal = precioVentaFinal;

    }

    public double getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    public int getIdDV() {
        return idDV;
    }

    public void setIdDV(int idDV) {
        this.idDV = idDV;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public int getCntd() {
        return cntd;
    }

    public void setCntd(int cntd) {
        this.cntd = cntd;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }

    public double getPrecioVentaFinal() {
        return precioVentaFinal;
    }

    public void setPrecioVentaFinal(double precioVentaFinal) {
        this.precioVentaFinal = precioVentaFinal;
    }
    
    
}
