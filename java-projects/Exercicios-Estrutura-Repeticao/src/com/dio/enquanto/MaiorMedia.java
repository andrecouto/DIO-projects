package com.dio.enquanto;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double media = 0;
		int numero;
		int contador = 0;
		int maior = 0;

		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
			++contador;
			media += numero;
			if (numero > maior) {
				maior = numero;
			}
		} while (contador < 5);
		media /= 5;
		System.out.println(media + "  \n" + maior);
		sc.close();
	}

}
