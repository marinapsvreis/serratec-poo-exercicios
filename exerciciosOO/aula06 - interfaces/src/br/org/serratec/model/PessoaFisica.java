package br.org.serratec.model;

public class PessoaFisica extends Pessoa implements Tributos {
	private String cpf;

	public PessoaFisica(String nome, String endereco, double rendimentos, String cpf) {
		super(nome, endereco, rendimentos);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calculaImpostoDeRenda() {
		return rendimentos * irendaPessoaFisica;
	}

	@Override
	public double calcularICMS() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString()
				+"CPF: " + cpf + "\n";
	}

	

}
