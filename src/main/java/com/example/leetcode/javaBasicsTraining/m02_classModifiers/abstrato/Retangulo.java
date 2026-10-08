package com.example.leetcode.javaBasicsTraining.m02_classModifiers.abstrato;

public class Retangulo extends Forma {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}
