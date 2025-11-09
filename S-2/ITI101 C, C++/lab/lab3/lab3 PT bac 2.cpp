#include <stdio.h>
#include <math.h>

int main() 
{
	float a,b,c,delta,x,x1,x2;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	printf("Nhap vao c: ");
	scanf("%f",&c);
	
	if(a==0)
	{
		if(b==0)
		{
			if(c==0)
			printf("PT vo so nghiem");
			
			else
			printf("PT vo nghiem");
		}
		else
		{
			x = -b/a;
			printf("PT co nghiem x = %1.f",x);
		}
	}
	else
	{
		delta = b*b - 4*a*c;
		if(delta<0)
		printf("PT vo nghiem");
		
		else if(delta==0)
		printf("PT co nghiem kep x = %.1f = %.1f = -%.1f/(2*%.1f)",x1,x2,b,a);
		
		else
		{
			x1 = (-b + sqrt(delta))/(2*a);
			x2 = (-b - sqrt(delta))/(2*a);
			printf("PT co 2 nghiem x1 = %.1f, x2 = %.1f",x1,x2);
		}
	}
	return 0;
}
