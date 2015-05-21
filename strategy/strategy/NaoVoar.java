package strategy;


public class NaoVoar implements ComportamentoDeVoar{

	@Override
	public void voar() {
		System.out.println("Eu nao voo... =( ");		
	}

}
