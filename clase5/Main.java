package org.example.B1.clase5;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenu();
            if (opcion >= 1 && opcion <= 4) {
                realizarOperacion(opcion);
            } else if (opcion != 0) {
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elija una opción válida.");
            }
        } while (opcion != 0);
    }
    public static int mostrarMenu() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Calculadora Simple\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "0. Salir\n\n" +
                "Seleccione una opción:"));
        return input;
    }
    public static void realizarOperacion(int operacion) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        switch (operacion) {
            case 1 -> Suma(numero1, numero2);
            case 2 -> Resta(numero1, numero2);
            case 3 -> Multiplicacion(numero1, numero2);
            case 4 -> Divicion(numero1, numero2);
            case 0 -> Salir();
        }
       
    }

    private static void Suma(double numero1, double numero2) {
        JOptionPane.showMessageDialog(null, "Resultado: " + (numero1+numero2));
    }
    private static void Resta(double numero1, double numero2) {
        JOptionPane.showMessageDialog(null, "Resultado: " + (numero1-numero2));
    }
    private static void Multiplicacion(double numero1, double numero2) {
        JOptionPane.showMessageDialog(null, "Resultado: " + (numero1*numero2));
    }
    private static void Divicion(double numero1, double numero2) {
       JOptionPane.showMessageDialog(null, "Resultado: " + ((numero2 != 0)?""+(numero1 / numero2):"error, No se puede dividir por cero"));
    }
    private static void Salir() {
        JOptionPane.showMessageDialog(null, "Saliendo del programa.");
        System.exit(-1);
    }

}
//(numero2 != 0)?""+(numero1 / numero2):"error, No se puede dividir por cero";
