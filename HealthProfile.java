package program;
import program2.*;
 class data //SUPER CLASS
{
	 String fName, lName, gender; //USED DIFFRENT DATATYPES
	 int[] dob = new int[3];
	 int measurementSystem; // 1 - imperial, 2 - metric
	 double height, weight; // inches and pounds or meter and kilogram
}

public class HealthProfile extends data //SUBCLASS (SINGLE INHERITANCE)
{
    printBmiTable referencetable= new printBmiTable();
    
    public HealthProfile(String fName, String lName, String gender,int[] dob, double height, double weight, int measurementSystem)
    {
        setFirstName(fName);
        setLastName(lName);
        setGender(gender);
        setDOB(dob);
        setHeight(height);
        setWeight(weight);
        setMeasurementSystem(measurementSystem);
    }
    
    // SETTERS
    public void setFirstName(String fName){
        this.fName = fName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDOB(int[] dob){
        this.dob = dob;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setMeasurementSystem(int measurementSystem){
        this.measurementSystem = measurementSystem;
    }
   
    // GETTERS
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public String getGender(){
        return gender;
    }
    public int[] getDOB(){
        return dob;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - dob[2];
    }
    public void putHeight() {
    	if(measurementSystem==1)
    	{	System.out.println("Inches");
    	}
    	if(measurementSystem==2)
    	{	System.out.println("Meters");
    	}
    }
    public void putweight() {
    	if(measurementSystem==1)
    	{	System.out.println("Pounds");
    	}
    	if(measurementSystem==2)
    	{	System.out.println("Kilograms");
    	}
    }
    // BMI - determine system of measurement
    public double getBMI(){
        return (measurementSystem == 1) ? calculateImperial() : calculateMetric();
    }
    // calculate using imperial measures
    private double calculateImperial(){
        return ((weight * 700) / (height * height));
    }
    // calculate using metric measures
    private double calculateMetric(){
        return weight / (height * height);
    }
    public int getMaxHeartRate(){
        // max heartrate in bpm = 220 - age in years.
        return 220 - getAge();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
    public void health()
    {
    	double index=getBMI();
    	if(index<18.5)
    	{
    	  System.out.println("*****Underweight*******\n>>Get More Fat Rich Foods\n");
    	}
    	if(index>=18.5 && index<24.9)
    	{
    		System.out.println("******Normal*******\n>>Good!!! be on a Good Diet\n");
    	}
    	if(index>=24.9 && index<29.9)
    	{
    		System.out.println("******Overweight*******\n>>Stick on the Strict Diet it will help\n");
    	}
    	if(index>29.9)
    	{
    	  System.out.println("*********Obese*********\n>>Serious note Get into gym,walk,yoga \n"
    	  		+ "or do stuff of your wish get into fat loss Diet \n");
    	}  	
    }
    // print health information
    public void showHealthProfile(){
        System.out.println("\n********** YOUR HEALTH PROFILE **********");
        System.out.printf("Name:\t%s %s\n", fName, lName);
        System.out.printf("DOB:\t%d/%d/%d\nAge:\t%d\n", dob[0], dob[1], dob[2], getAge());
        System.out.printf("Height: "+height+" ");putHeight();
        System.out.printf("Weight: "+weight+" ");putweight();
        System.out.printf("\n***** HEARTRATE *****\n");
        System.out.printf("Max:\t%d\nTarget:\t%s\n", getMaxHeartRate(), getTargetHeartRate());
        System.out.printf("\n***** BMI *****\n");
        System.out.printf("Your BMI: %.1f\n\n", getBMI());
        health();
        referencetable.getreference();
    }
    
}


