#include<stdio.h>
int main()
{
  int n,even=0,odd=0,esum=0,osum=0;
  float evenavg,oddavg;
  scanf("%d",&n);
  while(n!=-1) {
    if(n%2==0) {
      esum=esum+n;
      even++;
    }
    else {
      osum=osum+n;
      odd++;
    }
    scanf("%d",&n);
    
  }
  printf("%d\n",esum);
  printf("%d\n",osum);
  evenavg=(float)esum/(float)even;
  printf("%.2f\n",evenavg);
  oddavg=(float)osum/(float)odd;
  printf("%.2f",oddavg);
    
}