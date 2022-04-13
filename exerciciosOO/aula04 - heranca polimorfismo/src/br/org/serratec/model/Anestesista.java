package br.org.serratec.model;

public class Anestesista extends Medico {
	private double valorAnestesia;

	public Anestesista(String crm, String nome, double valorConsulta, double valorAnestesia) {
		super(crm, nome, valorConsulta);
		this.valorAnestesia = valorAnestesia;
	}

	public double getValorAnestesia() {
		return valorAnestesia;
	}
	
	@Override
	public String toString() {
		return String.format("%sValor Anestesia: %.2f%n", super.toString(), valorAnestesia);
	}

}
