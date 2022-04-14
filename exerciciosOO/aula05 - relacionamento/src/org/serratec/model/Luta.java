package org.serratec.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private int status;

	public Luta(Lutador desafiante, Lutador desafiado, int rounds) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		this.status = confirmarLuta(desafiante, desafiado);
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public int isConfirmado() {
		return status;
	}

	public int confirmarLuta(Lutador desafiante, Lutador desafiado) {
		if (desafiante == desafiado) {
			return 1;
		} else if (desafiante.getCategoriaLuta() != desafiado.getCategoriaLuta()) {
			return 2;
		} else {
			return 3;
		}
	}
	
	@Override
	public String toString() {
		String resultadoComparacao = new String("");
		if(status == 3) {
			resultadoComparacao = "Luta confirmada!";
		}else if(status == 1) {
			resultadoComparacao = "Luta não irá acontecer, porque desafiante e desafiado são a mesma pessoa!";
		}else {
			resultadoComparacao = "Luta não irá acontecer, os lutares são de categorias diferentes!";
		}
		
		
		return desafiante + " X " + desafiado + "\n"
				+ "Rounds: " + rounds + "\n"
				+ "Status: " + resultadoComparacao;
	}

}
