package concrete;

import strategy.ComportamentoDeVoar;

public class PatoReal extends Pato {

	public PatoReal(ComportamentoDeVoar voar){
		super.comportamentoDeVoar = voar;
	}
	
	public PatoReal() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		System.out.println("Sou um Pato Real =D");
	}
}
