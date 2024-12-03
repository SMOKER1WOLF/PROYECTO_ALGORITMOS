/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vistas.VentaView;

/**
 *
 * @author user
 */
public class EntidadDVE {
    
    private String item; //CODIGO
    private int codPro; //ID DE PRODUCTO
    private String descripcion; //DESCRIPCION
    private int idProm; //ID DE LA PROMOCION
    private int cntd; // CANTIDAD
    private double sub; //PRECIO DE TOTAL DE PLATOS
    private double add; //PRECIO DE ADICIONALES
    private double dcto; //EL DESCUENTO EN RAZON DEL TOTAL
    private double total; //MONTO FINAL
    

    
    
    

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

    public int getIdProm() {
        return idProm;
    }

    public void setIdProm(int idProm) {
        this.idProm = idProm;
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

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
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
    
    
}
