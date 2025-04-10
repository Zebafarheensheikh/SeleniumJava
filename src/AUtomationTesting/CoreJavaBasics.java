package AUtomationTesting;

public class CoreJavaBasics {

	public static void main(String[] args) {
		
		int var_1 = 5;
		String website="dgfgsdhbdsjdcndsj";
		char letter = 'g';
		double dec = 5.99;
		boolean Female=true;
		
		//System.out.println("Gender is female =" + Female);
		
		//Array
		int[] arr = new int[5];
		arr[0]=8;
		arr[1]=10;
		arr[2]=67;
		arr[3]=54;
		arr[4]=17;
		//or
		int[] arr_1 = {4,45,5,9,1};
		System.out.println(arr[4]);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr_1[i]);
		}
		for(int j=0;j<5;j++)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Values in position of an array=" + arr[i]);
				
			}
		}
		
		String Arr[]= {"abc","def","ghi","jkl","mno"};
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}

}
