package inheritance;

public class Main {
	public static void main(String[]args) {
		Animal animal=new Animal("Generic animal","huge",400);
		doAnimalStuff(animal,"slow");
		Dog dog= new Dog("Motina","small",90);
		doAnimalStuff(dog,"fast");
		Dog rex= new Dog();
		doAnimalStuff(rex,":fast");
		Dog yoly= new Dog("yokie",15);
		doAnimalStuff(yoly,"fast");
		Dog retriever= new Dog("RETRIEVER",50);
		doAnimalStuff(retriever,"fast");
		Dog wolf= new Dog("wolf",60);
		doAnimalStuff(wolf,"slow");
		Fish fish= new Fish("GOLDIE",25,3,6);
		doAnimalStuff(fish,"fast");
	}

	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("_".repeat(40)+"\n");
	}
}
