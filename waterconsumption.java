package program;
class waterconsumption //SUPER CLASS
{
	protected int age;    
	
	public void waterdrink()//OVERRIDING
	{
		System.out.println("\n****** Water Consumption ********");
	}
}
	
class waterconsumption1 extends waterconsumption //SUBCLASS1 SINGLE INHERITANCE
{
	 public void waterdrink() //OVERRIDING
	 {
		 System.out.println("It is Mandatory to be properly Hydrated for Good Health ");
	 }
}
 class waterconsumption2 extends waterconsumption //SUBCLASS2 HIERARCHICAL INHERITANCE
{
	  
	  public void waterdrink(int[] dob) //OVERLOADING
	  {
		  super.age = getAge(dob);   //SUPER KEYWORD
		  
		  if(age<=8)
		  {
			  System.out.println("Drink 1.15 liters of Water Everyday for your Age\n");
		  }
		
		  if(age>8 && age<=13)
		  {
			  System.out.println("Drink 1.8 liters of Water Everyday for your Age\n"); 
		  }
		  if(age>13 && age<=18)
		  {
			  System.out.println("Drink 2.5 liters of Water Everyday for your Age\n"); 
		  }
		  if(age>18)
		  {
			  System.out.println("Drink 3 liters of Water Everyday for your Age\n"); 
		  }	  
     
	  }
	  public int getAge(int[] dob){
		    int[] dateofbirth = dob;
	        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - dateofbirth[2];
	    }
}
