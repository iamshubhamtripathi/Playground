#include<stdio.h>
int main()
{
  int num,n,a,arm=0;
  scanf("%d",&n);
  num=n;
  while(n!=0) {
    a=n%10;
    arm=(arm+pow(a,3));
    n/=10;
  }
  if(num==arm) {
    printf("Armstrong Number");
  }
  else {
    printf("Not Armstrong Number");
  }
}