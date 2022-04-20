package br.org.serratec.exceptions;

public class TesteEnsino {

	public static void main(String[] args) {
		Direito d1 = new Direito("Aluno 1", "UCP", 10, 5000);
		Fisioterapia f1 = new Fisioterapia("Aluno 2", "Estácio", 10);
		EnsinoMedio em1 = new EnsinoMedio("Aplicacao", "Coordenador 1", 500);
		TecnicoConcomitante tc1 = new TecnicoConcomitante("Senai", "Coordenador 2", "Tecnologia da informação");

	}

}
