import java.util.Scanner;
public class Session_4_Assignment_3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen_Details inp = new Citizen_Details();
		
		inp.getparameters();
		inp.calcuateShow();
		

	}

}
class Citizen_Details
{
	final int Age_limt = 18 ;
	
	
	
	
	private String Voter_ID = " " , Last_Name = " " , First_Name = " " ; 
	private int age;
	
	Scanner in = new Scanner(System.in);
	
	public void getparameters()
	{
		System.out.println("Enter the Voter ID");
		Voter_ID = in.nextLine();
		
		System.out.println("Enter the Last Name and First Name");
		Last_Name = in.nextLine();
		First_Name = in.nextLine();
		
		System.out.println("Enter your Age");
		age = in.nextInt();
	}
	
	final void calcuateShow()
	{
		
		System.out.println("Voter ID      : " +Voter_ID);
		System.out.println("Complete_Name : " +Last_Name +" "+First_Name);
		System.out.println("Age of Citizen: " +age );
		if (age >= Age_limt)
		{
			System.out.println("He is Eligible for Vote");
		}
		else 
		{
			System.out.println("He is not Eligible for Vote");
		}
	}
}

/*
 * Output : 
 * 
Enter the Voter ID
Axwey123
Enter the Last Name and First Name
Naresh
R
Enter your Age
21
Voter ID      : Axwey123
Complete_Name : Naresh R
Age of Citizen: 21
He is Eligible for Vote

 *  */
