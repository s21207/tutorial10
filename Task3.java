package pgo9;

public class Task3 {
	
}

class Animal {
	public void makeNoise() {
		
	}
	
	public void sleep() {
		
	}
	
	public void roam() {
		
	}
}

class Lion extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Roar");
	}
}

class Cat extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
}

class Wolf extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Auuuu");
	}
}

class Dog extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Bark");
	}
}
