import java.util.*;
class Test{
	public static void main(String e[]){
		Scanner sc= new Scanner(System.in);
		
		String s=sc.next();
		char a[]=s.toCharArray();
		int a1[]=new int[100];
		int p=0,n=s.length();
		for(int i=0;i<n;i++){
		       if(a[i]=='(')
		             {
		             a1[p]=i;
		             p++;
		             }
		             else if(a[i]==')')
		               {
		                  if(p==0){
		                      a1[p]=i;
		                       p++;
		                      }
		                      else if(a[a1[p-1]]==')')
		                         {
		                          a1[p]=i;
		                          p++;
		                         }
		                    else
		                      p--;
		                   
		               }
		}
		//for(int i=0;i<p;i++)
		  //System.out.print(a1[i]+" ");
		  //System.out.println();
		 for(int i=0;i<n;i++)
		            {
		               for(int j=0;j<p;j++)
		                  {
		                      if(i==a1[j])
		                            a[i]='-';
		                  }
		            }
		            for(int i=0;i<n;i++)
		                {
		                	if(a[i]=='-')
		                	   System.out.print("-1");
		                	   else if(a[i]=='(')
		                	    System.out.print("0");
		                	    else if(a[i]==')')
		                	      System.out.print("1");
		                	      else
		                	        System.out.print(a[i]);
		                }
	}
}
