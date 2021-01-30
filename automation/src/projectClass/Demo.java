package  projectClass;

public class Demo 
{

	public static void main(String[] args) {
		
		String str = "abc123xyz123abc";
		
		String onlyNum = "";
		String onlyChar = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		    {
			char ch = str.charAt(i);
		if(Character.isDigit(ch))
			{
	        	onlyNum = onlyNum + ch;
			}
		else {
			onlyChar = onlyChar + ch;
		}
		
		    }
		System.out.println(onlyChar);
		System.out.println(onlyNum);
	}
}