package week3.day2;

public class Button extends WebElement {

	void submit()
	{
		System.out.println("Submit subclass");
	}
	
	   public static void main(String[] args)

	   {
		   Button objectButton = new Button();
		   objectButton.submit();
		   
	   }

}
