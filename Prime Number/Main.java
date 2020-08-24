#include<stdio.h>
int isprime(int,int);
int main()
{
  int n,prime;
  scanf("%d",&n);
  prime=isprime(n,n/2);
  if(prime==1) {
    printf("%d is a prime number",n);
  }
  else {
    printf("%d is not a prime number");
  }
}
int isprime(int n,int i) {
  if(i==1) {
    return 1;
  }
  else {
    if(n%i==0) {
      return 0;
    }
    else {
      isprime(n,i-1);
    }
  }
}