package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Allan Samey Cordeiro Ramos - RA:201516605 - Turma:SIN3AN-MCA
 * 			
 *
 */


//Fabrica de impressão na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
