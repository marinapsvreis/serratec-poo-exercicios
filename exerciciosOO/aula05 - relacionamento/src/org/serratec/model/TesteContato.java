package org.serratec.model;

public class TesteContato {

	public static void main(String[] args) {
		Estado e1 = new Estado("Rio de Janeiro", "RJ");
		Cidade c1 = new Cidade("Petrópolis", e1);
		Endereco end1 = new Endereco("Rua Fonseca Ramos 181", "Centro", "25660-000", c1);
		Telefone t1 = new Telefone("+55 24 2234-1250");
		Telefone t2 = new Telefone("+55 24 2237-1350");
		Contato contato1 = new Contato("Roberta", new Telefone[2], end1);
		
		contato1.inserirTelefones(t1);
		contato1.inserirTelefones(t2);
		
		System.out.println("Nome: " + contato1.getNome() + "\n"
							+ "Endereço: " + contato1.getEndereco() + " "
							+ contato1.getEndereco().getCidade().getEstado());
		contato1.mostrarTelefones();
	}

}
