package Statement;

public class NestedIf {
	public static void main(String[] args) {
     
	String UN = "BHARAT";
	String PWD = "B@11";
	
	 if (UN == "BHARAT") {
		 System.out.println("Correct User Name");
	  
          if (PWD == "B@11") {
  		System.out.println("password is correct");        	
  		System.out.println("login successful");
        }
          
          else {
        System.out.println("password is incorrect");        	
        System.out.println("login Failed");
         }
	     
	 }
	 else {
		 System.out.println("password is incorrect");        	
	  		System.out.println("login Failed");
    	 
          }
	}
}
