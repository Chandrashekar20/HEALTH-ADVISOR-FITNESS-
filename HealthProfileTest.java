package program;
import java.util.*;
class programm
{
	public void student(programm createdstudent)
	{
		createdstudent.Createdstudent();
	}
	 void Createdstudent()
	{
		System.out.println("CHANDRASHEKAR B 4NI19IS025 'A' SECTION \n");
	}
}
public class HealthProfileTest {
		 public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
		        
		        waterconsumption water=new waterconsumption();    //THIS CLASS OBJETS ARE CREATED TO IMPLEMENT METHOD OVERLOADING AND OVERIDING 
		        waterconsumption1 water1 = new waterconsumption1(); //CODE PRESENT IN PAKAGE PROGRAM2
		        waterconsumption2 water2= new waterconsumption2();
		        
		        programm createdstudent= new programm();  
				createdstudent.student(createdstudent);   //OBJECT AS PARAMETER

        try {                                            //EXCEPTION HANDLEING
		        System.out.print("Enter your first name: ");
		        String fName = sc.nextLine();

		        System.out.print("Enter you last name: ");
		        String lName = sc.nextLine();

		        System.out.print("Enter your gender (male/female): ");
		        String gender = sc.nextLine();

		        System.out.print("Enter Date of birth dd mm yyyy: ");
		        int[] dob = new int[3];

		        for(int i=0; i<3; i++){
		            dob[i] = sc.nextInt();
		        }

		        System.out.print("1 for imperial, 2 for metric: ");
		        int choice = sc.nextInt();

		        System.out.printf("Input weight in %s: ",
		                (choice == 1) ? "pounds" : "kilograms");
		        double weight = sc.nextDouble();

		        System.out.printf("Input height in %s: ",
		                (choice == 1) ? "inches(ft * 12 * in)" : "metres");
		        double height = sc.nextDouble();
		        HealthProfile profile = new HealthProfile(fName, lName, gender, dob, height, weight, choice); //PARAMETERIZED CONSTRUCTOR
		        
		        profile.showHealthProfile();
		        water.waterdrink();
		        water1.waterdrink();
		        water2.waterdrink(dob);
		        sc.close();
				 
		        }
        catch(Exception e)   //EXCEPTION HANDLEING
        {
           System.out.println("Error in value Mismatch please enter valid data");        	
        }
    	}

}

