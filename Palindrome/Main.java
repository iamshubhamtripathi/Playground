#include<stdio.h>
int main()
{
  int n,r,rev=0,onum;
  scanf("%d",&n);
  onum=n;
  while(n!=0) {
    r=n%10;
    rev=rev*10+r;
    n/=10;
  }
  if(onum == rev) {
    printf("Same");
  }
  else {
    printf("Not Same");
  }
  
}