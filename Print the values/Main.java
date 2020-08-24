#include<stdio.h>
int main()
{
  int a[20],n;
  scanf("%d",&n);
  for(int i=0;i<n;i++) {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++) {
    printf("%d\n",a[i]);
  }
}