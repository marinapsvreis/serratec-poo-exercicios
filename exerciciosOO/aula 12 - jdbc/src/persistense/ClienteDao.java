package persistense;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Cliente cliente) {
		try {
			String sql = "insert into cliente (nome, telefone, email) "
						+ "values(?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTelefone());
			ps.setString(3, cliente.getEmail());
			ps.execute();
			ps.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Não foi possivel gravar o registro");
		}
	}
	
	public void atualizar(Cliente cliente) {
		try {
		String sql = "update cliente "
				+ "set nome=?, "
				+ "telefone=?, "
				+ "email=? "
				+ "where codigo=?";
	
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, cliente.getNome());
		ps.setString(2, cliente.getTelefone());
		ps.setString(3, cliente.getEmail());
		ps.setInt(4, cliente.getCodigo());
		ps.execute();
		ps.close();
		connection.close();
		
		} catch (Exception e) {
		System.out.println("Não foi possivel alterar o registro");
		}
	}
	
	public void remover(int codigo) {
		try {
		String sql = "delete from cliente "
				+ "where codigo=?";
	
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, codigo);
		ps.execute();
		ps.close();
		connection.close();
		
		} catch (Exception e) {
		System.out.println("Não foi possivel deletar o registro");
		}
	}
	
	public List<Cliente> listar(){
		String sql = "select * from public.cliente";
		List<Cliente> clientes = new ArrayList<>();
		try {
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"), 
												rs.getString("nome"), 
												rs.getString("telefone"), 
												rs.getString("email"));
				clientes.add(cliente);
			}
			ps.close();
			connection.close();			
		} catch (Exception e) {
			System.out.println("Erro ao listar");
		}
		return clientes;
	}
	
	public Cliente buscar(int codigo) {
		Cliente cliente = null;
		try {
			String sql = "select * from cliente "
					+ "where codigo=?";		
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				cliente = new Cliente(rs.getInt("codigo"), 
											rs.getString("nome"), 
											rs.getString("telefone"), 
											rs.getString("email"));
			}
			ps.setInt(1, codigo);			
			ps.close();
			connection.close();
			
			} catch (Exception e) {
			System.out.println("Não foi possivel encontrar o registro");
			}
		return cliente;
	}

}
