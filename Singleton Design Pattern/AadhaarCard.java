package syed;



class Person
{
	private Person() 
	{
		System.out.println("Adharcard object created");
		
	}
	public static void createPersonObject()
	{
		if(ac==null)
		{
			ac=new Person();
		}
		else
		{
			System.out.println("Cannot create object");
		}
	}
	
}
public class AadhaarCard{

	public static void main(String[] args) {
		
		Person ac = new Person();
		

	}

}
