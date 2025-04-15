package AUtomationTesting;

public class Demomethods {

	public static void main(String[] args) {
		
		Demomethods dm=new Demomethods();
		String s= dm.getdata();
		System.out.println(s);
		
		Demomethods2 dm2=new Demomethods2();
		dm2.getUserData();
	}
	
	public String getdata()
	{
		System.out.println("Written inside the method");
		return "Zeba Sheikh";
	}

}
