/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ANTHONY
 */
public class Promocion {
    int idPromo;
    double descuento;
    String razon;

    public Promocion() {
    }

    public Promocion(int idPromo, double descuento, String razon) {
        this.idPromo = idPromo;
        this.descuento = descuento;
        this.razon = razon;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
        public Promocion determinarDscto(int cntd) {
        Promocion epm = new Promocion ();
            switch(cntd){
                case 6:
                    epm.setIdPromo(1);
                    epm.setDescuento(cntd * .5);
                    epm.setRazon("Por la compra de 6 platos, le descontamos S/ 3");
                    break;
                case 7:
                    epm.setIdPromo(2);
                    epm.setDescuento(cntd * 1);
                    epm.setRazon("Por la compra de más de 7, le descontamos S/ 7");
                    break;
                case 8:
                    epm.setIdPromo(3);
                    epm.setDescuento(cntd * 1.5);
                    epm.setRazon("Por la compra de más de 8, le descontamos S/ 9.5");
                    break;
                default: 
                    epm.setIdPromo(10);
                    epm.setDescuento(0);
                    epm.setRazon(""); 
                    
                    
            }
        return epm;
    }
}
