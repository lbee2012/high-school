#include <stdio.h>

int main()
{
	int n;
	
	printf("Nhap vao n: ");
	scanf("%d",&n);
	
	int a[n],i;
	
	for(i=0;i<n;i++)
	{
		printf("Nhap a[%d] = ",i);
		scanf("%d",&a[i]);
	}
	printf("\nMang vua nhap la: ");
	
	for(i=0;i<n;i++)
	printf("\n%d",a[i]);
	
	float tong=0;
	float tbc;
	float biendem=0;
	
	for(i=0;i<n;i++)
	if(a[i]%3==0)
	{
	tong=tong+a[i];
	biendem++;
	}
	tbc=tong/biendem;
	printf("\n\nTBC = %.0f/%.0f = %.0f",tong,biendem,tbc);
	
	
	
	
	
	return 0;
}
