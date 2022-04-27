package br.com.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploArquivos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o arquivo ou diretório: ");
		String path = sc.nextLine();
		File file = new File(path);

		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("O arquivo (%s) existe - e o tamanho %d bytes", file.getName(), file.length());
			} else {
				System.out.println("Conteúdo da pasta é:");
				for (String item : file.list()) {
					System.out.println(item);
				}

			}
		} else {
			System.out.println("Arquivo ou diretório não encontrado!");
		}
	}
}
