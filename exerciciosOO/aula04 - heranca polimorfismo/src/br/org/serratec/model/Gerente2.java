package br.org.serratec.model;

public class Gerente2 extends Funcionario2 {
	private String setor;

	public Gerente2(String nome, Double salario, String turno, String setor) {
		super(nome, salario, turno);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String toString() {
		return super.toString()
				+ "Setor: "
				+ setor + "\n";
	}
	
	@Override
	public void aumentarSalario() {
		salario = salario*1.02 + 200.00;
	}


}
