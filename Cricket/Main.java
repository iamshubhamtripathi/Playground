#include<stdio.h>
int main()
{
  int total_no_of_balls,total_no_of_runs,run_scored,no_of_bowled;
  scanf("%d%d%d%d",&total_no_of_balls,&total_no_of_runs,&run_scored,&no_of_bowled);
  int no_of_overs;
  float over_finished,curr_runrate,total_runrate;
  int a,b;
  no_of_overs=total_no_of_balls/6;
  printf("%d\n",no_of_overs);
  a=no_of_bowled/6;
  b=no_of_bowled%6;
  over_finished=((float)a+(float)b/10);
  printf("%.1f\n",over_finished);
  curr_runrate=(float)run_scored/over_finished;
  printf("%.1f\n",curr_runrate);
  total_runrate=(float)total_no_of_runs/(float)no_of_overs;
  printf("%.1f\n",total_runrate);
  if(curr_runrate>=total_runrate) {
    printf("Eligible to Win");
  }
  else {
    printf("Not Eligible to Win");
  }
  
}