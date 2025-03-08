package classroom4Browser;

public class Browser {
	
	 String launchBrowser(String browserName) 
	
	{
		System.out.println(browserName+ ": Browser launched Successfully");
		return browserName;
		
	}

	
	 void loadUrl()
	{
		System.out.println("Application url loaded Successfully");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser objBrowser = new Browser();
	
		objBrowser.launchBrowser("Chrome");
		objBrowser.loadUrl();
		

	}

}
