import java.util.*;
import java.lang.*;
class Test{
	public static void main(String e[]){
	Scanner sc= new Scanner(System.in);
	char a=sc.next().charAt(0);
	char r='A';
	int i=0,j=0;
	int n=a-65,p=0;
	// System.out.print(n);
	 for(j=0;j<n;j++)
	          System.out.print(" ");
	          System.out.println(r);
	for(i=n-1;i>=0;i--){
	  
	     for(j=0;j<i;j++)
	          System.out.print(" ");
		System.out.print(++r);
		for(j=0;j<=p;j++)
		    System.out.print(" ");
		    p=p+2;
		     System.out.print(r);
		      System.out.println();
		
	}
	  p=(2*(n-1))-1;
            for(i=n-2;i>=0;i--){
            int x=0;
                 for(j=i;j<n-1;j++)
                   System.out.print(" ");
                   System.out.print(--r);
                   for(j=0;j<p;j++)
                       System.out.print(" ");
                       p=p-2;
                       System.out.print(r);
                       System.out.println();
                   
            }
            for(j=0;j<n;j++)
	          System.out.print(" ");
	          System.out.println(--r);
	}
}
      
