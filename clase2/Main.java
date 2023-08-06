package org.example.B1.clase2;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String pares="",impares="";
        int a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número menor a 100"));
        if(a>=1) {
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    if(i==a) {pares += i;}
                    else     {pares += i + ", ";}
                } else {
                    if(i==(a-1)) {impares += i;}
                    else         {impares += i + ", ";}
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Este no es nu numero positivo");
        }
        JOptionPane.showMessageDialog(null,"Numeros pares:\n"+pares+"\nNumeros impares:\n"+impares);

    }
}
