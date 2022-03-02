package com.dio;

import com.dio.model.Gato;

public class MeuPrimeiroPrograma {

	public static void main(String[] args) {
		/*
		int a = 2, b = 3;

		System.out.println("Hello World!!!" + (a+b));
		*/
		
		Gato gato = new Gato();
		Livro livro = new Livro(); 
		
		System.out.println(gato);
		System.out.println(livro); // printa o endereço de memoria -> faltou o toString
	}

}

class Livro {
	private String nome;
	private Integer numpag;
}