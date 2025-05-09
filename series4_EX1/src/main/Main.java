package main;


import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		HashSet<Animal> animals = new HashSet<>();
			// populating a hash set with some animals 

		animals.add(new Animal("garfield the cat"));
		animals.add(new Animal("Jerry the mouse"));
		animals.add(new Animal("Maxx the dog"));
		animals.add(new Animal("Jorgen the horse"));
		
		// using an iterator to iterate in a hash set (Collection)
		Iterator<Animal> animalsIterator = animals.iterator();
		/*
			// this chunk for the first display
		while(animalsIterator.hasNext()) {
			System.out.println(animalsIterator.next().getName());
		}
		 */
		System.out.println("\n\n\n\n");
		// adding new animals with the same old names:
		animals.add(new Animal("garfield the cat"));
		animals.add(new Animal("garfield the cat"));
		animals.add(new Animal("Jorgen the horse"));
		
		// notice that the Hash set accepts duplicates!
		Iterator<Animal> animalsIterator2 = animals.iterator();
		/*
			// this chunk is for the second display
		while(animalsIterator2.hasNext()) {
			System.out.println(animalsIterator2.next().getName());
		}
		*/
		
		// even while overloading equals, and overriding hashCode we still have duplicates
		// test now for a tree set
		TreeSet<Animal> animalsTree = new TreeSet<>();
		// but before any of this, our class must implement comparable!
		// because in a TreeSet elements are sorted
		animalsTree.add(new Animal("garfield the cat"));
		animalsTree.add(new Animal("Jerry the mouse"));
		animalsTree.add(new Animal("Maxx the dog"));
		animalsTree.add(new Animal("Jorgen the horse"));
		animalsTree.add(new Animal("garfield the cat"));
		animalsTree.add(new Animal("Jorgen the horse"));
		// yet we have duplicates
		
		Iterator<Animal> animalsTreeIterator = animalsTree.iterator();
		
		while(animalsTreeIterator.hasNext()) {
			System.out.println(animalsTreeIterator.next().getName());
		}
		
		
		// now let's use lists, part 2 of the exercise
		
		List<Animal> animalsList = new ArrayList<Animal>();
		
		animalsList.add(new Animal("garfield the cat"));
		animalsList.add(new Animal("Jerry the mouse"));
		animalsList.add(new Animal("Maxx the dog"));
		animalsList.add(new Animal("Jorgen the horse"));
		animalsList.add(new Animal("garfield the cat"));
		animalsList.add(new Animal("Jorgen the horse"));
		animalsList.add(new Animal("Casper the dragon"));
		// display list of animals
		for(Animal animal: animalsList) {
			System.out.println(animal.getName());
		}
		//for the list
		Animal.startsWithC(animalsList);
		// for the tree
		Animal.startsWithC(animalsTree);
		
		// now, let us sort the list then display it
		Collections.sort(animalsList);
		
		System.out.println("---------Sorted list-------");
		for(Animal animal: animalsList) {
			System.out.println(animal.getName());
		}
		
		// now we go to part 3, Maps
		
		Map<Animal, Tattoo> animalTattoo = new HashMap<Animal, Tattoo>();
		animalTattoo.put(new Animal("George"), new Tattoo("Fat Man"));
		animalTattoo.put(new Animal("Capser"), new Tattoo("Flame Dragon"));
		// test for duplicates here
		animalTattoo.put(new Animal("Capser"), new Tattoo("Flame Dragon"));
		animalTattoo.put(new Animal("Jake"), new Tattoo("Yellow Dog"));
		
		//get the entries
		Set<Entry<Animal, Tattoo>> hashedSet = animalTattoo.entrySet();
		// then we loop through that
		for(Entry<Animal, Tattoo> entry: hashedSet) {
			System.out.println("key: " + entry.getKey().getName() + ", value: "+ entry.getValue().getName());
		}
	}
}
