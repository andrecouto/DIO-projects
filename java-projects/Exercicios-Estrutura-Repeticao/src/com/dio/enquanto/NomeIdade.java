package com.dio.enquanto;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = "";
		int idade;
		
		/*
		System.out.println("Diga o nome do aluno. Caso queira sair do programa, digite 0. ");
		nome = sc.next();
		System.out.println("Diga a idade do aluno");
		idade = sc.nextInt();
		System.out.println();*/
		
		
		do {
			System.out.println("Diga o nome do aluno. Caso queira sair do programa, digite 0. ");
			nome = sc.next();
			if(nome.equals("0")) break;
			System.out.println("Diga a idade do aluno");
			idade = sc.nextInt();
			/*
			System.out.println();
			
			System.out.println("\n\nAluno "+ (++contador) + ":\n");
			System.out.println("NOme:" + nome + "\nIdade: " + idade + "\n\n\n");
			*/
	
		} while(true); 
		
		sc.close();
	}

}
