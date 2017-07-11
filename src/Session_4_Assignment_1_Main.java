import java.util.Scanner;

public class Session_4_Assignment_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub_Methodoveriding a = new Sub_Methodoveriding();
		a.getInput();
		a.Total_purchase_rate();
		a.getproductTax();
		a.Total_purchase_rate(a.getproductTax());
		a.Show();
		
		

	}

}

class Base_Methodoverriding
{
	private int Quantity;
	private double Product_Price , Total_cost;
	private String Name ; 
	protected double Tax , Purchase_cost;
	
	Scanner input = new Scanner(System.in);
	
	public void getInput()
	{
		System.out.println("Enter the Product Name");
		Name = input.nextLine();
		
		System.out.println("Enter the Quantity and Product Price");
		Quantity = input.nextInt();
		Product_Price = input.nextDouble();
	}
	
	
	String getProductName ()
	{
		return Name;
	}
	public double getProduct_price()
	{
		return Product_Price;
	}
	public int getquantity()
	{
		return Quantity;
	}
	
	double getproductTax()
	{
		return Tax = (Purchase_cost * (15/100)); 
	}
	double getTotalcost()
	{
		return Total_cost; 
	}
	void Total_purchase_rate()
	{
		Purchase_cost = (Product_Price * Quantity); 
	}
	
	void Total_purchase_rate(Double Tax)
	{
		Total_cost = Purchase_cost + Tax;
		
	}
	
	
}

class Sub_Methodoveriding extends Base_Methodoverriding
{
	double getproductTax()
	{
		//System.out.println(+Purchase_cost);
		Tax = ((Purchase_cost * 18)/100); 
		//System.out.println(+Tax);
		return Tax;
		
	}
	
	void Show()
	{
		System.out.println("               Product Name : " +getProductName());
		System.out.println("Product Price for per piece : " +getProduct_price());
		System.out.println("    Quantity Of the Product : " +getquantity());
		System.out.println("  Total Tax for "+getquantity()+     " Product : " +getproductTax());
		System.out.println("                 Total Cost : " +getTotalcost());
	}
	
}

/*
Enter the Product Name
Colgate 
Enter the Quantity and Product Price
20
10
               Product Name : Colgate 
Product Price for per piece : 10.0
    Quantity Of the Product : 20
  Total Tax for 20 Product  : 36.0
                 Total Cost : 236.0

*/