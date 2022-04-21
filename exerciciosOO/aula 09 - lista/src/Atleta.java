
public class Atleta {
	private String nomeAtleta;
	private int idade;
	private String posicao;
	private Time time;

	public Atleta(String nomeAtleta, int idade, String posicao) {
		this.nomeAtleta = nomeAtleta;
		this.idade = idade;
		this.posicao = posicao;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public int getIdade() {
		return idade;
	}

	public String getPosicao() {
		return posicao;
	}
	
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return nomeAtleta + " - " + idade + " - " + posicao;
	}
	
	

}
