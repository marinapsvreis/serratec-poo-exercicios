package br.serratec.model.compare;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private int idade;

	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return nome + " - " + cpf + " - " + idade;
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		//return nome.compareTo(outraPessoa.getNome());
//		if(idade > outraPessoa.getIdade()) {
//			return 1;
//		}else if (idade < outraPessoa.getIdade()){
//			return -1;
//		}else {
//			return 0;
//		}
		//return -(idade - outraPessoa.getIdade());
		return idade - outraPessoa.getIdade();
	}

}
