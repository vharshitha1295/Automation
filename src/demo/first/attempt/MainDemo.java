package demo.first.attempt;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.setName("Animal");
		animal.setType("Pet");
		animal.show(animal.getName(),animal.getType());
		animal.makeNoise();
		System.out.println();

		Animal animal1 = new Dog();
		animal1.setName("Dog");
		animal1.setType("Pet");
		animal1.show(animal1.getName(),animal1.getType());
		animal1.makeNoise();
		System.out.println("\n");

		Dog dog = new Dog();
		dog.setName("Dog child");
		dog.setType("Dog child Pet");
		dog.show(dog.getName(),dog.getType());
		dog.makeNoise();

	}

}
