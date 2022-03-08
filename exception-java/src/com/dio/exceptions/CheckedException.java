package com.dio.exceptions;

import java.io.*;
import javax.swing.*;

public class CheckedException {

	public static void main(String[] args) {
		String nomeArquivo = "romances-blacke-crouch.txt";
		try {
			imprimirArquivoNoConsole(nomeArquivo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir. " + e.getClass());
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte. " + e.fillInStackTrace());
			e.printStackTrace();
		} finally {
			System.out.println("Chegou ao finally!");
		}
		
		System.out.println("Apesar da exception, programa continua...");
	}
	
	public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
		File file = new File(nomeArquivo);
		
		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}while(line != null);
	
		bw.flush();
		br.close();
	}
}
