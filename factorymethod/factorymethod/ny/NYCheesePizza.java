package factorymethod.ny;

import factorymethod.Pizza;

public class NYCheesePizza extends Pizza {

	 public NYCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza"; 
		massa = "Thin Crust Dough";
		molho = "Marinara Sauce";
		coberturas.add("Grated Reggiano Cheese");
	}
}
