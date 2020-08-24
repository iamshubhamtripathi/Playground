#include <stdio.h>
int main()
{
int a=7,b=5,i,n;
scanf("%d",&n);
printf("%d %d",a,b);
for(i=3;i<=n;i++)
{
if((i%2)==1)
{
a=a+1;
printf(" %d",a);
}
else
{
b=b+1;
printf(" %d",b);
}
}
}