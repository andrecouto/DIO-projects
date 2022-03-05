package com.dio.arrays;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga a palavra(6 letras): ");
		String palavra = sc.next().toLowerCase();
		int consoantes = contaConsoante(palavra);

		System.out.println("Número de consoantes: " + consoantes);
		sc.close();
	}

	public static Integer contaConsoante(String palavra) {
		int count = 0;
		for (int i = 0; i < 6; i++) {
			char letra = palavra.charAt(i);

			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				continue;
			}else {
				count++;
			}
		}
		return count;

	}

}
