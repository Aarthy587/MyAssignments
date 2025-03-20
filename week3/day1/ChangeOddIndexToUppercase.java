package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="changeme";
	     
	      char[] ch = str.toCharArray();      
	      for(int i=0; i<ch.length; i++){
	          while(i%2!=0)
	          {
	    ch[i] = Character.toUpperCase(ch[i]);
	    break;
	          }
	      }
	      System.out.println(new String(ch)); 

	}

}
