package demo_java_invoke;

public class StringOpearation {
	
	public static String concat(String a , String b)
	{
		return a+" "+b;
	}
	
	//public String multiconcat(String a , String b , String c,String d)
	//{
//return a+" "+b+" "+" "+c+" "+d;
	///}
	
	public String palindriome(String org)
	{
			String reverse = ""; // Objects of String class  
			//Scanner in = new Scanner(System.in);   
			//System.out.println("Enter a string/number to check if it is a palindrome");  
			//original = in.nextLine();   
			int length = org.length();   
			for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + org.charAt(i);  
			if (org.equals(reverse))  
	         return "Palindrome";  
			else  
	         return "Not palindrome.";
	}
}
