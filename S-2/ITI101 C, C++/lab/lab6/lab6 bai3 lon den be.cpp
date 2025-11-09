#include <stdio.h>

int main()
{
	int n,tg;
	
	printf("Nhap vao n: ");
	scanf("%d",&n);
	
	int a[n],i,j;
	
	for(i=0;i<n;i++)
	{
		printf("Nhap a[%d] = ",i);
		scanf("%d",&a[i]);
	}
	printf("\nMang vua nhap la: ");
	
	for(i=0;i<n;i++)
	printf("\n%d",a[i]);
	
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]<a[j])
			{
				tg=a[i];
				a[i]=a[j];
				a[j]=tg;
			}
		}
	}
	printf("\nMang sau khi sap xep la: ");
	
	for(i=0;i<n;i++)
	printf("\n%d",a[i]);
	
	
	
	return 0;
}
