#include<stdio.h>
int main()
{
  int n,arr[128],i,rc=0;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[rc++]=n%2;
    n = n/2;
  }
  for(i=rc-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}