#include<stdio.h>
int main()
{
  int n,i,a=0;
  scanf("%d",&n);
  printf("Enter n value");
  for(i=1;i<=n;i++) {
    if(i%2==0) {
      a=pow(i,2);
      printf(" %d ",a);
    }
    else {
      a=pow(i,3);
      printf("%d",a);
    }
  }
}