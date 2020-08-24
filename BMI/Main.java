#include<stdio.h>
int main()
{
  float weight,height;
  scanf("%f%f",&weight,&height);
  float bmi;
  bmi=(weight/(height*height)*10000);
  if(bmi<18.5) {
    printf("You are underweight. Have an apple daily.");
  }
  else if(bmi>=18.5 && bmi<=25) {
    printf("You are normal. Go walking daily and maintain it.");
  }
  else if (bmi>=25 && bmi<=30) {
    printf("You are overweight. Go to the gym daily");
  }
  else {
    printf("You are obese. Go to doctor");
    
  }
}