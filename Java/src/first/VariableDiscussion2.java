package first;

public class VariableDiscussion2 {

	public static void main(String[] args) {
		
		System.out.println(VariableDiscussion.a);  // Calling static variable from another class
		VariableDiscussion r = new VariableDiscussion();  //Creating object for non static variable
		System.out.println(r.b); // calling non static variable from another class
		
		
	}	
}
