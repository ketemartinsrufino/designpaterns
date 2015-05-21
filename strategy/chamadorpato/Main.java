package chamadorpato;

import concrete.Pato;
import concrete.PatoReal;
import strategy.FazerSom;
import strategy.Quack;
import strategy.QuackEstranho;

public class Main {

	public static void main(String[] args) {
		
		FazerSom quack = new Quack();
		FazerSom quackEstranho = new QuackEstranho();
		
		Pato pato = new PatoReal();
		pato.setFazerSom(quack);
		pato.quack();
		
		ChamadorDePato chamador = new ChamadorDePato(quack);
		chamador.fazerSomDePato();
		
		System.out.println("-- Troquei o quack do chamador de pato");
		pato.setFazerSom(quackEstranho);
		pato.quack();
		chamador.setComportamentoDeFazerSom(quackEstranho);
		chamador.fazerSomDePato();
	}
}
