package chamadorpato;

import strategy.FazerSom;

public class ChamadorDePato {
	
	FazerSom comportamentoDeFazerSom;
	
	public ChamadorDePato(FazerSom comportamentoDeFazerSom){
		this.comportamentoDeFazerSom = comportamentoDeFazerSom;
	}
	
	public void setComportamentoDeFazerSom(FazerSom comportamentoDeFazerSom) {
		this.comportamentoDeFazerSom = comportamentoDeFazerSom;
	}
	
	public void fazerSomDePato() {
		comportamentoDeFazerSom.fazerQuack();
	}

}
