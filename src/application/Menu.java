package application;

import java.util.Scanner;

public class Menu {
	
	//Criando um Métodos Estaticos para utilizar o Scanner e poder chamar em qualquer lugar do Código
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
	//Criando um loop de Repetição para prender o Menu nas opções do Usuário 
		while(true) {
			
			System.out.println("########## Biblioteca de Filmes ##########");
			System.out.println();
			
			System.out.println("Menu: 1 - Cadastrar Filme");
			System.out.println("Menu: 2 - Excluir Filme");
			System.out.println("Menu: 3 - Listar Filme");
			System.out.println("Menu: 4 - Finalizar Aplicação");
			System.out.println("############################################");
			
			
			System.out.print(">: ");
			
			int resp = sc.nextInt();
			
			System.out.println("############################################");
			
			
			switch(resp) {
				
				case 1:
					
					telaComandos.novoFilme();
					break;
				
				case 2:
					
					telaComandos.removerFilme();
					break;
					
				case 3:
					telaComandos.consultarFilme();
					break;
				
				case 4:
					System.out.println("Aplicação foi Finalizada...");
					System.exit(0);
					
				default:
					System.out.println("Comando Inválido, Por Favor tente novamente...");
			}
		}
		
		
		
	}

}
