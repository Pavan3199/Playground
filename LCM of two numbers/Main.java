#include<stdio.h>
int main()
{
  int n1,n2,small,i,lcm,gcd;
  scanf("%d%d",&n1,&n2);
  if(n1>n2)
  {
    small = n2;
  }
  else
  {
    small = n1;
  }
  for(i=small;i>0;i--)
  {
    if(n1%i==0 && n2%i==0)
    {
      gcd = i;
      break;
    }
  }
  lcm = (n1*n2)/gcd;
  printf("%d",lcm);
  return 0;
}