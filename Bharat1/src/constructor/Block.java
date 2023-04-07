package constructor;

public class Block {
	
	// non static block
	
	{
		System.out.println("non static block is running");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method running");
		Block x= new Block();
	}
	
	 static {
		 System.out.println("static block is running");
	 }

}
