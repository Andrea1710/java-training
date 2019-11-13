package com.nertech;

class Car {
	private boolean engine;
	private int cylinder;
	private String name;
	private int wheels;
	
	public Car(int cylinder, String name) {
		super();
		this.engine = true;
		this.cylinder = cylinder;
		this.name = name;
		this.wheels = 4;
	}

	public int getCylinder() {
		return cylinder;
	}

	public String getName() {
		return name;
	}	
	
	public String startEngine() {
		return "Car => startEngine()";
	}
	
	public String accelerate() {
		return "Car => accelerate()";
	}
	
	public String brake() {
		return "Car => break()";
	}
}

class Mitsubishi extends Car {
	public Mitsubishi(int cylinder, String name) {
		super(cylinder, name);
	}

	@Override
	public String startEngine() {
		return "Mitsubishi => startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi => accelerate()";
	}

	@Override
	public String brake() {
		return "Mitsubishi => brake()";
	}
}

class Ford extends Car {
	public Ford(int cylinder, String name) {
		super(cylinder, name);
	}

	@Override
	public String startEngine() {
		return "Ford => startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford => accelerate()";
	}

	@Override
	public String brake() {
		return "Ford => brake()";
	}
}

class Holden extends Car {
	public Holden(int cylinder, String name) {
		super(cylinder, name);
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName()+ " => startEngine()";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName()+ " => accelerate()";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName()+ " => brake()";
	}
}

public class Main {
	public static void main(String[] args) {
		
		Car car = new Car(8, "Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		
		Ford ford = new Ford(6, "Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		Holden holden = new Holden(6, "Commodor");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());
	}
	
	

}
