package demo.first.attempt;

public class Dog extends Animal {
	
	@Override
	public void makeNoise() {
		System.out.print("Dog Making Noise");
	}

	@Override
	public String show(String name,String type) {
		System.out.println("Dog [name=" + this.name + ", type=" + this.type + "]");
		return "Dog [name=" + this.name + ", type=" + this.type + "]";
	}

}
