#include<stdio.h>
int main()
{
  int i,j,c=0;
  scanf("%d%d",&i,&j);
  while(i<=j) {
    c+=i;
    i++;
  }
  printf("%d",c);
}