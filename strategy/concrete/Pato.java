package concrete;

import strategy.ComportamentoDeVoar;
import strategy.FazerSom;

public class Pato {
	
	ComportamentoDeVoar comportamentoDeVoar;
	FazerSom comportamentoDeSom;
	
	public void display() {
		System.out.println("Sou um Pato!");
	}
	
	public void voar () {
		comportamentoDeVoar.voar();
	}
	
	public void setVoar(ComportamentoDeVoar voar) {
		this.comportamentoDeVoar = voar;

	}
	
	public void setFazerSom(FazerSom som) {
		this.comportamentoDeSom = som;
	}
	
	public void quack() {
		comportamentoDeSom.fazerQuack();
	}
	
}
