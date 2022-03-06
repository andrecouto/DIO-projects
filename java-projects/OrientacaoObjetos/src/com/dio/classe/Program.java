package com.dio.classe;

public class Program {

	public static void main(String[] args) {
		/*Carro carro = new Carro("azul","BMW",59);
		
		System.out.println(carro.getCor());
		System.out.println(carro.getModelo());
		System.out.println(carro.getCapacidadeTanque());
		System.out.println(carro.valorEncherTanque(5.20));*/
		
		Funcionario gerente = new Gerente(); // upcast
		Gerente func = (Gerente) new Funcionario(); // downcast -> ERRO
	}

}
