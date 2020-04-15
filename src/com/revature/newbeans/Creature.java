package com.revature.newbeans;

public class Creature {

	//Variables
	private String creatureKind;
	private int arms;
	private int legs;
	private boolean tail;
	private int height;
	private int weight;

	//getters and setters
	
	public String getCreatureKind() {
		return creatureKind;
	}
	
	public void setCreatureKind(String creatureKind) {
		this.creatureKind=creatureKind;
	}
	
	public int getArms() {
		return arms;
	}
	
	public void setArms(int arms) {
		this.arms=arms;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs=legs;
	}

	public boolean getTail() {
		return tail;
	}
	
	public void setTail(boolean tail) {
		this.tail=tail;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
}
