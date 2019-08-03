#include<stdio.h>
int main()
{
	int a,i;
    scanf("%d",&a);
    if(a%2==0)
    {
      i = ((a/2)-1);
      printf("%d",i);
    }
  else
  {
    i = (a-1);
    printf("%d",i);
  }
	
}