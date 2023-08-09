package org.example.B1.clase7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Circulo c= new Circulo();
        double x=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio d el circulo"));
        JOptionPane.showMessageDialog(null,"el curculo tiene de área "+ c.calcularAreaCirculo(x));

        Rectangulo r= new Rectangulo();
        double y=Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer lado del rectangulo"));
        double z=Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo lado del rectangulo"));
        JOptionPane.showMessageDialog(null,"el rectangulo tiene de área "+ r.calcularAreaRectangulo(y,z));

    }
}
