package Exercicio7_1;
/**
 * 
 * @author Allan Samey Cordeiro Ramos - RA:201516605 - Turma:SIN3AN-MCA
 * 			
 *
 */
public class ManipuladorMinusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
