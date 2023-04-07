package Methods;

public class basic1 {// non static method declared in same class and 
	                 //declared in same class
	public void Demo() {//user defined non static method declaration 
		
		System.out.println("demo method is running");
		}
	public static void Test() {// UD static method declaration
		System.out.println("Test method is running");
		
	    }
	 public static void main(String[] args) {//
		 basic1 x = new basic1();
		 x.Demo();// non static method calling same class
		 Test();// static method calling in same class
	}

}
