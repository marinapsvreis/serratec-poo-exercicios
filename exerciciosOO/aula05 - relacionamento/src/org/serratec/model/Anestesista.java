package org.serratec.model;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String nomePlano, String crm, String nomeMedico, String tipoAnestesia) {
		super(nomePlano, crm, nomeMedico);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}
	
	public String toString() {
		return super.toString()
				+ "Tipo Anestesia: "
				+ tipoAnestesia + "\n";
	}
	
	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() + 1000;
		return valorPago;
	}

}
