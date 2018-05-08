package Exercicio2_2_FactoryMethod;
/**
 * 
 * @author Allan Samey Cordeiro Ramos - RA:201516605 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class ProvedorInformacao extends Texto{
	
	public ProvedorInformacao(){
		
	}
	public ProvedorInformacao(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
