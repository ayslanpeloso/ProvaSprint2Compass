package questao1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException{
		
		ConnectionFactoryQ1 connectionFactory = new ConnectionFactoryQ1();
		Connection connection = connectionFactory.recuperarConexao();
			
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRECO FROM TBPRODUTOS");
		
		ResultSet rst = stm.getResultSet();
				
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
			Integer quantidade = rst.getInt("QUANTIDADE");
			System.out.println(quantidade);
			Float preco = rst.getFloat("PRECO");
			System.out.println(preco);
			
		}
				
		connection.close();
		
		}
	}


