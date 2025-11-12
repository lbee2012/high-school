#include <stdio.h>

int main()
{
	int menu;
	do
	{
	printf("\n\n=== MENU ===\n");
	
	printf("Chuc nang 1: Kiem tra so nguyen.\n");
	printf("Chuc nang 2: Tim uoc chung va boi chung cua 2 so.\n");
	printf("Chuc nang 3: Tinh tien dien cho quan Karaoke.\n");
	printf("Chuc nang 4: Tinh tien dien.\n");
	printf("Chuc nang 5: Doi tien.\n");
	printf("Chuc nang 6: Tinh lai suat vay ngan hang.\n");
	printf("Chuc nang 7: Vay tien mua xe.\n");
	printf("Chuc nang 8: Sap xep thong tin sinh vien.\n");
	printf("Chuc nang 9: Game FPOLY-LOTT.\n");
	printf("Chuc nang 10: Tinh toan phan so.\n");
	
	printf("Chuc nang 11: Thoat MENU.\n\n");
	
	printf("Xin moi chon chuc nang: ");
	
	scanf("%d",&menu);
	
	switch (menu)
	{
		case 1:
		{
			printf("\nBan da chon chuc nang 1.\n");
			printf("\nKiem tra so nguyen.\n\n");
			
			break;
		}
		case 2:
		{
			printf("\nBan da chon chuc nang 2.\n");
			printf("\nTim uoc so chung va boi so chung cua 2 so.\n\n");
			
			break;
		}
		case 3:
		{
			printf("\nBan da chon chuc nang 3.\n");
			printf("\nChuong trinh tinh tien dien cho quan Karaoke.\n\n");
			
			break;
		}
		case 4:
		{
			printf("\nBan da chon chuc nang 4.\n");
			printf("\nChuong trinh tinh tien dien.\n\n");
			
			break;
		}
		case 5:
		{
			printf("\nBan da chon chuc nang 5.\n");
			printf("\nChuc nang doi tien.\n\n");
			
			break;
		}
		case 6:
		{
			printf("\nBan da chon chuc nang 6.\n");
			printf("\nChuc nang tinh lai suat ngan hang vay tra gop.\n\n");
			
			break;
		}
		case 7:
		{
			printf("\nBan da chon chuc nang 7.\n");
			printf("\nChuong trinh vay tien mua xe.\n\n");
			
			break;
		}
		case 8:
		{
			printf("\nBan da chon chuc nang 8.\n");
			printf("\nSap xep thong tin cua sinh vien.\n\n");
			
			break;
		}
		case 9:
		{
			printf("\nBan da chon chuc nang 9.\n");
			printf("\nXay dung game FPOLY-LOTT.\n\n");
			
			break;
		}
		case 10:
		{
			printf("\nBan da chon chuc nang 10.\n");
			printf("\nChuong trinh tinh toan phan so.\n\n");
			
			break;
		}
		case 11:
		{
			printf("\nThoat MENU thanh cong.");
			break;
		}
		default:
		{
			printf("\nBan chon sai cac phim chuc nang.");
			break;
		}
	} //sw
	} //do
	while (menu!=11);
	return 0;
} //main
