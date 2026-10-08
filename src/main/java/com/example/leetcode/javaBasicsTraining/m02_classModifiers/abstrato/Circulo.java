package com.example.leetcode.javaBasicsTraining.m02_classModifiers.abstrato;

public class Circulo extends Forma {

    private final double raio;

    public Circulo(double raio) {
        super("Círculo"); // chama o construtor da Forma
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
