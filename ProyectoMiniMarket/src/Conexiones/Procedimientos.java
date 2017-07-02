/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;
import java.sql.CallableStatement;
import java.sql.SQLException;
/**
 *
 * @author Bryan
 */
public class Procedimientos {
    public static void EstradaUsuario(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call Entradausuario(?,?,?)}");
        entrada.setString(1, b);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }

}
