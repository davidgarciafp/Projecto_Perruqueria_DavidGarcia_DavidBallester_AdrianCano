package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import basedatos.ConexionBaseDatos;

public class TrabajadoresDAO {

    public List<Trabajadores> mostrarTrabajadores() {
        String sqlMostrarTrabajadores = "SELECT * FROM Trabajadores";
        List<Trabajadores> listaTrabajadores = new ArrayList<>(); // Creamos un array para todos los trabajadores que existan en la BD.
        
        try (Connection conn = ConexionBaseDatos.getConexio();
            PreparedStatement sqlMostrarTrabajadoresStmt = conn.prepareStatement(sqlMostrarTrabajadores);
            ResultSet rs = sqlMostrarTrabajadoresStmt.executeQuery()) {
            
            while (rs.next()) {
                Trabajadores trabajadores = new Trabajadores(
                    rs.getString("dni"),
                    rs.getString("nombre_trabajador"),
                    rs.getString("apellido_trabajador"),
                    rs.getString("correo_trabajador"),
                    rs.getString("telefono_trabajador"),
                    rs.getString("contrasena"),
                    rs.getBoolean("trabajador_activo"),
                    rs.getBoolean("tipo_trabajador"),
                    rs.getBigDecimal("comision")
                );
                listaTrabajadores.add(trabajadores); // Els agrreguem al array.
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaTrabajadores;
    }

    public Trabajadores identificarTrabajador(String dni, String contrasena) {
        String sqlComprovarTrabajadores = "SELECT * FROM trabajadores WHERE dni = ? AND contrasena = ?";
        Trabajadores trabajadores = null;

        try (Connection conn = ConexionBaseDatos.getConexio();
            PreparedStatement psComprovarTrabajadores = conn.prepareStatement(sqlComprovarTrabajadores)) {

            psComprovarTrabajadores.setString(1, dni);
            psComprovarTrabajadores.setString(2, contrasena);
            ResultSet rs = psComprovarTrabajadores.executeQuery();
            if (rs.next()) {
                // Creamos un nuevo objeto trabajador.
                trabajadores = new Trabajadores(
                        rs.getString("dni"),
                        rs.getString("nombre_trabajador"),
                        rs.getString("apellido_trabajador"),
                        rs.getString("correo_trabajador"),
                        rs.getString("telefono_trabajador"),
                        rs.getString("contrasena"),
                        rs.getBoolean("trabajador_activo"),
                        rs.getBoolean("tipo_trabajador"),
                        rs.getBigDecimal("comision")
                );
            } else {
                trabajadores = null;
            }
        } catch (SQLException ex) {
            if (ex.getMessage().equals("BaseDatos NO encontrada")) {
                throw new RuntimeException("BaseDatos NO encontrada");
            } else {
                ex.printStackTrace();
            }
        }
        return trabajadores;
    }
    /*public Trabajadores todosTrabajadores(String dni, String nombre_trabajador, String apellido_trabajador, String correo_trabajador, String telefono_trabajador, String contrasena,Boolean trabajador_activo, Boolean tipo_trabajador, BigDecimal comision) {
        String sqlMostrarTrabajadores = "SELECT * FROM trabajadores";
        Trabajadores trabajadores = null;

        try (Connection conn = ConexionBaseDatos.getConexio();
            PreparedStatement psComprovarTrabajadores = conn.prepareStatement(sqlMostrarTrabajadores)) {

            psComprovarTrabajadores.setString(1, dni);
            psComprovarTrabajadores.setString(2, contrasena);
            ResultSet rs = psComprovarTrabajadores.executeQuery();
            if (rs.next()) {
                // Creamos un nuevo objeto trabajador.
                trabajadores = new Trabajadores(
                        rs.getString("dni"),
                        rs.getString("nombre_trabajador"),
                        rs.getString("apellido_trabajador"),
                        rs.getString("correo_trabajador"),
                        rs.getString("telefono_trabajador"),
                        rs.getString("contrasena"),
                        rs.getBoolean("trabajador_activo"),
                        rs.getBoolean("tipo_trabajador"),
                        rs.getBigDecimal("comision")
                );
            } else {
                trabajadores = null;
            }
        } catch (SQLException ex) {
            if (ex.getMessage().equals("BaseDatos NO encontrada")) {
                throw new RuntimeException("BaseDatos NO encontrada");
            } else {
                ex.printStackTrace();
            }
        }
        return trabajadores;
    }*/

}