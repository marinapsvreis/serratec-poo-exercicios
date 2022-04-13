package br.org.serratec.model;

public class Funcionario2 {
	protected String nome;
	protected Double salario;
	protected String turno;

	public Funcionario2(String nome, Double salario, String turno) {
		this.nome = nome;
		this.salario = salario;
		this.turno = turno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String toString() {
		return "Nome: "
				+ nome + "\n"
				+ "Salario: "
				+ String.format("R$ %.2f", salario) + "\n"
				+ "Turno: "
				+ turno + "\n";
	}
	
	public void aumentarSalario() {
		salario *= 1.02;
	}

}
