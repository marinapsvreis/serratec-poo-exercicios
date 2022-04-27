package br.com.senai.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemplosLeitura {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new FileReader("exemplofolder/teste3.txt"));
            while (br.ready()) { 
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
            
        }

	}

}
