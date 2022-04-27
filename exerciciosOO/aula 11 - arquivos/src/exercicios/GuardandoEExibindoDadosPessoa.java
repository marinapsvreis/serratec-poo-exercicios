package exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import br.com.senai.model.Empregado;

public class GuardandoEExibindoDadosPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite a idade dessa pessoa: ");
		Integer idade = sc.nextInt();
		System.out.println("Digite a altura dessa pessoa: ");
		Double altura = sc.nextDouble();
		
		String linha = nome + ";" + idade + ";" + altura;
		
		try {		
			
			//gravando no arquivo
			FileWriter caminho = new FileWriter("/exemplos/exercicioPessoa.txt");
			PrintWriter gravar = new PrintWriter(caminho);
			
			gravar.printf(linha);
			gravar.close();
			
			//lendo o arquivo
			File arquivo = new File("/exemplos/exercicioPessoa.txt");
			Scanner sc1 = new Scanner(arquivo);
			
			while (sc1.hasNextLine()) {
				linha = sc1.nextLine();
				if (!linha.isEmpty()) {
					String[] fields = linha.split(";");
					nome = fields[0];
					idade = Integer.parseInt(fields[1]);
					altura = Double.parseDouble(fields[2]);
					System.out.println(nome + " - " + idade + " - " + String.format("%.2f", altura));
				}
			}
			sc1.close();
			
			
		} catch (Exception e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}		
		
		sc.close();

	}

}
