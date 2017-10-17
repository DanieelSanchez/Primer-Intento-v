package Ejercicio2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnTraspas1.addActionListener(this);
        v.bntTraspasa2.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
       
         if (e.getSource() == v.btnTraspas1) {

           v.etiTexto1.setText(v.txtTexto.getText());
        }
        if (e.getSource() == v.bntTraspasa2) {

           v.etiTexto2.setText(v.txtTexto.getText());
           
        }
    }

    public static void main(String[] args) {
       Controlador c = new Controlador();
    }
}
