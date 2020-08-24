#include<stdio.h>
int main()
{
  int unit,bill;
  scanf("%d",&unit);
  if(unit<=200) {
    bill=round(0.5*unit);
    printf("Rs.%d",bill);
  }
  else if(unit<=400) {
    bill=round((0.65*unit)+100);
    printf("Rs.%d",bill);
  }
  else if(unit<=600) {
    bill=round((0.80*unit)+200);
    printf("Rs.%d",bill);
  }
  else {
    bill=round((1.25*unit)+425);
    printf("Rs.%d",bill);
  }
}