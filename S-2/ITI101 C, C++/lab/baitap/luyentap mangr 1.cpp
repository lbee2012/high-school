#include <stdio.h>

int main()
{
	int n;
	
	printf("Nhap vao n: ");
	scanf("%d",&n);
	
	int a[n],i;
	
	for(i=0;i<n;i++)
	{
		printf("Nhap a[%d]= ",i);
		scanf("%d",&a[i]);
	}
	printf("Mang vua nhap la: ");
	
	for(i=0;i<n;i++)
	printf("\n%d",a[i]);
	
	return 0;
}
