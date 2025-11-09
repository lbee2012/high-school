#include <stdio.h>
#include <string.h>

int main()
{
	char user[]="Long";
	char password[]="longdaub1";
	
	char tk[100];
	char mk[100];
	printf("Tai khoan: ");

	gets(tk);

	printf("Mat khau: ");
	gets(mk);
	
	if(strcmp(user,tk)==0 && strcmp(password,mk)==0)
	printf("Dang nhap thanh cong!");
	else
	printf("Sai tai khoan hoac mat khau!");
	
	
	
	return 0;
}
