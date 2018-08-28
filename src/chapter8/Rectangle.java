package chapter8;
//done done

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(){
		length = 1.0;
		width = 1.0;
	}
	
	public double getLength(){
		return length;
	}
	public void setLength(double lenght){
		if(length < 0 || length > 20){
			throw new IllegalArgumentException("Incorrect length."
					+ "It has to be more than 0 and les to 20");
		}
		this.length = lenght;
	}
	
	public double getWidth(){
			return width;
	}
	
	public void setWidth(double width){
		if(width < 0 || width > 20){
			throw new IllegalArgumentException("Incorrect width."
					+ "It has to be more than 0 and les to 20");
		}
		this.width = width;
	}
	
	public double calculatePerimeter(){
		return (width + length) * 2;
	}
	
	public double calculateArea(){
		return width * length;
	}
}
