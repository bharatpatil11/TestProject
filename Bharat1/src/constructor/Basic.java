package constructor;

public class Basic {

	int a ;
	int b ;
	int m ;
	Basic(){
		a=45;
		b=65;
		
	}
Basic(int c, int d){
	a=c;
	b=d;

}
Basic(int c,int d, int i){
	
	a=c;
	b=d;
	m=i;
}
 public void addition() {
	 System.out.println(a+b+m);
 }
 public static void main(String[] args) {
	Basic x=new Basic();
	x.addition();
	
	Basic y= new Basic(45,78);
	y.addition();
	
	Basic z = new Basic(46,87,45);
	z.addition();
	
}
}

