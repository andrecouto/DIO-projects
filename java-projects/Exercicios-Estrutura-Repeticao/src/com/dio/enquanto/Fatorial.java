package com.dio.enquanto;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// System.out.println(funcFatorial(5)); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga o numero: ");
		int numero = sc.nextInt();
		int fatorial = 1;
		
		for(int i = 0; i < (numero-1); i++) {
			fatorial *= numero - i; 
		}
		System.out.println("Fatorial de " + numero + " : " + fatorial);
		
		sc.close();
		
	}
	/*
	public static int funcFatorial(int numero) {
		int total = 1;
		total *= numero;
		if(numero > 1) {
			total *= funcFatorial(numero -1);
		}
		return total;
	}
	*/
}
