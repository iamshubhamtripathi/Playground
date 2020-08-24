#include<stdio.h>
int main()
{
  int a;
  int first,last;
  scanf("%d",&a);
  first=a/1000;
  last=(((a%1000)%100)%10);
  printf("%d",first+last);
  
}