package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Allan Samey Cordeiro Ramos - RA:201516605 - Turma:SIN3AN-MCA
 * 			
 *
 */


public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Jessica";
		String sobrenome = "Alexandre";
		
		fn.getNome(nome, sobrenome);

	}

}