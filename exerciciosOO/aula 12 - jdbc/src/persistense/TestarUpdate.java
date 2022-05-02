package persistense;

import java.sql.Connection;

import model.Cliente;

public class TestarUpdate {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao cdao = new ClienteDao();
		
		Cliente cliente = new Cliente(1, "Breno", "22324325", "breno@gmail.com");
				
		cdao.atualizar(cliente);

	}

}
