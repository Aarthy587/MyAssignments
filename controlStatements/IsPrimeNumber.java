package controlStatements;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13 ;
		
		for ( int i=2; i<n;i++) {
			
			int temp = n%i;
			
			
			if(temp==0)
			{
				System.out.println("Number "+n+" is a non-prime number");
				break;
			}
			else 
				
			{
				System.out.println("Number "+n+" is a prime number");
				break;
		
			}
			
		}
		
		
		
	}

}
