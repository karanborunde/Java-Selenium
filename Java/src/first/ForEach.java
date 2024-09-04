package first;

public class ForEach {
	
	
public static void main(String[] args) {
	
	int array[] = {10,45,69,9,6,55};
	
	
	
	for(int num: array)  // For each  is advanced version of For loop in this loop we dont have to mentioned start and end point of Array Loop will by default print all elements of array 
	{
		System.out.println(num);
	}
	
	System.out.println("End of  For Each loop");
	
	
	
	System.out.println("***********Keywords in Loop **********************");
	
	int arrayy[] = {10,45,69,9,6,55,78,999,45,34,51,88};
	
	for(int num1:arrayy)
	{
		
		
		if(num1==999)
		{
		
		//break;  // to Stop execution of loop
			continue; // To skip current condition and jump over next condition
			}
		System.out.println(num1);
			
	}
	System.out.println("Out of the loop");
	
	
	
}




}
