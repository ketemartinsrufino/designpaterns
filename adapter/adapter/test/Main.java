package adapter.test;

import adapter.TurkeyAdapter;
import adapter.DuckAdapter;
import target.Duck;
import target.MallardDuck;
import target.Turkey;
import target.WildTurkey;

public class Main {
	

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		
//		System.out.println(" - Pato - ");
//		duck.fly();
//		duck.quack();
//		
//		System.out.println("Acabou os patos...");
//		duck = new TurkeyAdapter(turkey);
//		duck.fly();
//		duck.quack();
		
		System.out.println(" - Peru - ");
		turkey.fly();
		turkey.gobble();
		
		System.out.println("Acabou os perus...");
		duck = new MallardDuck();
		turkey = new TurkeyAdapter(duck);
		turkey.fly();
		turkey.gobble();
		
	}
	
}
