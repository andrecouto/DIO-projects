package com.dio.sobrecarga;

public class Sobrecarga {

	public static void main(String[] args) {
		System.out.println(area(5));
		System.out.println(area(5,10));
		System.out.println(area(5,10,3));
	}

	public static double area(double lado) {
		return lado * lado;
	}

	public static double area(double comprimento, double largura) {
		return comprimento * largura;
	}

	public static double area(double base, double topo, double altura) {
		return (base + topo) * altura / 2;
	}

}
