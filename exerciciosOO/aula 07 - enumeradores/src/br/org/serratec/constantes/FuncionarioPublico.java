package br.org.serratec.constantes;

public class FuncionarioPublico {
	private String nome;
	private String cargo;
	private final int ANO_CONCURSO;

	public FuncionarioPublico(String nome, String cargo, int aNO_CONCURSO) {
		this.nome = nome;
		this.cargo = cargo;
		ANO_CONCURSO = aNO_CONCURSO;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public int getANO_CONCURSO() {
		return ANO_CONCURSO;
	}

	@Override
	public String toString() {
		return nome + " - " + cargo + " - " + ANO_CONCURSO;
	}

}
