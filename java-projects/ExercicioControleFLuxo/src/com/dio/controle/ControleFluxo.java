package com.dio.controle;

import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga um numero de 1 a 12: ");
		int mes = sc.nextInt();
		
		int resultado = exibeMes(mes);
		while(resultado == -1) {
			System.out.println("Diga um numero de 1 a 12.");
			resultado = exibeMes(sc.nextInt());
		}
		
		System.out.println("Dia um numero de 1 a 7: ");
		int dia = sc.nextInt();
		
		resultado = exibeNumeroSemana(dia);
		while(resultado == -1) {
			System.out.println("Diga um numero de 1 a 7.");
			resultado = exibeNumeroSemana(sc.nextInt());
		}
		sc.close();
		
	}

	public static int exibeMes(int numero) {
		
		if(numero <= 0 || numero > 12) {
			return -1;
		}
		
		if (numero <= 6) {
			if (numero <= 3) {
				if (numero < 2 ) {
					System.out.println("Mês: Janeiro");
					return 0;
				} else if (numero == 2) {
					System.out.println("Mês: Fevereiro");
					return 0;
				} else {
					System.out.println("Mês: Março");
					return 0;
				}
			} else if (numero < 5) {
				System.out.println("Mẽs: Abril");
				return 0;
			} else if (numero == 5) {
				System.out.println("Mẽs: Maio");
				return 0;
			} else {
				System.out.println("Mês: Junho");
				return 0;
			}
		} else if (numero <= 10) {
			if (numero < 8) {
				System.out.println("Mẽs: Julho");
				return 0;
			} else if (numero == 8) {
				System.out.println("Mês: Agosto");
				return 0;
			} else if (numero == 9) {
				System.out.println("Mẽs: Setembro");
				return 0;
			} else {
				System.out.println("Mẽs: Outubro");
				return 0;			
			}
		} else if (numero == 11) {
			System.out.println("Mẽs: Novembro");
			return 0;
		} else {
			System.out.println("Mẽs: Dezembro");
			return 0;
		}
		
	}

	public static int exibeNumeroSemana(int dia) {
		
		switch (dia) {

		case 1:
			System.out.println("Segunda");
			break;

		case 2:
			System.out.println("Terça");
			break;

		case 3:
			System.out.println("Quarta");
			break;

		case 4:
			System.out.println("Quinta");
			break;
			
		case 5:
			System.out.println("Sexta");
			break;
			
		case 6:
			System.out.println("Sábado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
			
		default:
			return -1;
				
		}
		return 0;
	}

}
