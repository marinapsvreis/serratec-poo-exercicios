package org.serratec.model;

public class Medico extends Plano {
		protected String crm;
		protected String nomeMedico;
		
		public Medico(String nomePlano, String crm, String nomeMedico) {
			super(nomePlano);
			this.crm = crm;
			this.nomeMedico = nomeMedico;
		}
		
		public String getCrm() {
			return crm;
		}
		public void setCrm(String crm) {
			this.crm = crm;
		}
		public String getNomeMedico() {
			return nomeMedico;
		}
		public void setNomeMedico(String nomeMedico) {
			this.nomeMedico = nomeMedico;
		}
		
		@Override
		public String toString() {
			return super.toString() + "Médico: " 
									+ nomeMedico + "\n"
									+ "CRM: " 
									+ crm + "\n";
		}
		
		@Override
		public double calcularPagamento() {
			valorPago = super.calcularPagamento() * 1.1;
			return valorPago;
		}
		
		
}
