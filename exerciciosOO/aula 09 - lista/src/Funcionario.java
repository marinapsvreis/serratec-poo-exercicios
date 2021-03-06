
public class Funcionario {
	private String nome;
	private String cargo;
	private Double salario;

	public Funcionario(String nome, String cargo, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void abonoSalario(Double abono) {
		salario += abono;
	}

	@Override
	public String toString() {
		return nome + " - " + cargo + " - " + String.format("R$ %.2f", salario) ;
	}
	
	

}
