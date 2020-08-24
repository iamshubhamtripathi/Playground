#include<stdio.h>
int main()
{
  int a=1,n;
  do{
    scanf("%d",&n);
    a=a+n;
  }while(n!=-1);
    printf("%d",a);
}