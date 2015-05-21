package factorymethod;

public class GreekPizza extends Pizza {

	public GreekPizza() {
		name = "GreekPizza"; 
		massa = "Fina";
		molho = "Tomate";
		coberturas.add("Mussarela de Bufalo");
		coberturas.add("Presunto");
		coberturas.add("Tomate seco");
	}
	
}
