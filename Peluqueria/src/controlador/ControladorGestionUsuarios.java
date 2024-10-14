package controlador;

//import java.math.BigDecimal;
import java.util.List;

import modelo.Trabajadores;
import modelo.TrabajadoresDAO;

public class ControladorGestionUsuarios{
    private TrabajadoresDAO trabajadoresDAO;
    public ControladorGestionUsuarios() {
        this.trabajadoresDAO = new TrabajadoresDAO();
    }

    public List<Trabajadores> mostrarTrabajadores() {
        return trabajadoresDAO.mostrarTrabajadores();
    }
    //public Trabajadores todoTrabajadores(String dni, String nombre_trabajador, String apellido_trabajador, String correo_trabajador, String telefono_trabajador, String contrasena,Boolean trabajador_activo, Boolean tipo_trabajador, BigDecimal comision) {
    //    return trabajadoresDAO.todosTrabajadores(dni,nombre_trabajador, apellido_trabajador,correo_trabajador,telefono_trabajador,contrasena,trabajador_activo,tipo_trabajador,comision);
    //}
}