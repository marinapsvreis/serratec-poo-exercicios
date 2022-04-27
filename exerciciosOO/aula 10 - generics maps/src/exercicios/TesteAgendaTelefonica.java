package exercicios;

import java.util.Map;

public class TesteAgendaTelefonica {

	public static void main(String[] args) {
		AgendaTelefonica at1 = new AgendaTelefonica();
		Contato c1 = new Contato("Marina", "+5524999407781");
		at1.incluir(c1);
		Contato c2 = new Contato("Nome 1", "+5524999407782");
		at1.incluir(c2);
		Contato c3 = new Contato("Nome 2", "+5524999407783");
		at1.incluir(c3);
		
		System.out.println(at1.tamanhoAgenda());
		
		for(Map.Entry<String, String> c : at1.getListaAgendaTelefonica().entrySet()) {
			System.out.println(c);
		}
		
		at1.remover(c3);
		
		System.out.println(at1.tamanhoAgenda());

	}

}
