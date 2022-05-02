package model;

public class Aluno {
	private Integer codigo;
	private String nome;
	private String email;
	private Integer idade;

	public Aluno(Integer codigo, String nome, String email, Integer idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return codigo + " - " + nome + " - " + email + " - " + idade;
	}
	
	

}
