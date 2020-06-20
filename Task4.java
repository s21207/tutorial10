package pgo9;

public class Task4 {

}

class Animal {
	public void makeNoise() {
		
	}
	
	public void sleep() {
		
	}
	
	public void roam() {
		
	}
}

class Feline extends Animal {
	@Override
	public void roam() {
		System.out.println("Feline roaming");
	}
}

class Canine extends Animal {
	@Override
	public void roam() {
		System.out.println("Canine roaming");
	}
}

class Lion extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("Roar");
	}
}

class Cat extends Feline {
	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
}

class Wolf extends Canine {
	@Override
	public void makeNoise() {
		System.out.println("Auuuu");
	}
}

class Dog extends Canine {
	@Override
	public void makeNoise() {
		System.out.println("Bark");
	}
}