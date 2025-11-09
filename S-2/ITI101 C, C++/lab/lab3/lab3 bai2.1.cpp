#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	float a,b;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	if(a==0)
	
	{		
	if(b==0)
	printf("Vo so nghiem");
	
	else
	printf("Vo nghiem");	
	}
	
	else
	printf("x = %.2f",-b/a);
	
	return 0;
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
