#include<stdio.h>
int addnum(int);
int main()
{
  int num;
  scanf("%d",&num);
  printf("%d",addnum(num));
}
int addnum(int n) {
  if(n !=0) {
    return n+addnum(n-1);
  }
  else
    return n;
}