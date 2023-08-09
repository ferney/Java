package org.example.B1.clase7;

public class Rectangulo extends Figura{
    double ladoA,ladoB;

    public Rectangulo() {
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }


    @Override
    double calcularAreaRectangulo(double ladoA, double ladoB) {
        return ladoA*ladoB;
    }

}
