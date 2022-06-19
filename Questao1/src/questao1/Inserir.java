package questao1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserir {
		

	
	public void getInsercao() throws SQLException {
		
		
		ConnectionFactoryQ1 factory = new ConnectionFactoryQ1();
		Connection connection = factory.recuperarConexao();
		
		Statement stm1 = connection.createStatement();
		Statement stm2 = connection.createStatement();
		Statement stm3 = connection.createStatement();
		
		stm1.execute("INSERT INTO tbprodutos (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES ('Ar Condicionado', 'Ar Condicionado Electrolux 9.000 BTUs Convencional', 1, 1500)"
		, Statement.RETURN_GENERATED_KEYS);
				
		stm2.execute("INSERT INTO tbprodutos (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES ('Ar Condicionado', 'Ar Condicionado Electrolux 9.000 BTUs Convencional', 1, 1500)"
		, Statement.RETURN_GENERATED_KEYS);
		
		stm3.execute("INSERT INTO tbprodutos (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES ('Ar Condicionado', 'Ar Condicionado Electrolux 9.000 BTUs Convencional', 1, 1500)"
				, Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst1 = stm1.getGeneratedKeys();
		while (rst1.next()) {
			Integer id1 = rst1.getInt(1);
			System.out.println("Os produtos com IDs " + id1 + ", " + (id1+1) + " e " + (id1+2) + " foram adicionados.");}
		
		
	}
	
	public class Alteracao extends Inserir{
		
		public void getAlteracao() throws SQLException {
			
			ConnectionFactoryQ1 factory = new ConnectionFactoryQ1();
			Connection connection = factory.recuperarConexao();
			
			Statement stm = connection.createStatement();
			stm.execute("UPDATE tbprodutos SET PRECO = 1300 WHERE ID ");
				
			System.out.println("Produto(s) alterado(s)");
			
			
		}
	}
}
		
		
