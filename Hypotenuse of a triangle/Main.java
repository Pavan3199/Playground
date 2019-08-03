#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,d;
  scanf("%f%f",&a,&b);
  d = (a*a)+(b*b);
  c = sqrt(d);
  printf("%.2f",c);
  return 0;
}