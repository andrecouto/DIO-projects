package com.dio.application;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextDouble();
		
		double soma = adicao(a, b);
		double subtracao = subtracao(a, b);
		double multi = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println();
		System.out.println("Soma: " + soma + 
				"\nSubtração: " + subtracao +
				"\nMultiplicação: " + multi + 
				"\nDivisão: " + divisao);
		
	}

	public static double adicao(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}
}
