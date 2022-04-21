import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TesteCliente2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdClientesCadastrados = 0;
		
		List<Cliente2> listaClientes = new ArrayList<>();
		
		System.out.println("***Para sair do programa digite um n�mero negativo no campo ID***");

		try {
			for (int i = 1; i >= 1; i++) {
				System.out.print("Digite o id do(a) " + i + "� cliente:");
				int id = sc.nextInt();
				if (id < 0) {
					if(listaClientes.isEmpty()) {
						throw new InputMismatchException("\nObrigada por utilizar nosso programa!\nVoc� cadastrou 0 clientes!");
					}else {
						throw new InputMismatchException("\nObrigada por utilizar nosso programa!\nSegue a lista com " + qtdClientesCadastrados + " clientes cadastrados: ");
					}
					
				}
				System.out.print("Digite o nome do(a)s " + i + "� cliente:");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite a idade do(a) " + i + "� cliente:");
				int idade = sc.nextInt();
				System.out.print("Digite o telefone do(a)" + i + "� cliente:");
				sc.nextLine();
				String telefone = sc.nextLine();
								
				listaClientes.add(new Cliente2(id, nome, idade, telefone));
				qtdClientesCadastrados++;				
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		for(Cliente2 cliente : listaClientes) {
			System.out.println(cliente);
		}

		sc.close();

	}

}
