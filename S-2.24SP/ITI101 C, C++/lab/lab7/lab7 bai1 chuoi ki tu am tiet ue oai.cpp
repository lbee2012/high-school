#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
	char x[100];
	
	printf("Nhap vao chuoi cua ban: ");
	gets(x);
	printf("Chuoi ban vua nhap la: %s\n\n",x);
	
	int i;
	int na=0;
	int pa=0;
	
	for(i=0;i<strlen(x);i++)
	{
		char wtf=tolower(x[i]);
		
		if(isalpha(wtf))
		{
		if(wtf=='u' || wtf=='e' || wtf=='o' || wtf=='a' || wtf=='i')
		na++;
		
		else
		pa++;
		}
	}//for
	
	printf("So nguyen am co trong chuoi '%s' la: %d\n",x,na);
	printf("So phu am co trong chuoi '%s' la: %d",x,pa);
	
	return 0;
}//main
