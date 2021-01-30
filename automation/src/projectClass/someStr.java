package projectClass;

public class someStr {

	private static final String[] K = null;

	public static void main(String[] args) {
		
	/*
	 * String ss="abbaaabbbabbab";
	String s="ab";
	int res=0;
	for (int i = 0; i <=ss.length()-s.length(); i++) 
        { 
            int j;             
            for (j = 0; j < s.length(); j++) { 
                if (ss.charAt(i + j) != s.charAt(j)) { 
                    break; 
                } 
            } 
            if (j == s.length()) {                 
                res++;                 
                j = 0;                 
            }             
        } 
        System.out.println(res);
        
        */
        
		String s="abbbabababbbab";
		String k="";
	 	for(int i=0;i<s.length();i++)
		{  
	 		String[] ch = s.split("ab");
	 		System.out.println(ch.length);
		     for(String cc:ch)
		     {
		    	 cc.length();
		    	 k=k + ch;
		    	// System.out.print(cc.length());
		     }
			}
	 	   System.out.println(k.length());
		}
    } 




	
