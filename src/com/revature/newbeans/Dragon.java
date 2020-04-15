package com.revature.newbeans;

public class Dragon {

	public static void main(String[] args) {
		//Instantiate Creature
		Creature creature=new Creature();
		
		//Set Descriptions
		creature.setCreatureKind("Dragon");
		creature.setArms(0);
		creature.setLegs(4);
		creature.setTail(true);
		creature.setHeight(39);
		creature.setWeight(2500);
		
		
		//Show everything
		System.out.println("Kind of Creature: " + creature.getCreatureKind());
		System.out.println("Number of Arms: " + creature.getArms());
		System.out.println("Number of Legs " + creature.getLegs());
		System.out.println("Has a Tail? " + creature.getTail());
		System.out.println("Height: " + creature.getHeight() + " feet");
		System.out.println("Weight: " + creature.getWeight() + " pounds");
		

	}

}
