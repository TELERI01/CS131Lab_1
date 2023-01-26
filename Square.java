
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
