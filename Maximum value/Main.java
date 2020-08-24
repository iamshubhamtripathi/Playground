#include<stdio.h>
int main()
{
  int n,max=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++) {
    scanf("%d",&a[i]);
  }
  max=a[0];
  for(int i=0;i<n;i++) {
    if(max<a[i]) {
      max=a[i];
    }
  }
    printf("%d",max);
}