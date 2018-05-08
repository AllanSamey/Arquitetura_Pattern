package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Allan Samey Cordeiro Ramos - RA:201516605 - Turma:SIN3AN-MCA
 * 			
 *
 */


//Impressão na Tela
public class ImpressaoTela implements Impressao {
	
	public void imprimir(String string) {
		System.out.println(string);
	}

}
