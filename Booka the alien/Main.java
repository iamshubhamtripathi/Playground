#include<stdio.h>
int main()
{
  int inputdays,year,month,days,week;
  scanf("%d",&inputdays);
  year=inputdays/365;
  inputdays=inputdays-(year*365);
  month=inputdays/30;
  inputdays=inputdays-(30*month);
  week=inputdays/7;
  inputdays=inputdays-(week*7);
  days=inputdays;
  printf("%d\n",year);
  printf("%d\n",week);
  printf("%d\n",days);
  

}