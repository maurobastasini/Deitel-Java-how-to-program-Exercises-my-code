package chapter8;
//done done
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect2.setLength(8);
		rect2.setWidth(3);
		
		System.out.printf("Rectangle 1 width: %.0f, length: %.0f, perimeter: %.2f, area: %.2f.%n",
				rect1.getWidth(), rect1.getLength(),
				rect1.calculatePerimeter(), rect1.calculateArea());
		System.out.printf("Rectangle 2 width: %.0f, length: %.0f, perimeter: %.2f, area: %.2f.%n",
				rect2.getWidth(), rect2.getLength(),
				rect2.calculatePerimeter(), rect2.calculateArea());
	}

}
