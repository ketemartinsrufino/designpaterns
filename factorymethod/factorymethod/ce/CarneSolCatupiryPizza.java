package factorymethod.ce;

import factorymethod.Pizza;

public class CarneSolCatupiryPizza extends Pizza {
	
	public CarneSolCatupiryPizza() {
		name = "Carne Sol com Catupiry Pizza"; 
		massa = "Média";
		molho = "Tomate";
		coberturas.add("Mussarela");
		coberturas.add("Carne do Sol");
		coberturas.add("Catupiry");
	}
	
	@Override
	public void box() {
		System.out.println("Embalando uma pizza bem boa numa caixa bem bonita da loja");
	}

}
