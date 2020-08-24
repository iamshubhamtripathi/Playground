#include<stdio.h>
int main()
{
  int n,a=10,b=5,i;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d %d",a,b);
  for(i=3;i<=n;i++) {
    if(i%2==0) {
      b=b+10;
      printf(" %d",b);
    }
    else {
      a=a+50;
      printf(" %d",a);
    }
  }
         
}