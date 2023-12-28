package demo.first.attempt;

public class Animal {
	String name;
	String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void makeNoise() {
		System.out.println("Animal Making Noise");
	}
	
	public String show(String name,String type) {
		System.out.println("Animal [name=" + this.name + ", type=" + this.type + "]");
		return "Animal [name=" + this.name + ", type=" + this.type + "]";
	}
}
