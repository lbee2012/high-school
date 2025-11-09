#include <stdio.h>
#include <string.h>

void nhap(char b[][20])
{
	int i;
	
	for(i=0;i<5;i++)
	{
		printf("Nhap chuoi %d: ",i);
		gets(b[i]);
	}
}

void in(char b[][20])
{
	int i;
	
	for(i=0;i<5;i++)
	
	printf("\n%s",b[i]);
}

void sapxep(char b[][20])
{
	int i,j;
	
	for(i=0;i<4;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(strcmp(b[i],b[j])>0)
			{
				char tg[20];
				strcpy(tg,b[i]);
				strcpy(b[i],b[j]);
				strcpy(b[j],tg);
			}
		}
	}
}

int main()
{
	char a[5][20];
	
	nhap(a);
	in(a);
	printf("\n\nChuoi sau khi sap xep: \n");
	sapxep(a);
	in(a);
	
	
	
	return 0;
}
