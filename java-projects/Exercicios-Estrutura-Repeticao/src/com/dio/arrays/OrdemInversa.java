package com.dio.arrays;

public class OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = { -5, -6, 15, 30, 2, 7 };
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[vetor.length - (i + 1)] + " ");
		}

	}

}
