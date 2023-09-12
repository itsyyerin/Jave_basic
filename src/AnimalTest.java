class Animal{
	String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void sleep() {
		System.out.println(name + "is sleeping");
	}
	
	public void eat() {
		System.out.println(name + "is eating");
	}
	
	
}

//dog 클래스 정의(animal 클래스를 상속받음)
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name + "is barking");
	}
}

//cat 클래스 정의(animal 클래스를 상속받음)
class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	public void play() {
		System.out.println(name + "is playing");
	}
	
	
}



public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("yerin");
		Cat cat = new Cat("yyerin");
		
		dog.sleep();
		dog.eat();
		dog.bark();
		
		cat.sleep();
		cat.eat();
		cat.play();
	}

}
