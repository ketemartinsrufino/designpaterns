package adapter;

import target.Duck;
import target.Turkey;

public class TurkeyAdapter implements Turkey{

	private Duck duck;
	
	public TurkeyAdapter(Duck duck){
		this.duck = duck;
	}
	
	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}
}


