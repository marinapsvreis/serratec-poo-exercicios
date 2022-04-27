package br.com.senai.model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteEmpregado2 {

	public static void main(String[] args) {

		Set<Empregado> empregados = new HashSet<>();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = sc.next();
			File arquivo = new File(nomeArquivo);
			Scanner sc1 = new Scanner(arquivo);
			
			while (sc1.hasNextLine()) {
				String linha = sc1.nextLine();
				if (!linha.isEmpty()) {
					String[] fields = linha.split(";");
					String nome = fields[0];
					String profissao = fields[1];
					empregados.add(new Empregado(nome, profissao));
				}
			}
			sc.close();
			
			FileWriter caminho = new FileWriter("/exemplos/exercicioResultadoEmpregado.txt");
			PrintWriter gravar = new PrintWriter(caminho);
			
			for (Empregado empregado : empregados) {
				String linhaArquivo = empregado.getNome() + ";" + empregado.getProfissao() + "\n";
				gravar.printf(linhaArquivo);
			}
			gravar.close();
			
		} catch (Exception e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}		

	}

}
