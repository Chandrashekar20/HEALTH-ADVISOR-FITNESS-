package program2;
class phases implements values           //IMPLEMENTING INTERFACE
{
	public void BMIVALUES(double a,double b,double c,double d)
	{
	System.out.println("        BMI VALUES    ");
    System.out.println("Underweight: less than "+a);
    System.out.println("Normal:      between "+a+" and "+b);
    System.out.println("Overweight:  between "+b+" and "+c);
    System.out.println("Obese:       "+d+" or greater");
	}
}
public class printBmiTable 
{
	
	public void getreference()
	{

	    {
		double underweight= 18.5;
		double normal=24.9;
		double overweight=29.9;
		double obese=30;
		values a= new phases();    //OBJECT CREATED FOR INTERFACE  
		a.BMIVALUES(underweight,normal,overweight,obese);
		instruction in1= new instruction();
		in1.start();
	    }
	}
}
class instruction extends Thread  //CREATING A THREAD
{
	instruction()
	{
	System.out.println("\n********* POINTS TO FOLLOW FOR BETTER HEALTH ********");
	}
	public void run()
	{
		System.out.println(">Get up early");
		instruction2 in2= new instruction2();
		in2.start();
	}
}
class instruction2 extends Thread
{
	public void run()
	{
		System.out.println(">Drink water before anything");
		System.out.println(">Go for a walk");
		System.out.println(">Get into a diet plan");
		System.out.println(">Spend more time in real world than virtual world");
	}
}

 

