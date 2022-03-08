package com.dio.exceptions;

import javax.swing.*;

//fazer a divisão entre 2 numero inteiros.
public class UncheckedException {

	public static void main(String[] args) {
		boolean continueLooping = true;
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try{
				double resultado = dividir(Double.parseDouble(a),Double.parseDouble(b));
				System.out.println("Resultado: " + resultado);
				continueLooping = false;
			}catch (NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrada inválida, informe numero inteiro! " + e.getMessage());
			}catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Impossivel dividir numero por 0! " + e.getMessage());
			}finally {
				System.out.println("Chegou no finally....");
			}
		}while(continueLooping);
		
		
		System.out.println("continua aqui............");
	}
	
	public static double dividir(double a, double b) {
		return a / b;
	}

}
