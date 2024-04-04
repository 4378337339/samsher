package com.example.week03;

class pen{
	String color;
	String type;
	String company;
	public void write() {
		System.out.println("type of pen is:"+ this.type);
	}
	public void printcolor() {
		System.out.println("color of pen is :"+ this.color);
				
	}
	public void printcompany() {
		System.out.println("Name of company is: "+ this.company);
				
	}
}


public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
pen pen1= new pen();
pen1.color="red";
pen1.type= "gel";
pen1.company="techno";

pen1.write();
pen1.printcolor();
pen1.printcompany();



	}

}
