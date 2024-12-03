/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herramientas;

import Modelo.EntidadUsuario;

/**
 *
 * @author user
 */
public class Prevalencia {
    private static EntidadUsuario usuario;
    private static double cuenta;
    private static int nDetalle;

    public static EntidadUsuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(EntidadUsuario usuario) {
        Prevalencia.usuario = usuario;
    }

    public static double getCuenta() {
        return cuenta;
    }

    public static void setCuenta(double cuenta) {
        Prevalencia.cuenta = cuenta;
    }

    public static int getnDetalle() {
        return nDetalle;
    }

    public static void setnDetalle(int nDetalle) {
        Prevalencia.nDetalle = nDetalle;
    }
    
    
}
