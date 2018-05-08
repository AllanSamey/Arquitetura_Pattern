package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Allan Samey Cordeiro Ramos - RA:201516605 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class Informacao extends Nome{
	
	public Informacao(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		System.out.println(nome + " " + sobrenome + "\n" + sobrenome + ", " + nome);
	}
	
}
