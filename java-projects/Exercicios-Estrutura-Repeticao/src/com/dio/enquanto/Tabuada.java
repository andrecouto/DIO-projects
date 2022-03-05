package com.dio.enquanto;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual numero deseja ver a tabuada, de 1 a 10: ");
		int numero = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(numero + " * " + (i + 1) + " = " + (numero * (i + 1)));
		}
		sc.close();
	}

}
