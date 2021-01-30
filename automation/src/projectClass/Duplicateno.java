package projectClass;

import java.util.Scanner;

public class Duplicateno {
	
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
//		int[] a=new int[20];
//		System.out.println("enter size of an array");
//		int size=sc.nextInt();
//		System.out.println("enter elements of an array");
//		for(int i=0;i<size;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		NonRepeating(a,size);
//	}
//	
//	  public static void NonRepeating(int a[],int n)
//      {
//          int count;
//          System.out.println("Non Repeating element in array");
//
//         for(int i=0;i<n;i++)
//         {
//             count=0;
//             for (int j = 0; j < n; j++)
//             {
//                if(a[i]==a[j] && i!=j)
//                       count++;
//             }
//          if(count==0)
//              System.out.print(a[i]+" ");
//         }
//       }


	  public static void main(String[] args) {
		
	int[]  a= {10,20,30,40,50,10,20,30};	  
	
    int[] temp=new int [a.length];
    int j=0;
    for (int i=0;i<a.length-1;i++)
    {
    	if(a[i]!=a[i+1])
    	{
    		temp[j]=a[i];
    		j++;
    	}
    } 
    temp[j]=a[a.length-1];
    
    for (int i=0;i<temp.length;i++)
    {
    	System.out.println(temp[i]+" ");
    }
    
	
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
