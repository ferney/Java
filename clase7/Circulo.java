package org.example.B1.clase7;

public class Circulo extends Figura{

double radio;

    public Circulo() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularAreaCirculo(double radio) {
        return Math.PI*radio*radio;
    }
}
