package Interfaz;

import Gestores.GestorAdministracionProductos;
import Producto.Producto;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class InterfazGrafica extends JFrame {
    private GestorAdministracionProductos gestorProductos;

    public InterfazGrafica() {
        super("Interfaz Gráfica para Gestor de Productos");

        gestorProductos = new GestorAdministracionProductos();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JButton btnRegistrarProducto = new JButton("Registrar Producto");
        btnRegistrarProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarProducto();
            }
        });

        JButton btnListarProductos = new JButton("Listar Productos");
        btnListarProductos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarProductos();
            }
        });

        panel.add(btnRegistrarProducto);
        panel.add(btnListarProductos);

        add(panel);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void registrarProducto() {
        int codigoProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de producto:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        int cantidadStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad en stock del producto:"));

        Producto nuevoProducto = new Producto(codigoProducto, nombre, descripcion, precio, cantidadStock);
        gestorProductos.ingresarProducto(nuevoProducto);
        JOptionPane.showMessageDialog(this, "Producto registrado correctamente.");
    }

    private void listarProductos() {
        gestorProductos.listarProductos();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica();
            }
        });
    }
}
