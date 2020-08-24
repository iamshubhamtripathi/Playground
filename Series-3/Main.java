#include <stdio.h>
int main()
{
  int a=6;
  int n,c;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d",a);
  for(int i=1;i<n;i++) {
    c=a+1+2*i;
    printf(" %d",c);
    a=c;
      
    }
  
}