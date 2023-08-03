import java.util.Scanner;

public class Digits {

	public static boolean isEven (int n){
		if (n % 2 == 0){
                    return ("true") != null ;
		}
		return false;
		
	}
	//precondition: n>0
	public static int numEvens (int n){
		if (n==0){
			return (n);
	}
	else
	{	
			n=n%10;
	return (n=n-1); 
	}

	}
	
	public static int numOdds (int n){
		if (n==1){
			return (n);
		}
		else
		{
			n=n%10;
	return (n);
		}	
	}
	
	public static int numZeros (int n){
		if (n==0){
			return (n=n%10);
		}
		else
		{
			n=n%10;		
	return (n=n-1);
	}
}
	public static int numDigits (int n, int which){
			if (which==2){ //even. it is called if 'which' is odd
				n=n%10;		
				}
			
			return (numEvens (n));
			
	}
		{		
		int which = 1; //odd. it is called if 'which' is odd
		if (which==1){
			int i=0;
			i=i%10;
		}
		int which1 = 0; //zero. it is called if 'which' is zero.
		
		if (which1==0){
			int j=0;
			j=j%10;
			
		}
	}
		
	//if any number is inserted, although the math is wrong, the num digits is revealed to be the same as in the methods
		//numEvens, numOdds, numZeros 
		
		

	public static void main(String[] args ) {
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter a digit: ");
		int n;
		n=scan.nextInt();
		System.out.println ("Is the digit even?  " + isEven (n));
		System.out.println (n + " contains " + numEvens (n) + " evens, "+ numOdds (n) + " odd, " + " and " + numZeros (n)  + " zeros.");
		System.out.println ("numDigits:  " + n + " contains " + numDigits (n, n));
	}

}
