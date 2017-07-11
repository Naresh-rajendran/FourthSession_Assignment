import java.util.Scanner;
public class Session_4_Assignment_2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PenType in = new PenType("Fountain",140.00,12);
		in.getParameters();
		in.getcalculation();
		in.show();
		
	}

}

class Pen
{
	
	private String Pen_Color = " " , Pen_name = " ";
		
	public String getPenName()
	{
		return Pen_name;
	}
	public String getPenColor()
	{
		return Pen_Color;
	}
	public String setPenName(String Pen_name)
	{
		return this.Pen_name = Pen_name;
	}
	public String setPenColor(String Pen_Color)
	{
		return this.Pen_Color = Pen_Color;
	}
	public void show()
	{
		System.out.println(" Name of the Pen : " +getPenName());
		System.out.println("Color of the Pen : " +getPenColor());
	}
   
}

class PenType extends Pen
{
	private String pen_type = " ";
	private double pen_cost = 0 ; 
	private String Pen_Name = " ",Pen_Color = " "; 
	private int quantity;
	private double Total_cost = 0;
	
	PenType(String pen_type , double pen_cost , int quantity)
	{
		this.pen_type = pen_type;
		this.pen_cost = pen_cost;
		this.quantity = quantity;
	}
	Scanner in = new Scanner(System.in);
	
	public String getPenType()
	{
		return pen_type;
	}
	public double getPenCost()
	{
		return pen_cost;
	}
	public int getPenQuantity()
	{
		return quantity;
	}
	
	public void getParameters()
	{
		System.out.println("Enter Name and Color of pen");
		Pen_Name = in.nextLine();
		setPenName(Pen_Name);
		
		Pen_Color = in.nextLine();
		setPenColor(Pen_Color);
	}
	
	public void getcalculation()
	{
		ProductPurchase cal = new ProductPurchase();
		Total_cost = cal.Calucation(getPenQuantity(), getPenCost());
	}
	
	public void show()
	{
		super.show();
		System.out.println(" Type of the Pen : " +getPenType());
		System.out.println(" Cost of per Pen : " +getPenCost());
		System.out.println(" ");
		System.out.println("Quantity of pen purchased   : " +getPenQuantity());
		System.out.println("Total Cost of Purchased Pen : " +Total_cost +" inculding tax 18% GST");
		System.out.println(" ");
	}
	
}

class ProductPurchase
{
	private double Total_cost = 0.0 , cost_product = 0.0 ;  
	private int Quantity = 0  ; 
	
	public double Calucation(int Quantity , double cost_product)
	{
		this.Quantity = Quantity;
		this.cost_product = cost_product ;
		
		Total_cost = this.Quantity * this.cost_product ;
		
		Total_cost = Total_cost + ((Total_cost * 18)/100);
		
		return Total_cost;
	}
	
}

/*
Output: 

Enter Name and Color of pen
Reynolds 
Black
 Name of the Pen : Reynolds 
Color of the Pen : Black
 Type of the Pen : Fountain
 Cost of per Pen : 140.0
 
Quantity of pen purchased   : 12
Total Cost of Purchased Pen : 1982.4 inculding tax 18% GST



*/
