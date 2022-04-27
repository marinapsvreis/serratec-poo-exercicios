package br.com.senai.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscrita1 {

	public static void main(String[] args) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("/exemplos/exercicios3.txt"));
			bw.append("Serratec-Java");
			bw.append("Olá mundo");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
