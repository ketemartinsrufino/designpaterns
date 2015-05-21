package factorymethod.chicago;

import factorymethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		massa = "Extra Thick Crust Dough";
		molho = "Plum Tomato Sauce";
		coberturas.add("Shredded Mozzarella Cheese");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}