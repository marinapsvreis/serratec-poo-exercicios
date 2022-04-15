package br.org.serratec.model;

public class PessoaJuridica extends Pessoa implements Tributos {
	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica(String nome, String endereco, double rendimentos, String cnpj, String razaoSocial) {
		super(nome, endereco, rendimentos);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	@Override
	public double calculaImpostoDeRenda() {
		return rendimentos * irendaPessoaJuridica;
	}

	@Override
	public double calcularICMS() {
		return rendimentos * icms;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "CNPJ: " + cnpj + "\n"
				+ "Razao Social: " + razaoSocial + "\n";
	}
	
	

}
