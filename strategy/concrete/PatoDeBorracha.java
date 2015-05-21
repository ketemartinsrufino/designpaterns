package concrete;

import strategy.ComportamentoDeVoar;

public class PatoDeBorracha extends Pato {

	public PatoDeBorracha(ComportamentoDeVoar voar){
		super.comportamentoDeVoar = voar;
	}
	
	@Override
	public void display() {
		System.out.println("Sou um Pato de Borracha!");
	}
}
