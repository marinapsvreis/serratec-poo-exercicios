package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercicioQtdCaracteres {

	public static void main(String[] args) {
		String totalCaracteres = "";
		try {
            BufferedReader br = new BufferedReader(new FileReader("/exemplos/exercicioContarCaracteres.txt"));
            while (br.ready()) { 
                String[] caracteres = br.readLine().split(" ");
                for(String caracter : caracteres) {
                	totalCaracteres += caracter;
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
            
        }
		
		System.out.println("O arquivo possui " + totalCaracteres.length() + " caracteres!");

	}

}
