/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import Controlador.LoginControlador;
import Controlador.RegistroControlador;
import Modelo.servicios.impl.Usuario;
import Vistas.LoginView;
import Vistas.RegistroView;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Main {
    
    public static HashMap<String, DetalleVenta> listaDetalle = new HashMap<>();

    public static void main(String[] args) {
            
            Usuario usuario = new Usuario();
            LoginView login = new LoginView();
            RegistroView reg = new RegistroView();

            LoginControlador ctrl = new LoginControlador(login,usuario);
            ctrl.iniciar();
            login.setVisible(true);
            
}}
