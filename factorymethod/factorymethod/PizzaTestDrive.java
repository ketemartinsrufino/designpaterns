package factorymethod;

import factorymethod.ce.CEPizzaStore;
import factorymethod.chicago.ChicagoPizzaStore;
import factorymethod.ny.NYPizzaStore;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore cearaStore = new CEPizzaStore();
		
		String type = "cheese"; 
		System.out.println("-- Ethan pediu uma pizza de " + type + "\n");
		Pizza pizza = nyStore.orderPizza(type);
		System.out.println("A pizza de "+ pizza.getName()+ " de Ethan! \n ");

		System.out.println("-- Joel pediu uma pizza de " + type + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Saindo a pizza de "+ pizza.getName()+ " de Joel! \n ");
		
		type = "carneSol";
		System.out.println("-- Kete pediu uma pizza de " + type + "\n");
		pizza = cearaStore.orderPizza(type);
		System.out.println("Saindo a pizza de "+ pizza.getName()+ " de Kete! \n ");
		
	}
}