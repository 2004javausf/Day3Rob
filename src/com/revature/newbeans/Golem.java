package com.revature.newbeans;

public class Golem {

	public static void main(String[] args) {
		//Instantiate Creature
				Creature creature=new Creature();
				
				//Set Descriptions
				creature.setCreatureKind("Golem");
				creature.setArms(2);
				creature.setLegs(2);
				creature.setTail(false);
				creature.setHeight(15);
				creature.setWeight(2000);
				
				//Show everything
				System.out.println("Kind of Creature: " + creature.getCreatureKind());
				System.out.println("Number of Arms: " + creature.getArms());
				System.out.println("Number of Legs " + creature.getLegs());
				System.out.println("Has a Tail? " + creature.getTail());
				System.out.println("Height: " + creature.getHeight() + " feet");
				System.out.println("Weight: " + creature.getWeight() + " pounds");
				

			}

	}
