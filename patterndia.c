#include<stdio.h>
#include<string.h>
void main(){
     char s[100];
     scanf("%s",s);
     int x=strlen(s);
     int i=0,j=0,m=0,k,y=x/2;
     m=x-2;
     for(i=0;i<y;i++)
        {
           for(j=0;j<i;j++)
             printf(" ");
              printf("%c",s[i]);
              for(k=m;k>0;k--)
                 printf(" ");
                 m=m-2;
              printf("%c",s[x-1-i]);
              printf("\n");
        }
        for(j=0;j<y;j++)
             printf(" ");
             printf("%c\n",s[y]);
             m=1;
        for(i=1;i<=y;i++)
          {
              for(j=y;j>i;j--)
                  printf(" ");
                  printf("%c",s[y-i]);
                  for(k=m;k>0;k--)
                 printf(" ");
                 printf("%c",s[y+i]);
                m =m+2;
                 printf("\n");
           }
}
