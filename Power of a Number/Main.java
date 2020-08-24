#include<stdio.h>
int power(int,int);
int main()
{
  int n,x;
  scanf("%d %d",&n,&x);
  printf("%d",power(n,x));
}
int power(int n,int i) {
  if(i==0) {
    return 1;
  }
  else {
    return (n*power(n,i-1));
  }
}