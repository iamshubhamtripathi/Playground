#include<stdio.h>
int main()
{
  int i,n,a=0,handshake;
  scanf("%d",&n);
  for(i=1;i<n;i++) {
    handshake=a+i;
    a=handshake;
  }
  printf("%d",handshake);

}