#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	float a,b,x;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	if(a==0)
	{
		if(b==0)
		{
			printf("PT vo so nghiem");
		}
		else
		{
			printf("PT vo nghiem");
		}
	}
	else
	{
		printf("PT co nghiem %.1 = -%.1f/%.1f",x,b,a);
	}
	return 0;
}
