package com.dio.enquanto;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Diga a nota entre 0 e 10: ");
		nota = sc.nextInt();
		
		while(nota < 0 || nota > 10){
			System.out.println("Erro.Diga uma nota entre 0 e 10: ");
			nota = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("FIM DO PROGRAMA!!!");
	}

}
