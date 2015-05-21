package factorymethod;

public class SimplePizzaFactory {

	public Pizza create(String type){
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PeperoniPizza();
		}
		
		return pizza;
	}
}
