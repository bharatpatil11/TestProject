package LogicalProgram;

public class star6 {
public static void main(String[] args) {//pattern 9
		
		int space=4;
		int star='A';
		
	    for (int i =1;i<=5;i++) {
			 
			 for(int j=1;j<=space;j++) {
				 
			     System.out.print(" ") ;
			
			 }
			 for (char k='A';k<=star;k++)
		     System.out.print(k);
			 System.out.println();
		     space--;
		     star++;
		
		     }
			 
       }


}
