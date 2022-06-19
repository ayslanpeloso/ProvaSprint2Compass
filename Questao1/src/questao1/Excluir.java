package questao1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Excluir {
	
	public void getExclusao() throws SQLException {
		
		ConnectionFactoryQ1 connectionFactory = new ConnectionFactoryQ1();
		Connection connection = connectionFactory.recuperarConexao();
			
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRECO FROM TBPRODUTOS ORDER BY ID DESC");
		
		ResultSet rst = stm.getResultSet();
				
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			stm.execute("DELETE FROM tbprodutos WHERE ID = " + (id-1));
			System.out.println("Exclusão realizada");
			
			break; };
			
			connection.close();
		}			
	}