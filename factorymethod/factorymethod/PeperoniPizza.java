package factorymethod;

public class PeperoniPizza extends Pizza {

	public PeperoniPizza() {
		name = "Peperoni Pizza"; 
		massa = "Fina";
		molho = "Tomate";
		coberturas.add("Salame italiano");
		coberturas.add("Queijo");
		coberturas.add("Pimentao");
	}
}
