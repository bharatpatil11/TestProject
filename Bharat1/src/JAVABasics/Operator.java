package JAVABasics;

public class Operator {
	public static void main (String [] args) {
	
		// && operator (And)
		
    System.out.println ((15>7) && (20>5)  ); //true
    
    System.out.println ((15>7) && (20<5)  ); //false
    
    
    // or operator  ||
    
    System.out.println ((15>7) || (20<5)  ); //true
    
    System.out.println ((15<7) || (20<5)  ); //false
    
    // not operator !
    
    System.out.println (! (12==8) ); //true
    System.out.println (! (15>5)  ); //false
	}
 }
