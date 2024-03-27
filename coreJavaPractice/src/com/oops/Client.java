package com.oops;

public class Client {

	public static void main(String[] args) {
		Bike bike=new Bike(10);
		bike.speed(bike);
	}
}

 abstract class Vehicle
{
	 int maxspeed;
	 
	 
	 public Vehicle(int maxspeed) {
		this.maxspeed = maxspeed;
	}


	public void speed(Bike bike) {
		// TODO Auto-generated method stub
		
	}


	public abstract void speed();
}
 class Bike extends Vehicle
 {
	 

	

	public Bike(int maxspeed) {
		super(maxspeed);
		
	}

	@Override
	public void speed(Bike bike) {
		
		//maxspeed=100;
		System.out.println("maximum speed of the Vehicle is "+ bike);
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Bike [maxspeed=" + maxspeed + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	 
 }
  
