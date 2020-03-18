import java.util.*;
import java.lang.*;
class Test{
	public static void main(String e[]){
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int i,j,p=0,m=(n*n);
	for(i=0;i<n;i++)
	    {
	         for(j=0;j<i;j++)
	         System.out.print("--");//1*2*3*10*11*12
	         
	         for(j=0;j<n-i;j++)
	             System.out.print(++p+"*");
	           for(j=0;j<n-i;j++){
	              System.out.print(++m);
	                if(j!=n-i-1)
	                      System.out.print("*");
	              }
	              m=m-2*((n-i)-1)-1;
	             System.out.println();
	    }
                               
                    
	}
}
      
