import java.util.Scanner;
import java.lang.*;

public class Session_4_Assignment_4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aliquot_Series obj = new aliquot_Series();
		//aliquot_Series_Extended obj = new aliquot_Series_Extended();
		obj.getData();
		obj.processData();
		
		/*if (obj.processData() > 0 && obj.processData() < 9)
		{
			System.out.println("Number " + +obj.Entered_Number + " is Perfect Number , Aliquot Number"  ); 	
		}*/
		
	}

}
class aliquot_Series
{
	int Entered_Number,Sum=0 ,Number = 0;
	int Number_repeat_count = 0 ; 
	int untouchable_count = 0 ;
	
	Scanner input = new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter the number and limit");
		Number = input.nextInt();
		Entered_Number = Number;  
	}
	
	int processData()
	{
       while (Number > 1)
		{
    	    Sum = 0 ;
			for(int i = 1 ; i <= Number/2 ; i++)
			{
				if(Number % i == 0)
				{
					Sum = Sum + i ;
					System.out.println(" " +Number + " % " + +i +" " +Sum);
				}
			}
			
			if(Sum > 0)
			{
				if(Number == Sum)
				{
					Number_repeat_count++ ;
					System.out.println(" Incremented Number_repeat_count :" +Number_repeat_count);
					if (Number_repeat_count > 3)
					{
						System.out.println("The Number "+ +Entered_Number +"is the perfect number");
						break;
					}					
					Number = Sum ;
				}
				else
				{
					
					System.out.println(" Number_repeat_count :" +(untouchable_count++));
					Number = Sum ; 
					continue ;
				}
			}
		}
		
		return Sum;
		
	}
}
/*
class aliquot_Series_Extended extends aliquot_Series
{
	
	void processData()
	{
		for(int j = 1; j <= Number_limit ; j++ )
		{
			//System.out.println("The number "+j  + ","  +Number);
			super.processData(j);
			
			if(Number >= 2 && Number <= 9)
			{
			   System.out.println("    "+j);
			   System.out.println("The Given number is an aliquot number");
			}
			else 
			{
				//System.out.println("        "+j);
			}
		}	
		
	}
	
}
*/