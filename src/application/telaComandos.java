package application;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class telaComandos {
	
	
	// Criando 3 Objetos Estáticos para utilizar a função de Scanner, Para criar uma Lista e Chamar a Classe de Cadastro de Filme.
	
	static Scanner sc = new Scanner(System.in);
	
	static List<CadastroFilme> filme = new ArrayList<CadastroFilme>();

	static CadastroFilme novoFilme;
	
	
	//Funções do Aplicativo para Criar/ Remover e Consultar
	
	public static void novoFilme() {
		
		//Chamando os dados para ser preenchido pelo Usuário
		
		System.out.print("Digite a ID do Filme: ");
		int id = sc.nextInt();
		
		
		System.out.print("Digite o Nome do Filme: ");
		String nome = sc.next();
		
		System.out.print("Digite o Genero do Filme: ");
		String genero = sc.next();
		
		System.out.print("Digite o Ano do Filme: ");
		int ano = sc.nextInt();
		
		
		
		
		
		//Instanciando um a Classe assim Criando um Objeto Novo.
		novoFilme = new CadastroFilme(id, nome,  genero,  ano);
		
		
		//Adicionando a Classe Instanciada em uma Lista
		
		filme.add(novoFilme);
		System.out.println();
		
		
		//Realizando o Print Formatado da Lista com o Objeto Criado.
		System.out.println("Filme Cadastrado com Sucesso !!" );
		System.out.println("ID: " + novoFilme.getId() + " | " +
							"Nome: "+ novoFilme.getNome()+ " | " +
							"Genero: " + novoFilme.getGenero()+" | "+
							"Ano: "+ novoFilme.getAno()+ " | ");
		
		System.out.println();
	}
	
	public static void removerFilme() {
		
		//Criando um loop Para preender o Usuário
		while(true) {
			
			//Print de Cabeçalho
			
			System.out.println();
			System.out.println("########## Filmes Cadastrados #############");
			
			
			//Criando um loop para verificar o que tem denntor da Lista(filme)
			
			for(CadastroFilme loopFilme: filme) {
				
				//Mostrando os dados da Lista
				System.out.println(loopFilme.toString());
			}
			
			
			
			System.out.println("#############################################");
			
			System.out.println("Digite a ID do Filme que Deseja Excluir: ");
			System.out.print(">: ");
			int idFilme = sc.nextInt();
			
			System.out.println("#############################################");
			System.out.println();
			
			
			//Criando um Loop para acessar todos os dados do da Classe do Objeto e da Lista instanciada
			
			for(int i = 0; i < filme.size() ;i++)
		    {
				
				//Instanciando um novo Objeto mais agora para Verificar se o Mesmo já está dentro da Lista
		        CadastroFilme criarFilme = filme.get(i);

		        
		        //Criando uma condição para Verificar se o Objeto já existe com o Mesmo index da Lista
		        if(criarFilme.getId()==idFilme)
		        	
			        {
		        	
			        	System.out.println();
			        	
			        	//Fazendo Print de tudo que tem na Lista filtrada pelo Index -Id Digitado pelo Usuário
			        	
			        	String frase= "ID: " + criarFilme.getId() +" | " +
			        			"Nome: " + criarFilme.getNome()+ " | " +
			        			"Genero: " + criarFilme.getGenero()+ " | "+
			        			"Ano: " + criarFilme.getAno() + " |";
			        			
			        	System.out.println("Filme: " + frase);
			        	
			        	System.out.println("#############################################");
	
			        	
			        	System.out.println("Deseja Realmente Excluir o Filme ?: 1- Sim | 2- Não");
			        	System.out.print(">: ");
			        	int resp = sc.nextInt();
			        	
			        	System.out.println("#############################################");
			        	
			        	//Criando uma Condição para cada Ação do usuário
			        	switch(resp) {
			        	
			        		//Se a Opção for 1 vai remover o index escolhido da Lista
			        		case 1:
			        			
			        			//Removendo o Index da lista, sendo escolhida pelo Usuário
			        			filme.remove(i);
			        			System.out.println("Filme excluido com Sucesso !");
			        			System.out.println("#############################################");
			        			System.out.println();
			        			Menu.main(null);
			        			break;
			        		
			        		//Se a Opção for 2 Não vai remover o index escolhido da lista
			        		case 2:
			        			System.out.println("#############################################");
			        			System.out.println("Filme não Foi Excluido");
			        			System.out.println("#############################################");
			        			System.out.println();
			        			Menu.main(null);
			        			break;
			        		
			        		//Condição com Erro
			        		default:
			        			System.out.println("#############################################");
			        			System.out.println("Comando Inválido !");
			        			System.out.println();
			        			break;
			        		}
			           
				        }
				        
			        
			
		}
		
	        
	        
	    }
		
	
		
	}

	public static void consultarFilme() {
		
		
		//Print de Cabeçalho 
		
		System.out.println();
		System.out.println("########## Consultar Biblioteca de Filmes #############");
		
		System.out.println();
		
		
		
		//Criando um loopp para percorrer cada dado da Lista
		for(int i=0 ; i< filme.size();i++) {
			
			//Instanciando um Novo Objeto e verificando se os dados são iguais a da Lista
			CadastroFilme consultarFilme = filme.get(i);
			
			//Print para mostrar os dados da Lista
			System.out.println(consultarFilme);
			
		}
		System.out.println();
		System.out.println("#############################################");
		System.out.println();
	}

}
