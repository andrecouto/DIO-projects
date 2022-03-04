package com.dio.operacoes;

public class OperacoesSaudacaoEmprestimo {

	public static void main(String[] args) {
		saudacao(10);
		valorFinalEmprestimo(1000, 10);
		saudacao(15);
		saudacao(22);
	}

	public static double soma(double a, double b) {
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

	public static void saudacao(int hora) {
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
	}

	public static void valorFinalEmprestimo(double valorInicial, int meses) {
		double valorFinal = 0;
		double valorRestante = valorInicial;
		double parcela;
		for (int i = 0; i < meses; i++) {

			parcela = divisao(multiplicacao(valorRestante, 1.05), subtracao(meses,i)); // taxa de 5% ao mês
			valorFinal = soma(valorFinal, parcela); //
			valorRestante = subtracao(multiplicacao(valorRestante, 1.05), parcela); // subtrai o valor da parcela do
																					// valor total com a taxa

			System.out.println("\nParcela " + (i + 1) + ": " + parcela + "\n");

		}
		System.out.println("Valor inicial: R$" + valorInicial +
				"\nMeses: " + meses +
				"\n\nValor total a ser pago: R$" + valorFinal);
	}

}
