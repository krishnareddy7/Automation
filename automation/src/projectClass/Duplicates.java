package projectClass;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Duplicates {
	
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
//		repeating(a,size);
//	}
//	
//	  public static void repeating(int a[],int n)
//      {
//          int count;
//          System.out.println(" Repeating element in array");
//
//         for(int i=0;i<n;i++)
//         {
//             count=0;
//             for (int j = 0; j < n; j++)
//             {
//                if(a[i]==a[j] && i!=j)
//                       count++;
//             }
//          if(count==1)
//              System.out.print(a[i]+" ");
//         }
//       }

	 
	 public static void main(String[] args) {
		

		
		int[] a= {10,20,30,50,30,40,50,10,20,30}; 
	  
	  for (int i=1;i<a.length;i++)
	  {
		  for (int j=i+1;j<a.length;j++)
		  {
		  if (a[i]==a[j] &&(i!=j) )
			  System.out.println(a[i]);
		  }
			  
	  }
	  
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
	 
	
