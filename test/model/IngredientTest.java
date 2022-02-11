package model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
	
	
	private Ingredient ingredient;
	
	//Esenario
	public void setupStage1() {
		ingredient = new Ingredient("tomate",245);
		
	}
	
	//Casos de prueba
	@Test
	void addWeight() {
		//poner el escenario
		setupStage1();
		String name = ingredient.getName();
		double weight = ingredient.getWeight();
		double inputWeight=54;
		
		ingredient.addWeight(inputWeight);
		ingredient = new Ingredient(name,weight);
		
		//Asserts
		/*int size =  recipe.getIngredients().size();
		assertEquals(size, 1);
		Ingredient ingredient = recipe.getIngredients().get(0);*/
		assertEquals(name, ingredient.getName());
		assertEquals(weight,ingredient.getWeight());
		

	}
	
	@Test
	void test2() throws NegativeNumberException {
		//poner el escenario
		setupStage1();
	
		double inputWeight=-100;
		
		try {
			if(inputWeight<0) {
				throw new NegativeNumberException();
			}
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		
		//Asserts

	}
	
	@Test
	void test3() {
		//poner el escenario
		setupStage1();
		String name = ingredient.getName();
		double weight = ingredient.getWeight();
		double inputWeight=45;
		
		ingredient.removeWeight(inputWeight);
		ingredient = new Ingredient(name,weight);
		
		//Asserts
		assertEquals(name,ingredient.getName());
		assertEquals(weight,ingredient.getWeight());

	}
	
	@Test
	void test4() throws NegativeNumberException {
		//poner el escenario
		setupStage1();
	
		double inputWeight=-100;
		
		try {
			if(inputWeight<0) {
				throw new NegativeNumberException();
			}
		}catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		
		//Asserts
		assertEquals(245, ingredient.getWeight());
	}
}
