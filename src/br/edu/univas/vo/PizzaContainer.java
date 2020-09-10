package br.edu.univas.vo;

import java.util,ArrayList;
import java.util.List;

public class PizzaContainer implements Ingredients{
	private List<Ingredients> ingredients;

	public PizzaContainer() {
		ingredients = new ArrayList<>();
	}

	@Override
	public String description() {
		String final_description = "";	
		for(Ingredients ingredient : ingredients){
			final_description += ingredient.description(); + " ";
        }
		return final_description;
	}

	@Override
	public double price() {
			double total = 0;
			
			for(Ingredients ingredient : ingredients){
	            total += ingredient.price();
	        }
			return total;
	}

	public void addComponent(Ingredients component) {
		ingredients.add(component);
	}

	public void removeComponent(Ingredients component) {
		ingredients.remove(component);
	}
}