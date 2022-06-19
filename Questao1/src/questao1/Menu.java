
package questao1;
  
import java.sql.SQLException;
import java.util.Scanner;
  
  public class Menu {
	  
  public static void main(String[] args) throws SQLException {
  
  Scanner opcao = new Scanner(System.in);
  
  int alternativa = 0;
  
  do {
	  System.out.println("1 - Cadastrar");
	  System.out.println("2 - Atualizar");
	  System.out.println("3 - Excluir");
	  System.out.println("0 - Sair");
	  System.out.print("Informe a opção desejada: ");
	  
	  alternativa =  opcao.nextInt();
  
	  	switch (alternativa) {
	  		case 1: Inserir insercao = new Inserir();
	  		insercao.getInsercao();
	  		break;
    
	  		case 2: Alterar alterar = new Alterar();
	  		alterar.getAlteracao();
	  		break;
  
	  		case 3: Excluir excluir = new Excluir();
	  		excluir.getExclusao();
	  		break;
	  			}
	  		}
  			while (alternativa != 0);
  
  		opcao.close();
  
    	}
  }
 
	
	

  