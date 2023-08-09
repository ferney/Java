package org.example.B1.clase8;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            try {
                int opcion=Integer.parseInt(JOptionPane.showInputDialog(
                        "Menú:\n"
                        +"1. Realizar división\n"
                        +"2. Salir\n"
                        +"Seleccione una opción: "
                ));
               switch (opcion) {
                    case 1 -> realizarDivision();
                    case 2 -> continuar = false;
                    default -> mensaje("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                mensaje("Error: Ingrese un valor numérico.");
            }
        }
    }
    private static void realizarDivision() {
        try {
            double numerador =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numerador:"));
            double denominador = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el denominador:"));
           if(numerador==0 || denominador==0){
                mensaje("No se puede realizar la divición por que existe un 0");
            }else{
                double resultado = numerador / denominador;
                mensaje("El resultado de la división es: " + resultado);
            }
        } catch (ArithmeticException e) {
            mensaje("Error: División indeterminada.");
        } catch (NumberFormatException e) {
            mensaje("Error: Ingrese un valor numérico válido.");
        }catch (NullPointerException e) {
            mensaje("Error: Ingrese un valor numérico válido.");
        }
    }
    private static void mensaje(String x) {
        JOptionPane.showMessageDialog(null,x);
    }
}
