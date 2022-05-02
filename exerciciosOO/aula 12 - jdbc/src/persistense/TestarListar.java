package persistense;

import java.sql.Connection;

import model.Cliente;

public class TestarListar {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao cdao = new ClienteDao();
						
		for(Cliente cliente : cdao.listar()) {
			System.out.println(cliente);
		}

	}

}
