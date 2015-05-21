package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	protected String name;
	protected String massa;
	protected String molho;
	protected List<String> coberturas = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparando "+ name);
		System.out.println("Agitando  a massa...");
		System.out.println("Adicionando o molho...");

		System.out.println("Adicionando o coberturas:");
		for (String c : coberturas) {
			System.out.println(" "+ c);
		}
		
	}

	public void bake() {
		System.out.println("Cozinhando por 32 minutos.");
		
	}

	public void cut() {
		System.out.println("Cortando a pizza em pedaços diagonais.");
		
	}

	public void box() {
		System.out.println("Embalando em uma caixa oficial da Pizza Store");
		
	}

	public String getName() {
		return name;
	}

}
