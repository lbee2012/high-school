#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void max3so() //xong
{
	int a,b,c;
	
	printf("Nhap vao a: ");
	scanf("%d",&a);
	
	printf("Nhap vao b: ");
	scanf("%d",&b);
	
	printf("Nhap vao c: ");
	scanf("%d",&c);
	
	printf("\n3 so ban vua nhap la: %d %d %d\n\n",a,b,c);
	
	if(a>b && a>c) // a lon nhat
	{
		if(b>c) // abc
		printf("Max cua 3 so do la: %d%d%d",a,b,c);
		
		else if(c>b) // acb
		printf("Max cua 3 so do la: %d%d%d",a,c,b);
		
		else // axx
		printf("Max cua 3 so do la: %d%d%d",a,b,c);
	}
	else if(b>a && b>c) // b lon nhat
	{
		if(a>c) // bac
		printf("Max cua 3 so do la: %d%d%d",b,a,c);
		
		else if(c>a) // bca
		printf("Max cua 3 so do la: %d%d%d",b,c,a);
		
		else // bxx
		printf("Max cua 3 so do la: %d%d%d",b,a,c);
	}
	else if(c>a && c>b) // c lon nhat
	{
		if(a>b) // cab
		printf("Max cua 3 so do la: %d%d%d",c,a,b);
		
		else if(b>a) // cba
		printf("Max cua 3 so do la: %d%d%d",c,b,a);
		
		else
		printf("Max cua 3 so do la: %d%d%d",c,a,b);
	}
	else // a=b=c
		printf("Max cua 3 so do la: %d%d%d",a,b,c);
	
}
void lont2() //xong
{
	int a,b,c;
	
	printf("Nhap vao a: ");
	scanf("%d",&a);
	
	printf("Nhap vao b: ");
	scanf("%d",&b);
	
	printf("Nhap vao c: ");
	scanf("%d",&c);

	printf("\n3 so ban vua nhap la: %d %d %d\n\n",a,b,c);
	
	if(b>a && a>c)
	{
		if(b>c)
		printf("So lon thu 2 la: %d",a);
	}
	else if(a>b && b>c)
	{
		if(a>c)
		printf("So lon thu 2 la: %d",b);
	}
		
	else if(a>c && c>b)
	{
		if(a>b)
		printf("So lon thu 2 la: %d",c);
	}
		
	else
		printf("3 so bang nhau, khong co so lon thu 2.");
}
void min1t4() //dài vãi l?n // // // 
{
//	int a,c,d,b; //an cai dau b
//	
//	printf("Nhap vao a: ");
//	scanf("%d",&a);
//	
//	printf("Nhap vao b: ");
//	scanf("%d",&b);
//	
//	printf("Nhap vao c: ");
//	scanf("%d",&c);
//	
//	printf("Nhap vao d: ");
//	scanf("%d",&d);
//	
//	printf("\n4 so ban vua nhap la: %d %d %d %d\n\n",a,b,c,d);
//	
//	if(a<b && a<c && a<d) //a nn a1
//	{
//		if(b<c && b<d) // b2
//		{
//			if(c<d) // c3
//			printf("So min trong 4 so la: %d",a);
//			else if(c=d) // 33
//			printf("So min trong 4 so la: %d",a);
//			else // d3
//			printf("So min trong 4 so la: %d",a);
//		}
//		else if(c<b && c<d) // c2
//		{
//			if(b<d) // b3
//			printf("So min trong 4 so la: %d",a);
//			else if(b=d) // 33
//			printf("So min trong 4 so la: %d",a);
//			else // d3
//			printf("So min trong 4 so la: %d",a);
//		}
//		else if(b<d && c<d) // d2
//		{
//			if(b<c) // b3
//			printf("So min trong 4 so la: %d",a);
//			else if(b=c) // 33
//			printf("So min trong 4 so la: %d",a);
//			else // c3
//			printf("So min trong 4 so la: %d",a);
//		}
//		else
//			printf("So min trong 4 so la: %d",a);
//		
//	}
	
}
void thtt() //xong
{
	float a,b,tong,hieu,tich,thuong;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	tong = a + b;
	hieu = a - b;
	tich = a * b;
	thuong = a / b;
	
	printf("Tong cua %.0f + %.0f = %.0f\n",a,b,tong);
	printf("Hieu cua %.0f - %.0f = %.0f\n",a,b,hieu);
	printf("Tich cua %.0f * %.0f = %.0f\n",a,b,tich);
	printf("Thuong cua %.0f / %.0f = %f\n",a,b,thuong);
}
void tuoi() //xong
{
	int ns,tuoi;
	
	printf("Nhap vao nam sinh cua ban: ");
	scanf("%d",&ns);
	
	tuoi = 2024 - ns;
	
	if(ns<2024)
		printf("Nam nay ban %d tuoi.",tuoi);
	else if(ns==2024)
		printf("Ban 0 co tuoi !?");
	else
		printf("Ban chua duoc sinh ra.");
}
void ngaythang() //xong
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
			{
			printf("Thang 2 nam %d co 29 ngay.",nam);
			break;
			}
			else
			{
			printf("Thang 2 nam %d co 28 ngay.",nam);
			break;
			}
		}
		default:
			printf("Nhap sai thang 1-2-3-4-5-6-7-8-9-10-11-12.");
			break;
	}

}
void ptb1() //xong
{
	float a,b,x;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	if(a==0)
	{
		if(b==0)
		{
			printf("PT vo so nghiem");
		}
		else
		{
			printf("PT vo nghiem");
		}
	}
	else
	{
		x = -b/a;
		printf("PT co nghiem x = %.3f",x);
	}
}
void ptb2() //xong
{
	float a,b,c,delta,x,x1,x2;
	
	printf("Nhap vao a: ");
	scanf("%f",&a);
	
	printf("Nhap vao b: ");
	scanf("%f",&b);
	
	printf("Nhap vao c: ");
	scanf("%f",&c);
	
	if(a==0)
	{
		if(b==0)
		{
			if(c==0)
			printf("PT vo so nghiem");
			
			else
			printf("PT vo nghiem");
		}
		else
		{
			x = -b/a;
			printf("PT co nghiem x = %.3f",x);
		}
	}
	else
	{
		delta = b*b - 4*a*c;
		if(delta<0)
		printf("PT vo nghiem");
		
		else if(delta==0)
		printf("PT co nghiem kep x = %.3f = %.3f = -%.3f/(2*%.3f)",x1,x2,b,a);
		
		else
		{
			x1 = (-b + sqrt(delta))/(2*a);
			x2 = (-b - sqrt(delta))/(2*a);
			printf("PT co 2 nghiem x1 = %.3f, x2 = %.3f",x1,x2);
		}
	}
}
void chanle() //xong
{
	int x;
	
	printf("Nhap vao x: ");
	scanf("%d",&x);

	if(x%2==0)
	printf("%d la so chan.",x);
	
	else
	printf("%d la so le.",x);
}
void dtbhk() //xong
{
	float t,l,h,dtb;
	
	printf("Nhap vao diem toan: ");
	scanf("%f",&t);
	
	printf("Nhap vao diem ly: ");
	scanf("%f",&l);
	
	printf("Nhap vao diem hoa: ");
	scanf("%f",&h);
	
	dtb = (t + l + h) / 3;
	
	printf("\nDiem trung binh cua ban la: %.3f\n\n",dtb);
	
	if(dtb <= 10 && dtb >= 9)
	printf("Hoc sinh xuat sac.");
	
	else if(dtb <= 9 && dtb >= 8)
	printf("Hoc sinh gioi.");
	
	else if(dtb<= 8 && dtb >= 6)
	printf("Hoc sinh kha.");

	else if(dtb <= 6 && dtb >= 5)
	printf("Hoc sinh trung binh.");
	
	else if(dtb <= 5 && dtb >= 0)
	printf("Hoc sinh yeu.");
	
	else
	printf("Hoc sinh ngu.");
}

int main()
{
	int menu;
	
	printf("=== MENU ===\n\n");
	
	printf("1. Tim max cua 3 so bat ki.\n");
	printf("2. Tim so lon thu 2 trong 3 so bat ki.\n");
	printf("3. Tim so min cua 1 so trong 4 so bat ki.\n");
	printf("4. Tinh tong, hieu, tich, thuong cua 2 so bat ki.\n");
	printf("5. Tinh tuoi bang nam sinh.\n");
	printf("6. Kiem tra thang co bao nhieu ngay.\n");
	printf("7. Tinh phuong trinh bac 1.\n");
	printf("8. Tinh phuong trinh bac 2.\n");
	printf("9. Kiem tra so chan hay so le\n");
	printf("10. Tinh diem trung binh, xep loai hoc sinh.\n\n");
	
	printf("0. Thoat MENU\n\n");
	
	printf("Lua chon cua ban la: ");
	scanf("%d",&menu);
	
	switch (menu)
	{
		case 0:
		{
			printf("\nThoat MENU thanh cong.");
			break;
		}
		case 1:
		{
			printf("\nBan da chon ham: Tinh gia tri lon nhat cua 3 so bat ki.\n\n");
			max3so();
			break;
		}
		case 2:
		{
			printf("\nTim ra so lon thu 2 trong 3 so bat ki.\n\n");
			lont2();
			break;
		}
		case 3:
		{
			printf("\nBan da chon ham: Tim so nho nhat cua 1 trong 4 so bat ki.\n\n");
			min1t4();
			break;
		}
		case 4:
		{
			printf("\nBan da chon ham: Tinh tong, hieu, tich, thuong cua 2 so bat ki.\n\n");
			thtt();
			break;
		}
		case 5:
		{
			printf("\nBan da chon ham: Tinh tuoi.\n\n");
			tuoi();
			break;
		}
		case 6:
		{
			printf("\nBan da chon ham: Kiem tra xem thang co bao nhieu ngay.\n\n");
			ngaythang();
			break;
		}
		case 7:
		{
			printf("\nBan da chon ham: Tinh phuong trinh bac nhat.\n\n");
			ptb1();
			break;
		}
		case 8:
		{
			printf("\nBan da chon ham: Tinh phuong trinh bac hai.\n\n");
			ptb2();
			break;
		}
		case 9:
		{
			printf("\nBan da chon ham: Kiem tra so nguyen, chan hay le.\n\n");
			chanle();
			break;
		}
		case 10:
		{
			printf("\nBan da chon ham: Tinh diem trung binh va xep loai hanh kiem.\n\n");
			dtbhk();
			break;
		}
		default:
		{
			printf("Ban chon ngu, xac minh la con nguoi.");
			break;
		}
	}
	return 0;
}
