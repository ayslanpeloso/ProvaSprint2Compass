package questao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionFactoryQ2 {
	
public Connection recuperarConexao() throws SQLException {
		
		 return DriverManager
					.getConnection("jdbc:mysql://localhost/questao2?useTimezone=true&serverTimezone=UTC", "root", "root");
			
	}
	
}
