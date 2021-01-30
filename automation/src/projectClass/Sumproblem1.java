package projectClass;

class Sumproblem1
{

    static public void main(String[] args) { 
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
	   add=add+num%100;
	   num=num/100;

   }
    System.out.println(add);
    }
    }