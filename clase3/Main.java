package org.example.B1.clase3;
public class Main {
    public static void main(String[] args) {
        int day=3;
        String[] Day={"lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo"};
        switch (day) {
            case 1-> DarDia("hoy es "+Day[0]);
            case 2-> DarDia("hoy es "+Day[1]);
            case 3-> DarDia("hoy es "+Day[2]);
            case 4-> DarDia("hoy es "+Day[3]);
            case 5-> DarDia("hoy es "+Day[4]);
            case 7-> DarDia("hoy es "+Day[5]);
            case 8-> DarDia("hoy es "+Day[6]);
            default -> DarDia("error");
        }
    }
    private static void DarDia(String s) { System.out.println(s); }
}
