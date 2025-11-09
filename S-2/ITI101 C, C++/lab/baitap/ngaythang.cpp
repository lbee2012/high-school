#include <stdio.h>

int main()
{
	int nam,thang;
	
	printf("Nhap thang: ");
	scanf("%d",&thang);
	
	switch (thang)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			printf("Thang %d co 31 ngay.",thang);
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			printf("Thang %d co 30 ngay.",thang);
			break;
			
		case 2:
		{		
			printf("Nhap nam: ");
			scanf("%d",&nam);
	
			if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
			printf("Thang 2 nam %d co 29 ngay.",nam);
			else
			printf("Thang 2 nam %d co 28 ngay.",nam);
		}
		default:
			printf("Nhap sai thang 1-2-3-4-5-6-7-8-9-10-11-12.");
			break;
	}

}
