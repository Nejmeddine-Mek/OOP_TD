package main;

import java.util.*;

public class Animal implements Comparable<Animal>{
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	// create a new equals method for Animal
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal a = (Animal) o;
		return name.equals(a.name);
	}
	
	public int hashCode() {
		return this.getName().hashCode();
	}
	@Override
	public int compareTo(Animal o) {
		
		return this.getName().compareTo(o.getName());
	}
	
	public static void startsWithC(Collection<Animal> animals) {
		Iterator<Animal> animalIt = animals.iterator();
		System.out.println("animals names that start with c");
		while(animalIt.hasNext()) {
			Animal cur = animalIt.next();
			if(cur.getName().toUpperCase().charAt(0) == 'C') System.out.println(cur.getName());
		}
	}
}	
