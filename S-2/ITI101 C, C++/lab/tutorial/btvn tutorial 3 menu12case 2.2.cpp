#include <stdio.h>
void mot()
{
	int x;
	
	printf("Nhap vao x: ");
	scanf("%d",&x);
	
	if(x>0)
	printf("%d la so nguyen duong.",x);
//	else if(x=0)
//	printf("%d la so 0, khong nguyen duong cung khong nguyen am.",x);
//	else
//	printf("%d la so nguyen am, khong phai nguyen duong.",x);
	else
	printf("%d khong phai so nguyen duong.",x);
}
void hai()
{
	int x;
	
	printf("Nhap vao x: ");
	scanf("%d",&x);
	
	if(x%2==0)
	printf("%d la so chan.",x);
	else
	printf("%d la so le.",x);
}
void ba()
{
	int thang;
	
	printf("Nhap vao thang(so): ");
	scanf("%d",&thang);
	
	switch(thang)
	{
		case 1:
		case 2:
		case 3:
			printf("Thang %d thuoc quy 1.");
			break;
		
		case 4:
		case 5:
		case 6:
			printf("Thang %d thuoc quy 2.");
			break;
		
		case 7:
		case 8:
		case 9:
			printf("Thang %d thuoc quy 3.");
			break;
		
		case 10:
		case 11:
		case 12:
			printf("Thang %d thuoc quy 4.");
			break;
	}//sw
}
void bon()
{
	int a,b,c;
	
	printf("Nhap vao so thu nhat: ");
	scanf("%d",&a);
	
	printf("Nhap vao so thu hai: ");
	scanf("%d",&b);
	
	printf("Nhap vao so thu ba: ");
	scanf("%d",&c);
	
	int max=a;
	
	if(b>max)
	max=b;
	if(c>max)
	max=c;
	
	printf("\nSo lon nhat trong 3 so la: %d",max);
}
void nam()
{
	int a,b,c;
	
	printf("Nhap vao so thu nhat: ");
	scanf("%d",&a);
	
	printf("Nhap vao so thu hai: ");
	scanf("%d",&b);
	
	printf("Nhap vao so thu ba: ");
	scanf("%d",&c);
	
	int min=a;
	
	if(b<min)
	min=b;
	if(c<min)
	min=c;
	
	printf("\nSo nho nhat trong 3 so la: %d",min);
}
void sau()
{
	float a,b;
	
	printf("Nhap vao so thu nhat: ");
	scanf("%f",&a);
	
	printf("Nhap vao so thu hai: ");
	scanf("%f",&b);
	
	float tong=a+b;
	float hieu=a-b;
	float tich=a*b;
	float thuong=a/b;
	
	printf("\nTong cua %.1f + %.1f = %.2f",a,b,tong);
	printf("\nHieu cua %.1f - %.1f = %.2f",a,b,hieu);
	printf("\nTich cua %.1f * %.1f = %.2f",a,b,tich);
	printf("\nThuong cua %.1f / %.1f = %.2f",a,b,thuong);
}
void bay()
{
	int namsinh,tuoi;
	
	printf("Nhap vao nam sinh: ");
	scanf("%d",&namsinh);
	
	tuoi=2024-namsinh;
	
	printf("Ban %d tuoi.",tuoi);
}
void tam()
{
	float toan,ly,hoa;
	
	printf("Nhap diem toan: ");
	scanf("%f",&toan);
	
	printf("Nhap diem ly: ");
	scanf("%f",&ly);
	
	printf("Nhap diem hoa: ");
	scanf("%f",&hoa);
	
	float dtb=(toan+ly+hoa)/3;
	
	printf("\nDiem trung binh cua ban la: %.2f.",dtb);
	if(dtb<=10 && dtb>=9)
	printf("\nHoc sinh xuat sac.");
	else if(dtb<9 && dtb>=8)
	printf("\nHoc sinh gioi.");
	else if(dtb<9 && dtb>=6)
	printf("\nHoc sinh kha.");
	else if(dtb<6 && dtb>=5)
	printf("\nHoc sinh trung binh.");
	else if(dtb<5 && dtb>=0)
	printf("\nHoc sinh yeu.");
	else
	printf("Ban xfm lul vi en.");
}
void chin()
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
			printf("Nhap sai thang.");
			break;
	}
}
void muoi()
{
	int x;
	
	printf("Nhap vao x: ");
	scanf("%d",&x);
	
	if(x%3==0 && x%5==0)
	printf("%d co chia het cho ca 3 va 5.");
	else
	printf("%d khong chia het cho ca 3 vs 5.");
}
int motmot(int nam)
{
	if((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
	printf("Nam %d la nam nhuan.",nam);
	else
	printf("Nam %d khong phai nam nhuan.",nam);
}
void mothai()
{
	int a,b,c;
	
	printf("Tam giac co 3 canh a,b,c.\n\n");
	
	printf("Nhap vao canh a: ");
	scanf("%d",&a);
	
	printf("Nhap vao canh b: ");
	scanf("%d",&b);
	
	printf("Nhap vao canh c: ");
	scanf("%d",&c);
	
	if(a+b>c && b+c>a && c+a>b)
	printf("\n3 canh abc co the hop thanh mot tam giac.");
	else
	printf("\n3 canh abc khong the hop thanh mot tam giac.");
}

int main()
{
	int menu;
	
	printf("MENU\n\n");
	
	printf("1. So nguyen duong hay k.\n");
	printf("2. So chan hay so le.\n");
	printf("3. Thang thuoc quy nao.\n");
	printf("4. Tim max trong 3 so.\n");
	printf("5. Tim min trong 3 so.\n");
	printf("6. Tinh tong hieu tich thuong cua 2 so.\n");
	printf("7. Tinh tuoi bang nam sinh.\n");
	printf("8. Tinh diem trung binh.\n");
	printf("9. Thang co bao nhieu ngay.\n");
	printf("10. So co chia het 3 va 5 k.\n");
	printf("11. Nam nhuan hay nam khong nhuan.\n");
	printf("12. 3 so co hop thanh tam giac k.\n");
	
	printf("\n0. Thoat MENU.");
	
	do
	{
		printf("\n\nNhap vao phim chuc nang: ");
		scanf("%d",&menu);
		
		switch(menu)
		{
			case 1:
			{
				printf("\nNhap vao mot so. Kiem tra so do co nguyen duong hay la khong.\n\n");
				mot();
				break;
			}
			case 2:
			{
				printf("\nNhap vao mot so. Kiem tra so do la so chan hay so le.\n\n");
				hai();
				break;
			}
			case 3:
			{
				printf("\nNhap vao mot thang. Thang do thuoc quy nao trong nam.\n\n");
				ba();
				break;
			}
			case 4:
			{
				printf("\nTim so lon nhat trong 3 so nhap vao.\n\n");
				bon();
				break;
			}
			case 5:
			{
				printf("\nTim so nho nhat trong 3 so nhap vao.\n\n");
				nam();
				break;
			}
			case 6:
			{
				printf("\nTinh tong hieu tich thuong cua 2 so nhap vao.\n\n");
				sau();
				break;
			}
			case 7:
			{
				printf("\nNhap vao nam sinh. Tinh ra tuoi hien tai cua ban.\n\n");
				bay();
				break;
			}
			case 8:
			{
				printf("\nNhap vao diem toan, ly, hoa. Tinh diem trung binh 3 mon cua ban.\n\n");
				tam();
				break;
			}
			case 9:
			{
				printf("\nNhap vao nam, thang. Thang do co bao nhieu ngay.\n\n");
				chin();
				break;
			}
			case 10:
			{
				printf("\nNhap vao mot so. Kiem tra so do co chia het cho 3 va 5 khong.\n\n");
				muoi();
				break;
			}
			case 11:
			{
				printf("\nNhap vao nam. Tinh xem nam nhuan hay nam khong nhuan.\n\n");
				int nam;
				printf("Nhap nam: ");
				scanf("%d",&nam);
				int kq=motmot(nam);
				break;
			}
			case 12:
			{
				printf("\n3 so nguyen nhap vao co tao thanh mot tam giac khong.\n\n");
				mothai();
				break;
			}
			default:
			{
				printf("\nBan chon ngu!.");
				break;
			}
		}//sw
	}//do
	while(menu!=0);
	return 0;
}//main
