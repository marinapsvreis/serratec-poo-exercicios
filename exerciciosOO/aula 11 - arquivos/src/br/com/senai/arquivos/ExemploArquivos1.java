package br.com.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploArquivos1 {

	public static void main(String[] args) {
		File arquivo = new File("./arquivos/exercicio.txt");
		// File arquivo = new File("c:\\exemplos\\exercicio1.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}

	}

}
