#include<stdio.h>
int main()
{
  int length,litre;
  scanf("%d %d",&length,&litre);
  if(((length*length*length)*1000)>=litre) {
    printf("Can store");
  }
  else {
    printf("Cannot store");
  }
}