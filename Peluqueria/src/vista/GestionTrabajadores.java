package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controlador.ControladorGestionUsuarios;
import modelo.Trabajadores;


public class GestionTrabajadores {
    private JLabel añadirTrabajador;
    private JLabel borrarTrabajador;
    private JLabel modificarTrabajador;
    private void posicioBotons(JPanel panel, Object trabajador) {
        panel.setBackground(new Color(220, 207, 201)); // Canviar de color.
        panel.setLayout(null);

        // Fuentes
        Font nFont16 = new Font("Arial", Font.PLAIN, 16);
        //Font nFont20 = new Font(null, Font.PLAIN, 20);


        // Cerrar Sesion
        ImageIcon botonAñadir = new ImageIcon("C:\\xampp\\htdocs\\MP_12 Projecte_1\\Imagenes\\Cerrar_Sesion.png");
        Image imagenRedimensionada = botonAñadir.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        añadirTrabajador = new JLabel(new ImageIcon(imagenRedimensionada));
        añadirTrabajador.setBounds(700, 50, 100, 100);
        añadirTrabajador.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor al pasar el mouse
        añadirTrabajador.addMouseListener(new MouseAdapter() {         // Agregar un MouseListener para manejar clics
            @Override
            public void mouseClicked(MouseEvent e) {
                cerrarSesion();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                añadirTrabajador.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                añadirTrabajador.setOpaque(false);
            }
        });
        panel.add(añadirTrabajador);



        ImageIcon iconoBorrar = new ImageIcon("C:\\xampp\\htdocs\\MP_12 Projecte_1\\Imagenes\\Cerrar_Sesion.png");
        Image imagenRedimensionada1 = iconoBorrar.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        borrarTrabajador = new JLabel(new ImageIcon(imagenRedimensionada1));
        borrarTrabajador.setBounds(700, 200, 100, 100);
        borrarTrabajador.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor al pasar el mouse
        borrarTrabajador.addMouseListener(new MouseAdapter() {         // Agregar un MouseListener para manejar clics
            @Override
            public void mouseClicked(MouseEvent e) {
                cerrarSesion();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                borrarTrabajador.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                borrarTrabajador.setOpaque(false);
            }
        });
        panel.add(borrarTrabajador);



        ImageIcon modificarBoton = new ImageIcon("C:\\xampp\\htdocs\\MP_12 Projecte_1\\Imagenes\\Cerrar_Sesion.png");
        Image imagenRedimensionada2 = modificarBoton.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        modificarTrabajador = new JLabel(new ImageIcon(imagenRedimensionada2));
        modificarTrabajador.setBounds(700, 50, 350, 100);
        modificarTrabajador.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor al pasar el mouse
        modificarTrabajador.addMouseListener(new MouseAdapter() {         // Agregar un MouseListener para manejar clics
            @Override
            public void mouseClicked(MouseEvent e) {
                cerrarSesion();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                modificarTrabajador.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                modificarTrabajador.setOpaque(false);
            }
        });
        panel.add(modificarTrabajador);
    }
    private void cerrarSesion() {
    // Aquí va el código para cerrar la sesión
    }
}