/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana extends JFrame {
public MiVentana(){
    super("Estudiante");
    setSize(400,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    JLabel etiqueta = new JLabel("nombre: ");
    JTextField texto = new JTextField(10);
    cp.add(etiqueta);
    cp.add(texto);
    JLabel etiqueta2 = new JLabel("Apellido: ");
    JTextField texto2 = new JTextField(10);
    cp.add(etiqueta2);
    cp.add(texto2);
    JPanel panelFecha = new JPanel();
    
    
}
}


 
