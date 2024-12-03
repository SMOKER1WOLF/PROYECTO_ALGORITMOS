/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herramientas;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class Rescalado {
    
            public static void rescalado(JLabel labelname, String root){
        try{
            URL url = new URL(root);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenI = new ImageIcon(imagen);
            Icon icon = new ImageIcon(imagenI.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
            
            labelname.setIcon(icon);
            
        }catch(IOException e){
            e.printStackTrace();
            labelname.setText("Fallo al cargar imagen");
        }
        
    }
    
}
