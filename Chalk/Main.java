#include<stdio.h>
int main()
{
  int n,days;
  float chalk_reduce,chalk;
  scanf("%d",&n);
  chalk_reduce=1/sqrt(n);
  chalk=1-chalk_reduce;
  days=n/chalk;
  printf("%d",days);
  
}