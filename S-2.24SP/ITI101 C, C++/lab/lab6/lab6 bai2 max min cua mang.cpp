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
	
	int max=a[0];
	int min=a[0];
	
	for(i=0;i<n;i++)
	{
		if(a[i]>max)
		max=a[i];
	}
	printf("\n\nMax cua mang la: %d",max);
	
	for(i=0;i<n;i++)
	{
		if(a[i]<min)
		min=a[i];
	}
	printf("\nMin cua mang la: %d",min);
	
	return 0;
}
