#include<stdio.h>
int main()
{
  int a=1,b=2,n,i;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d %d",a,b);
  for(i=3;i<=n;i++) {
    int c=a+b;
    a=b;
    b=c;
    printf(" %d",c);
    
  }
    
}