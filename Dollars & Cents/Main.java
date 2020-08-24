#include<stdio.h>
int main()
{
  int d1,c1,d2,c2;
  scanf("%d%d%d%d",&d1,&c1,&d2,&c2);
  int dollar,cent;
  dollar=d1+d2;
  cent=c1+c2;
  while(cent>=100) {
    cent=cent-100;
    dollar+=1;
  }
  printf("%d\n",dollar);
  printf("%d",cent);
  
}