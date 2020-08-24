#include<stdio.h>
int main()
{
  int n1,n2,count=0,n;
  int a[n1],b[n2];
  scanf("%d%d",&n1,&n2);
  if(n1==n2) {
    n=n1;
  }
  for(int i=0;i<n;i++) {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++) {
    scanf("%d",&b[i]);
  }
  for(int i=0;i<n;i++) {
    if(a[i]==b[i]) {
      count++;
    }
  }
  if(count==n) {
    printf("Same");
  }
  else {
    printf("Not Same");
  }
  
}