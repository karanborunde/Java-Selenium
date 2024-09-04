package first;

public class MethodDiscussion2 {

public void nonstatic()
{
	int a = 22;
	double d = 32.23232;
	float f = 273.2738f;
	char c = 'd';
	boolean b = true;
	System.out.println(b+" "+"Value of int a = "+a+ "Value of double d = "+ d+"Value of float f = "+f+"Value of char c"+c );
	
}

public static void main(String[] args) {
	MethodDiscussion.method(); // Calling static method from another class
	
	MethodDiscussion m1 = new MethodDiscussion();
	m1.Mul();
	m1.div();   // creating object of another class so that  another class non static method can be called

	
	MethodDiscussion2 m2 = new MethodDiscussion2();
     m2.nonstatic();
    
}
	
}
