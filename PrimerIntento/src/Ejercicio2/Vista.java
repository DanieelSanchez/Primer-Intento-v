package Ejercicio2;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JButton btnTraspas1,  bntTraspasa2;
    JLabel  etiTexto1,  etiTexto2;
    JTextField txtTexto;
    
    

    public Vista() {
        this.setTitle("");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout()); 
        
        
        
    btnTraspas1 = new JButton("Traspasa 1");
        this.getContentPane().add( btnTraspas1, new AbsoluteConstraints(260, 300, 200, 20));
        
           bntTraspasa2 = new JButton("Traspasa 2");
        this.getContentPane().add(   bntTraspasa2, new AbsoluteConstraints (260, 250, 200, 20));
        
         txtTexto = new  JTextField();
        this.getContentPane().add( txtTexto, new AbsoluteConstraints(10, 250, 200, 50));
        
    
        etiTexto1 = new  JLabel ();
        this.getContentPane().add( etiTexto1, new AbsoluteConstraints(100, 20, 300, 40));
        
         etiTexto1.setBackground(Color.red);
         etiTexto1.setOpaque(true);


         etiTexto2 = new JLabel();
        this.getContentPane().add( etiTexto2, new AbsoluteConstraints(100, 90, 300, 40));
        
        
         etiTexto2.setBackground(Color.red);
         etiTexto2.setOpaque(true);

    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);

    }
}
