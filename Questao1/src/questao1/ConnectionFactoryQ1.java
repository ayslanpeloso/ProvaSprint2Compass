package questao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryQ1 {

	public Connection recuperarConexao() throws SQLException {
		
		 return DriverManager
					.getConnection("jdbc:mysql://localhost/produtos?useTimezone=true&serverTimezone=UTC", "root", "root");
			
	}
	
}
