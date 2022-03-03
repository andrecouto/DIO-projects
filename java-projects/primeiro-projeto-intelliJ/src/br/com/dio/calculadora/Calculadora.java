package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Diga o primeiro numero: ");
        a = sc.nextDouble();
        System.out.println("Diga o segundo numero: ");
        b = sc.nextDouble();

        double soma = soma(a, b);
        double subtracao = subtracao(a, b);
        double multi = multiplicacao(a, b);
        double divisao = divisao(a, b);

        System.out.println("Soma: " + soma +
                "\nSubtração: " + subtracao +
                "\nMultiplicação: " + multi +
                "\nDivisão: " + divisao);
    }

    public static double soma(double a, double b){
        return a + b;
    }
    public static double subtracao(double a, double b){
        return a - b;
    }
    public static double multiplicacao(double a, double b){
        return a * b;
    }
    public static double divisao(double a, double b){
        return a / b;
    }
}
