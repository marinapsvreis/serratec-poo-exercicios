package br.org.serratec.model;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;

	public Maratona(String nome, String sexo, int idade, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Nome: "
				+ nome + "\n"
				+"Sexo: "
				+ sexo + "\n"
				+"Idade: "
				+ idade + "\n"
				+"Altura: "
				+ String.format("%.2f", altura) + "\n";
	}
	
	public void verificaSituacao() {
		if(idade >= 18 || altura >= 1.80) {
			System.out.println("Participará da competição");
		}else {
			System.out.println("Não participará da competição");
		}
	}

}
