package Main;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Judith Fernández Suárez");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Posicionamiento manual

        // Crear el botón
        JButton button = new JButton("Aceptar");
        button.setBounds(90, 80, 100, 30); // Posición y tamaño

        // Acción del botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hola, buenas");
            }
        });

        // Agregar el botón a la ventana
        frame.add(button);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
