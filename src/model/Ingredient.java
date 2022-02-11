package model;

public class Ingredient {
	private String name;
	private double weight;
	
	
	public Ingredient(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	//METODOS
	public void addWeight(double inputWeight) {
		weight = weight + inputWeight;
		System.out.println("El peso se a actualizado: "+weight);
		
	
	} 
	
	 public void removeWeight(double inputWeight) {
		 weight = weight - inputWeight;
		 System.out.println("El peso se a actualizado: "+weight);
	 }
	 
	//GETSET
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
