package first;


public class MethodDiscussion {

	
	public static void method()
	{
		int a = 12;
		int b= 19;
	    int c = 29;
		System.out.println(a);
		System.out.println(b+c);
	}
	
	public void Mul()
	{
		
		int d = 90;
		int e = 78;
		int h = d*e;
		System.out.println(h);
	}
	
	public int div()
	{
		
		int j = 10;
		int k = 2;
		System.out.println(j/k);
		return(2);
			
	}
	
	public static void main(String[] args) {
		
		
		method();  // Calling static method in same class 
		
		MethodDiscussion m = new MethodDiscussion(); // Creation of object
		m.Mul();
		m.div();
	}
	}
