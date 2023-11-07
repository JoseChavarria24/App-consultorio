/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alejb
 */
public class ConexionBD {

    private static Connection conexion = null;

    public static Connection getConexionBD() {
        try {
            String url = "jdbc:mysql://localhost/NOMBRE DE LA BD";//Incompleto
            String usuario = "USUARIO";//Incompleto
            String password = "CONTRASEÑA";//Incompleto
            conexion = (Connection) DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(0);
        }
        return conexion;

    }
}
