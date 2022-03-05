package com.dio.arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] vetor = new int[20];
		
		for (int i = 0; i < vetor.length; i++) {
		
			vetor[i] = random.nextInt(100);
			System.out.println("Numero: " + vetor[i] + "\nSequência: " + (vetor[i] + 1) + "\n\n");
		
		}
	}

}
