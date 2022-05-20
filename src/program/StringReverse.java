package program;

public class StringReverse {
	
	public static void main(String[] args) {
		String g="hai";
		
		String str = "Suriya";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	    
	}

}
