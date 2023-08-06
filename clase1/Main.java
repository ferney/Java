package org.example.B1.clase1;
import java.util.Calendar;

//1)Deben desarrolla un software que calcule el menor de 2 numero declarados anteriormente.
//2)Deben desarrolla un software que calcule su edad a partir del anio de nacimiento
public class Main {
    public static void main(String[] args) {
      int a=5,b=7,anio=1987,anio2=2023;
      if(a<b){
          System.out.println(a);
      }else{
          System.out.println(b);
      }
        //Calendar cal= Calendar.getInstance();
        //int year= cal.get(Calendar.YEAR);

        //System.out.println("Usted tiene "+ (year-anio));
        System.out.println("Usted tiene "+ (anio2-anio));
    }
}
