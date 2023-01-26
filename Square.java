/**
*@author Tyler Lericos
*@version 1.0
*Programming Lab 0.1
*Spring Semester/Freshman
*/

public class Square {

	double side;
	
	public Square() {
		side = 0;
	}
	
	public Square(int side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
		
	}
	
	public void setSide(int newSide) {
		this.side = newSide;
	}
	
	public void area() {
		double area = side *side;
		System.out.println(area); 
	}
	
	
}
