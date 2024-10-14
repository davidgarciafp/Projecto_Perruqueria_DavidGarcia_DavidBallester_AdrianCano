package controlador;

import java.util.List;

import modelo.Trabajadores;
import modelo.TrabajadoresDAO;

public class ControladorIniciarSesion {
    private TrabajadoresDAO trabajadoresDAO;

    // Constructor
    public ControladorIniciarSesion() {
        this.trabajadoresDAO = new TrabajadoresDAO();
    }

    public List<Trabajadores> mostrarTrabajadores() {
        return trabajadoresDAO.mostrarTrabajadores();
    }

    public Trabajadores identificarTrabajador(String dni, String contrasena) {
        return trabajadoresDAO.identificarTrabajador(dni, contrasena);
    }
}