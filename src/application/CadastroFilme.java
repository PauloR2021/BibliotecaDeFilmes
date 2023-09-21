package application;


//Criando uma Classe Construtora para Realizar o Cadastro dos Filmes

public class CadastroFilme {
	
	int id;
	String nome;
	int ano;
	String genero;
	
		
	
	
	public CadastroFilme(int i, String n, String g,int a) {
		
		this.id = i;
		this.nome = n;
		this.genero = g;
		this.ano = a;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public String toString() {
		
		return "ID: " + this.getId() + " | " +
		"Nome: " + this.getNome() + " | " +
		"Genero: " + this.getGenero() + " | " +
		"Ano: " + this.getAno();
	}
	
	

}
