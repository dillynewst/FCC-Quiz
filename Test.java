// Java program to show inheritence

import java.io.*;

//interface to define functionality
interface Animal {
	// interfaces have abstract methods that must be implimented in classes that implement the interface
	void identifyMyself();
}

//Super class to implement interface
class Dog implements Animal {
	// Implement Animal methods
	public void identifyMyself() {
		System.out.println("I am a dog!");
	}
}

//sub class to inherit functionality of super class
class GoldenRetriever extends Dog {
	// Override the identifyMyself method in the super class
	@Override
	public void identifyMyself() {
		System.out.println("I am a golden retriever!");
	}
}

public class Test {
	public static void main(String args[]) {
		Dog dog = new Dog();
		GoldenRetriever gr = new GoldenRetriever();
		dog.identifyMyself();
		gr.identifyMyself();
	}
}