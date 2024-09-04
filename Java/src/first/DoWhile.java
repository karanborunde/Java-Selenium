package first;

public class DoWhile {

	
	public static void main(String[] args) {
		
		
		int j = 1;
		
		/*do
		{
			// Code to execute   
		}
		while(Condition)
		*/
		
		
		// Difference btwn while aand Do-while loop is just that Do while will execute at-least once even if condition is false
		
		do 
		{
			
			System.out.println("Do-while loop has started");
			j++;
		}
		while(j<=5);
			System.out.println("Out of Do-while loop");
		
	}
}
