#include <stdio.h>
int main(void) {
	int n,i=0,j=0;
  scanf("%d",&n);
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      printf("1");
    }
   	printf("\n");
  }
   return 0;
}
