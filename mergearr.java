import java.util.*;
import java.lang.*;
class Test{
	public static void main(String e[]){
	Scanner sc= new Scanner(System.in);
	int t=sc.nextInt();
	for(int tt=0;tt<t;tt++){
	int n=sc.nextInt();
	int a[]=new int[1000];
	int i=0,j=0,s=0,t1;
	for(i=0;i<n;i++)
	    a[i]=sc.nextInt();
	int m=sc.nextInt();
        for(j=0;j<m;j++)
	    a[i++]=sc.nextInt();
	int c[]=new int[m+n];
	for(i=0;i<n+m;i++)
	     {   
	         int x=a[i];
	         for(j=0;j<s;j++)
	           {
	           if(x==c[j])
	             break;
	           }
	           if(j==i){
	              c[s++]=x;
	           }
	     } 
	     for(i=0;i<s;i++)
	     {
	     for(j=i+1;j<s;j++)
	       {
	           if(c[i]>c[j]){
	                t1=c[i];
	                c[i]=c[j];
	                c[j]=t1;
	           }
	       }
	     }
	     for(i=0;i<s;i++)
	        System.out.print(c[i]+" ");
	}
	  
	System.out.println();
	}
}
      
