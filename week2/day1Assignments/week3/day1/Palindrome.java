package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input = 12345 , output=0;
		
		for( int i= 12345;i>0;i=i/2)
		{
			
			int rem= input%10;
			output=output*10+rem;
		}
		if(input==output)
		{
			System.out.println("The Given Number - "+ input+ " is a Palindrome");
		}
		else 
			System.out.println("The Given Number - " +input+ " is not a Palindrome");
		
	}

}
