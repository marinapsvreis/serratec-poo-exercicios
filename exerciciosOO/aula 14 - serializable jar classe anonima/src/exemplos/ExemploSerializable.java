package exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {
		  Fornecedor f1 = new Fornecedor("32145698712", "Empresa XPTO", "xpto@gmail.com");
		  Fornecedor f2 = new Fornecedor("32145698711", "Empresa XPTY", "xpty@gmail.com");
		  Fornecedor f3 = new Fornecedor("32145698712", "Empresa XPTY", "xpty@gmail.com");
		  
		  if(f1.equals(f3)) {
			  System.out.println("Mesmo cnpj");
		  }else {
			  System.out.println("Diferentes");
		  }
		  
		  List<Fornecedor> fornecedores = new ArrayList<>();
		  fornecedores.add(f1);
		  fornecedores.add(f2);
		  
	        try {
	            FileOutputStream arquivoGravar = new FileOutputStream("/exemplos/fornecedor.dat");
	            ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
	            gravarObjeto.writeObject(fornecedores);
	            gravarObjeto.flush();
	            gravarObjeto.close();
	            arquivoGravar.close();
	            
	            System.out.println("Objeto gravado!");

	        } catch (Exception e) {
	            System.out.println("Não foi possivel gravar o objeto!");
	            e.printStackTrace();
	        }
	        
	        System.out.println("Leitura do objeto criado");
	        
	        try {
				FileInputStream caminhoArquivo = new FileInputStream("/exemplos/fornecedor.dat");
				ObjectInputStream lerObjeto = new ObjectInputStream(caminhoArquivo);
				System.out.println(lerObjeto.readObject());
				lerObjeto.close();
				caminhoArquivo.close();				
			} catch (Exception e) {
				System.out.println("Erro ao ler arquivo!");
			}
	    }
}
