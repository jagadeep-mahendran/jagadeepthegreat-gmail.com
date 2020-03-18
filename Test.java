import java.util.*;
import java.lang.*;
class Test{
	public static void main(String e[]){
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int i,j,k=n;
	 
	     for(j=1;j<=n;j++)
	        {
	          System.out.print(j+" ");
	        }
	        System.out.println();
	  for(i=1;i<n-1;i++){
	      for(j=1;j<n-i;j++){
	      System.out.print("  ");
	      
	      }
	      System.out.print(--k);
	      System.out.println();
	  }
	   for(j=1;j<=n;j++)
	        {
	          System.out.print(j+" ");
	        }
	        
	}
}
      
