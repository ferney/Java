package org.example.B1.clase6;

import javax.swing.*;
import java.util.ArrayList;

public class Main extends Persona{


    public Main(String nombre, double nota1, double nota2, double nota3) {
        super(nombre, nota1, nota2, nota3);
    }

    public static void main(String[] args) {
        Persona arrayPersonas[]=new Persona[5];
        ArrayList<Persona> aprobadas = new ArrayList();
        ArrayList<Persona> desaprobadas = new ArrayList();

        for (int i = 0; i < arrayPersonas.length; i++) {
            double a=0,b=0,c=0,d=0;
            String nombre="";
            nombre=JOptionPane.showInputDialog("Ingrese el ombre del estudiante");
            a=Double.parseDouble(JOptionPane.showInputDialog("ingrese una nota"));
            b=Double.parseDouble(JOptionPane.showInputDialog("ingrese una nota"));
            c=Double.parseDouble(JOptionPane.showInputDialog("ingrese una nota"));
            arrayPersonas[i]= new Persona(nombre,a,b,c);
            d=(a+b+c/3);
            if(d >= 3.0) {
                aprobadas.add(new Persona(nombre, a, b, c));
            }else{
                desaprobadas.add(new Persona(nombre,a,b,c));
            }
        }
//total de estudiantes
        System.out.println("todos los estudiantes");
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println(arrayPersonas[i].toString());
        }
//total de estudiantes aprobados
        System.out.println("\n\ntodos los estudiantes aprobados");
        for (int i = 0; i < aprobadas.size(); i++) {
            System.out.println(aprobadas.get(i).toString());
        }
//total de estudiantes desaprobados
        System.out.println("\n\ntodos los estudiantes desaprobados");
        for (int i = 0; i < desaprobadas.size(); i++) {
            System.out.println(desaprobadas.get(i).toString());
        }

    }
}
