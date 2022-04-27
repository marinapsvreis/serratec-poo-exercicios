package exercicios;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
	private Map<String, String> listaAgendaTelefonica = new HashMap<>();

	public void incluir(Contato contato) {
		listaAgendaTelefonica.put(contato.getNome(), contato.getTelefone());
	}

	public void remover(Contato contato) {
		listaAgendaTelefonica.remove(contato.getNome());
	}

	public Integer tamanhoAgenda() {
		return listaAgendaTelefonica.size();
	}

	public Map<String, String> getListaAgendaTelefonica() {
		return listaAgendaTelefonica;
	}

}
