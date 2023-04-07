package Methods;

public class argument2 {
	public void  multiplication(int a,int b){//non static with argument
	int c = a*b;
	System.out.println("multiplication= "+c); 
	}
	public static void main(String[] args) {
		argument2 x=new argument2();
		x.multiplication(10, 25);
		x.multiplication(23, 10);
		
	}
}
