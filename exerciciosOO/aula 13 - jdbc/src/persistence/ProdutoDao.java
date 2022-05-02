package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import interfaces.ProdutoImplements;
import model.Produto;

public class ProdutoDao implements ProdutoImplements {
	private Connection connection;

	public ProdutoDao() {
		connection = ConnectionFactorySingleton.getConnection();
	}

	public ProdutoDao(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void inserir(Produto produto) {
		try {
			String sql = "insert into produto (nome, descricao, preco, quantidade_estoque) " + "values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
			ps.setInt(4, produto.getQuantidadeEstoque());
			ps.execute();
			//ps.close();
			//connection.close(); //comentar para poder testar transacao
		} catch (Exception e) {
			System.out.println("Erro ao gravar registro do produto !");
		}

	}

	@Override
	public List<Produto> listar() {
		String sql = "select * from produto";
		List<Produto> produtos = new ArrayList<>();
		try {

			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"),
						rs.getString("descricao"), rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
				produtos.add(produto);
			}
			ps.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar");
		}
		return produtos;
	}

	@Override
	public Produto buscar(int codigo) {
		Produto produto = null;
		try {
			String sql = "select * from produto " + "where codigo_produto=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"), rs.getString("descricao"),
						rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
			}
			ps.setInt(1, codigo);
			ps.close();
			connection.close();

		} catch (Exception e) {
			System.out.println("Não foi possivel encontrar o registro");
		}
		return produto;
	}

	@Override
	public void remover(int codigo) {
		try {
			String sql = "delete from produto " + "where codigo_produto=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.execute();
			ps.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao deletar registro do produto !");
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(Produto produto) {
		try {
			String sql = "update produto set " + "nome=?, " + "descricao=?, " + "preco=?, " + "quantidade_estoque=? "
					+ "where codigo_produto=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
			ps.setInt(4, produto.getQuantidadeEstoque());
			ps.setInt(5, produto.getCodigo());
			ps.execute();
			ps.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao atualizar registro do produto !");
		}
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		String sql = "select * from produto " + "where nome ilike '" + nome + "%'";
		List<Produto> produtos = new ArrayList();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto(rs.getInt("codigo_produto"), rs.getString("nome"),
						rs.getString("descricao"), rs.getDouble("preco"), rs.getInt("quantidade_estoque"));
				produtos.add(produto);
			}
			ps.close();
			connection.close();

		} catch (Exception e) {
			System.out.println("Erro ao listar");
			e.printStackTrace();
		}
		return produtos;
	}

}
