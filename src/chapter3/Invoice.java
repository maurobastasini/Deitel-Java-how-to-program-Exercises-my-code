package chapter3;

public class Invoice {
	
	private String number, description;
	private int quantity;
	private double price;
	
	public Invoice(){
		this.number = "000-0000";
		this.description = "";
		this.quantity = 0;
		this.price = 0.0;
	}
	
	public Invoice(String number, String description, int quantity, double price)
	{
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescripcion(String description)
	{
		this.description = description;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		if (quantity > 0)	this.quantity = quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		if (price > 0.0)	this.price = price;
	}
	
	public double getInvoiceAmount(){
		return quantity * price;
	}
	
	public String toString()
	{
		String s = String.format("Invoice Data:%nNumber: %s, Description: %s,"
				+ " Quantity: %d, Price: %f", number, description, quantity, price);
		return s;		
	}

}
