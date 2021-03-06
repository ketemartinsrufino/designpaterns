package factorymethod.ny;

import factorymethod.GreekPizza;
import factorymethod.PeperoniPizza;
import factorymethod.Pizza;
import factorymethod.PizzaStore;


public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PeperoniPizza();
		}
		
		return pizza;
	}

}
