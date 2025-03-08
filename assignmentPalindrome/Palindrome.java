package assignmentPalindrome;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121 , output = 0;
		
		for (int i = 121 ; i>0;i=i/10)
		{
			int rem=i%10;
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
