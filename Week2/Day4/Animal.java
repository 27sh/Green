package day04;

public class Animal {
	
	public void cry() {
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Tiger();
		
		animal1.cry();
		animal2.cry();
		animal3.cry();
	}

}

package day04;

public class Dog extends Animal {
	@Override
	public void cry() {
		System.out.println("멍멍");
	}

}
package day04;

public class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}
package day04;

public class Tiger extends Animal {
	@Override
	public void cry() {
		System.out.println("어흥");
	}
}
