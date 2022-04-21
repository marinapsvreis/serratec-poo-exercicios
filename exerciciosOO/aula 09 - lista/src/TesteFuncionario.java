
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[2];
		funcionarios[0] = new Funcionario("Marina", "Gerente", 10000.00);
		funcionarios[1] = new Funcionario("João", "Desenvolvedor Junior", 3000.00);

		// Funcionario[] funcionarios = {new Funcionario("Marina", "Gerente",
		// 10000.00),
		// new Funcionario ("João", "Desenvolvedor Junior", 3000.00)};

		funcionarios[0].abonoSalario(1000.00);
		funcionarios[1].abonoSalario(300.00);

		System.out.println("Funcionários com abono salarial: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

	}

}
