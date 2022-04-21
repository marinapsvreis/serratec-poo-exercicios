import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nomeTime;
	private String tecnico;
	private String diretor;
	private List<Atleta> listaAtletas = new ArrayList<>();

	public Time(String nomeTime, String tecnico, String diretor) {
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public String getDiretor() {
		return diretor;
	}
	
	public void addAtleta(Atleta atleta) {
		listaAtletas.add(atleta);
		atleta.setTime(this);
	}
	
	public void removeAtleta(Atleta atleta) {
		listaAtletas.remove(atleta);
		atleta.setTime(null);
	}
	
	public void mostrarAtletas() {
		for(Atleta a : listaAtletas) {
			System.out.println(a);
		}
	}

	@Override
	public String toString() {
		return nomeTime;
	}
	
	

}
