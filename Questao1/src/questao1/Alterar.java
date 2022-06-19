package questao1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Alterar {


	
	public void getAlteracao() throws SQLException{
		
		
		ConnectionFactoryQ1 connectionFactory = new ConnectionFactoryQ1();
		Connection connection = connectionFactory.recuperarConexao();
			
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRECO FROM TBPRODUTOS ORDER BY ID DESC");
		
		ResultSet rst = stm.getResultSet();
				
		while(rst.next()) {
			Integer id = rst.getInt("ID");			
			stm.execute("UPDATE tbprodutos SET PRECO = 1299 WHERE ID = " + (id-2));
			System.out.println("Alteração realizada");
			
			break; };
			
			connection.close();
		}			
	}
		
		
		
		
	


