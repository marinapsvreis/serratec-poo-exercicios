package br.com.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploArquivos3 {

	public static void main(String[] args) {
	
		try {
			Scanner sc = new Scanner(new File("c:\\exemplos\\exercicio.txt"));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				
				System.out.println(sc.next());
				//System.out.println(sc.nextLine());
				
				//String[] fields = sc.nextLine().split(";");
				//for(String f : fields) {
				//	System.out.println(f);
				//}
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}

	}

}
