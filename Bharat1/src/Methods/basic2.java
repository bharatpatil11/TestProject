package Methods;

public class basic2 {// calling from different class
	
	public static void main(String[] args) {
	
		basic1.Test();// static method calling from different class 
		basic1 x = new basic1();// object creation
		x.Demo();// non static method calling from different class
	}

}
