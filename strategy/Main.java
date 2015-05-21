

import chamadorpato.ChamadorDePato;
import strategy.ComportamentoDeVoar;
import strategy.NaoVoar;
import strategy.Quack;
import strategy.VoarComAsas;
import strategy.VoarComoFoguete;
import concrete.Pato;
import concrete.PatoReal;

public class Main {
	
	private static ComportamentoDeVoar voar;
	private static ComportamentoDeVoar naoVoar;
	private static ComportamentoDeVoar voarComoFoguete;

	public static void main(String[] args) {
		
		voar = new VoarComAsas();
		naoVoar = new NaoVoar();
		voarComoFoguete = new VoarComoFoguete();
		Pato p = new Pato();
		
		System.out.println("Começando a vida voando...");
		
		p.setVoar(naoVoar);
		p.voar();
	
		System.out.println("Voando como foguete");
		p.setVoar(voarComoFoguete);
		p.voar();
		
	}
	
}
