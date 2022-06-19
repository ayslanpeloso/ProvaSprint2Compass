package questao1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocaoTotal {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactoryQ1 factory = new ConnectionFactoryQ1();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM tbprodutos WHERE id > 0");
			
		System.out.println("Produto(s) excluído(s)");
	}
	

}
