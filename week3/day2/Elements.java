package week3.day2;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elements object= new Elements();
		object.click();
		object.setText("Testing");
		object.submit();
		
		RadioButton objectOne = new RadioButton();
		objectOne.selectRadioButton();
		
		TextField objectTwo = new TextField();
		objectTwo.getText();
		
		CheckBoxButton objectCButton = new CheckBoxButton();
		objectCButton.clickCheckButton();
		

	}

}
