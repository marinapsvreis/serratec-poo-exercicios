package persistense;

import java.sql.Connection;

import model.Cliente;

public class TestarDelete {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao cdao = new ClienteDao();
						
		cdao.remover(1);

	}

}
