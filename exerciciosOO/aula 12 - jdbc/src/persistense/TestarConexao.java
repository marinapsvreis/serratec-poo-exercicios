package persistense;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
	}

}
