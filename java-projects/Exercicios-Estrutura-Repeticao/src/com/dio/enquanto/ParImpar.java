package com.dio.enquanto;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga quantos numeros irá digitar: ");
		int count = sc.nextInt(), i =0, pares = 0, impares = 0, numero;
		
		do {
			System.out.println("Numero: ");
			numero = sc.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			i++;
		}while(i < count);
		System.out.println("\n\nPares: " + pares +
				"\nImpares: " + impares);
		sc.close();
	}

}
