package factorymethod.ce;

import factorymethod.Pizza;
import factorymethod.PizzaStore;

public class CEPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("carneSol")) {
			pizza = new CarneSolCatupiryPizza();
		}
		return pizza;
	}

}
