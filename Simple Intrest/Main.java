#include<stdio.h>
int main()
{
  int t;
  float p,r;
  float si;
  scanf("%f%d%f",&p,&t,&r);
  si = (p*t*r)/100;
  printf("%.6f",si);
  return 0;
}