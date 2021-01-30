
package projectClass;

public class Sumproblems {
	
	public static void main(String[] args) {
		
		 String s="abc12ab21hi79by";
		    String sum="";
		    for (int i=0;i<s.length();i++)
		    {
			if( Character.isDigit(s.charAt(i)))
		     sum=sum +Character.getNumericValue(s.charAt(i));
		    		
		    }
		    
		    System.out.println(sum);
		   int num = Integer.parseInt(sum);
		   System.out.println(num);
		   int add =0;
		  
		   while (num>0)
		   {
			   add=add+num%10;
			   num=num/10;

		   }
		    System.out.println(add);
		
		

		
		
		
//	    String s="abc12ab21hi79by";
//	 String num="";
//	 int k=0;
//       for(int i=0;i<s.length();i++)
//       {
//	
//    	   char ch = s.charAt(i);
//    	   
//		if(Character.isDigit(s.charAt(i)))
//		k=k+Character.getNumericValue(ch);
//			
//    	 }
//       System.out.println(k);
	}	    
}
