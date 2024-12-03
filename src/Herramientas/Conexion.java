/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herramientas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String DATABASE_DRIVE = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
    private static final String USUARIO = "userSQL";
    private static final String CLAVE = "Qwerty123";
    private static final String MAX_POOL = "250";
    private static final String ENCRYT = "true";
    private static final String TRUSH = "true";

    private Connection con;
    private Properties pro;

    private Properties getProperties() {

        if (pro == null) {
            pro = new Properties();
            pro.setProperty("user", USUARIO);
            pro.setProperty("password", CLAVE);
            pro.setProperty("MaxPooledStatements", MAX_POOL);
            pro.setProperty("encrypt", ENCRYT);
            pro.setProperty("trustServerCertificate", TRUSH);
        }

        return pro;
    }

    public Connection establecerConexion() {
        if (con == null) {
            try {
                Class.forName(DATABASE_DRIVE);
                con = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (Exception ex) {
                System.out.println(ex.toString());
                LE.mostrarError("No se pudo conectar a la base de datos");
            }

        }

        return con;
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
                con = null;
            } catch (Exception ex) {
                System.out.println(ex.toString());
                LE.mostrarError("Error al desconectarse a la Base Datos");
            }
        }
    }

}
