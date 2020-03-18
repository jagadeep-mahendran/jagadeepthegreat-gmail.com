import java.util.*;
import java.lang.*;
class Test{
	public static void main(String e[]){
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int i,j,k;
	  for(i=0;i<n;i++)
	            {
	                for(j=0;j<=i;j++){
	                 System.out.print("*");
	                    if(j!=i)
	                      System.out.print(" ");
	                 }
	                 for(j=2*(n-i)-1;j>0;j--)
	                   System.out.print("  ");
	                 for(j=0;j<=i;j++)
	                 System.out.print("* ");
	            
	                 System.out.println();
	               
	            }
	            for(i=n-1;i>=0;i--){
	                 for(j=i;j>=0;j--){
	                        System.out.print("*");
	                           if(j!=0)
	                              System.out.print(" ");
	                        }
	                        for(j=0;j<2*(n-i)-1;j++)
	                             System.out.print("  ");
	                             for(j=i;j>=0;j--)
	                        System.out.print("* ");
	                        System.out.println();
	            }
	            System.out.println();
	            for(i=n-1;i>=0;i--){
	                 for(j=i;j>=0;j--){
	                        System.out.print("*");
	                           if(j!=0)
	                              System.out.print(" ");
	                        }
	                        for(j=0;j<2*(n-i)-1;j++)
	                             System.out.print("  ");
	                             for(j=i;j>=0;j--)
	                        System.out.print("* ");
	                        System.out.println();
	            }
	           for(i=0;i<n;i++)
	            {
	                for(j=0;j<=i;j++){
	                 System.out.print("*");
	                    if(j!=i)
	                      System.out.print(" ");
	                 }
	                 for(j=2*(n-i)-1;j>0;j--)
	                   System.out.print("  ");
	                 for(j=0;j<=i;j++)
	                 System.out.print("* ");
	            
	                 System.out.println();
	               
	            }
	             System.out.println();
	            for(i=n-1;i>=0;i--){
	                 for(j=i;j>=0;j--){
	                        System.out.print(" ");
	                           if(j!=0)
	                              System.out.print(" ");
	                        }
	                        for(j=0;j<2*(n-i)-1;j++)
	                             System.out.print("* ");
	                             for(j=i;j>=0;j--)
	                        System.out.print("  ");
	                        System.out.println();
	            }
	           for(i=1;i<n;i++)
	            {
	                for(j=0;j<=i;j++){
	                 System.out.print(" ");
	                    if(j!=i)
	                      System.out.print(" ");
	                 }
	                 for(j=2*(n-i)-1;j>0;j--)
	                   System.out.print("* ");
	                 for(j=0;j<=i;j++)
	                 System.out.print(" ");
	            
	                 System.out.println();
	               
	            }
	}
}
      
