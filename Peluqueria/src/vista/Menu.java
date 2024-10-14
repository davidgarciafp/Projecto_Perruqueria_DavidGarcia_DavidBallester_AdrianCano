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

public class Menu extends JFrame {
    private JLabel cerrarSesionLabel;
    private JButton gestionTrabajadoresButton;
    private JButton serviciosButton;
    private JButton productosButton;
    private JButton clientesButton;

    public Menu(Object trabajador) {
         // Inicializar el controlador.
        setTitle("Peluqueria"); // Pon un titulo a la pagina.
        setSize(1000, 900); // Configuracion del tamaño de la pantalla.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Indica que la aplicación se cerrará completamente.
        setLocationRelativeTo(null); // Centra la ventana en la pantalla.

        // Creamos un panel para agregar los componetes que quieras.
        JPanel panel = new JPanel();
        add(panel);
        posicioBotons(panel, trabajador);


        setVisible(true); 
    }

    private void posicioBotons(JPanel panel, Object trabajador) {
        panel.setBackground(new Color(220, 207, 201)); // Canviar de color.
        panel.setLayout(null);

        // Fuentes
        Font nFont16 = new Font(null, Font.PLAIN, 16);
        //Font nFont20 = new Font(null, Font.PLAIN, 20);


        // Cerrar Sesion
        ImageIcon originalIcon = new ImageIcon("C:\\xampp\\htdocs\\MP_12 Projecte_1\\Imagenes\\Cerrar_Sesion.png");
        Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        cerrarSesionLabel = new JLabel(new ImageIcon(imagenRedimensionada));
        cerrarSesionLabel.setBounds(700, 50, 100, 100);
        cerrarSesionLabel.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR)); // Cambia el cursor al pasar el mouse
        cerrarSesionLabel.addMouseListener(new MouseAdapter() {         // Agregar un MouseListener para manejar clics
            @Override
            public void mouseClicked(MouseEvent e) {
                cerrarSesion();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                cerrarSesionLabel.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                cerrarSesionLabel.setOpaque(false);
            }
        });
        panel.add(cerrarSesionLabel);


        serviciosButton = new JButton("Servicios");
        serviciosButton.setBounds(500, 200, 200, 40);
        serviciosButton.setFont(nFont16);
        serviciosButton.setHorizontalAlignment(SwingConstants.CENTER);
        serviciosButton.setBackground(new Color(139, 137, 137)); 
        serviciosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion();
            }
        });
        panel.add(serviciosButton);


        productosButton = new JButton("Productos");
        productosButton.setBounds(500, 250, 200, 40);
        productosButton.setFont(nFont16);
        productosButton.setHorizontalAlignment(SwingConstants.CENTER);
        productosButton.setBackground(new Color(139, 137, 137)); 
        productosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion();
            }
        });
        panel.add(productosButton);


        clientesButton = new JButton("Clientes");
        clientesButton.setBounds(500, 300, 200, 40);
        clientesButton.setFont(nFont16);
        clientesButton.setHorizontalAlignment(SwingConstants.CENTER);
        clientesButton.setBackground(new Color(139, 137, 137)); 
        clientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion();
            }
        });
        panel.add(clientesButton);


        gestionTrabajadoresButton = new JButton("Gestión de trabajadores");
        gestionTrabajadoresButton.setBounds(500, 350, 200, 40);
        gestionTrabajadoresButton.setFont(nFont16);
        gestionTrabajadoresButton.setHorizontalAlignment(SwingConstants.CENTER);
        gestionTrabajadoresButton.setBackground(new Color(139, 137, 137)); 
        gestionTrabajadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion();
            }
        });
        panel.add(gestionTrabajadoresButton);
    }
    
    // Metodos
    private void cerrarSesion() {
        new IniciarSesion().setVisible(true);
        dispose();
    }
}
