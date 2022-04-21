
public class Exemplo1Vetor {

	public static void main(String[] args) {
		
		//String[] vetor = new String[3];
		//String[] vetor = {"Celular", "TV", "Blue-Ray"};
		//vetor[2] = "Aparelho de Som";
		
		//String[][] matriz = new String[3][2];
		String[][] funcionario = {{"Ana Maria", "anam@gmail.com"}, 
							{"João", "joao@hotmail.com"},
							{"Carla", "carla@uol.com.br"}};
	
		for(int linha = 0; linha < funcionario.length; linha++) {
			for(int coluna = 0; coluna < funcionario[linha].length; coluna++) {
				System.out.print(funcionario[linha][coluna] + " | ");
			} System.out.println();
		}
		

	}

}
