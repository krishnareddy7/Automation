
public class Stringlenght {
		 
//		 public static void main(String args[]){
		 
//		  String helloWorld="This is hello world";
//		  System.out.println("length of helloWorld string :"+getLengthOfStringWithCharArray(helloWorld));
//		  }
//		 
//		public static int getLengthOfStringWithCharArray(String str)
//		 {
//		  int length=0;
//		  char[] strCharArray=str.toCharArray();
//		  for(char c:strCharArray)
//		  {
//		   length++;
//		  }
//		  return length;
//		 }
//		 
		
		
//     String s="krisshna";
//     
//     public void lengthOfstring()
//     {
//    	 int length=0;
//    	 char[] ch = s.toCharArray();
//    	 
//    	 for(char cc:ch)
//    	 {
//    		 length++;
//    	 }
//    	 System.out.println(length);
//     }
//     
//  public static void main(String[] args) {
//	    
//	  Stringlenght  st= new Stringlenght(); 
//	  st.lengthOfstring();
//}
		public int length()
		{
			int [] i= {10,20,30,40,50};
			int lenth=0;
			
			
			for (int ii:i)
			{
			 	lenth++;
			}
			return lenth;
			
			
		}
	public static void main(String[] args) {
		 Stringlenght  st= new Stringlenght(); 
		 System.out.println( st.length());
		
	}
	
    	
	
	
}
