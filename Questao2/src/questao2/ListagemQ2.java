package questao2;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListagemQ2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		
		int itens = 0;
		int pagina = 0;
		int offset = 0;
		
		System.out.println("*****CONSULTA DE FILMES*****\n\n"
				+ "***Escolha da Página de Filmes***\n"
				+ "Página número 1 -> Filmes de 1 a 10\n"
				+ "Página número 2 -> Filmes de 11 a 20\n\n"
				+ "Escolha o número da página de filmes que deseja acessar: ");
		pagina = input.nextInt();
		
		System.out.println("\n***Escolha do Número de Filmes***\n"
				+ "Digite a quantidade de filmes (de 1 a 10) da página que deseja ver: ");
		itens = input.nextInt();		
		
		if (pagina == 1) {
			offset = 0;
		} else if (pagina == 2) {
			offset = 10;
		};
		
			
		ConnectionFactoryQ2 connectionFactory = new ConnectionFactoryQ2();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO, ANO FROM FILME LIMIT " + itens + " OFFSET " + offset);	
		
		stm.execute();		
		ResultSet rst = stm.getResultSet();		
		while (rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
			Integer ano = rst.getInt("ANO");
			System.out.println(ano);
			
		input.close();
		}
	}

}
