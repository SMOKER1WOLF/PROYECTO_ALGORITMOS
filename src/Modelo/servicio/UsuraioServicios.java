/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.servicio;

import Modelo.EntidadUsuario;

/**
 *
 * @author user
 */
public interface UsuraioServicios {
    
     public EntidadUsuario obtenerUsuario(String correo,String contraseña);
     public int Registrar (Object[]x);
    
}
