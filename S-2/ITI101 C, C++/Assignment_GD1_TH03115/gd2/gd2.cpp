#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>


int mot(int x) //so nguyen, ngto, chinh phg
{
	int i;	
	int biendem = 0;
	
	if(x>=0)//ng
		printf("\nX la so nguyen.\n");
	else
		printf("\nX kphai so nguyen.\n");
	
	for(i=2;i<x;i++)//ngto
	
	if(x%i==0)
		biendem++;
		
	if(biendem==0)
		printf("X la so nguyen to.\n");
	else
		printf("X kphai so nguyen to.\n");
		
	for(i=1;i<x;i++)//cphg
	
	if(i*i==x)
		biendem++;
		
	if(biendem==0)
		printf("X kphai so chinh phuong.\n");
	else
		printf("X la so chinh phuong.\n");
}



int ucln(int x, int y) //uoc chung
{
	int tg; //trung gian
	
	while (y != 0)
	{
	tg = y;
	y = x % y;
	x = tg;
	}
	return x;
}
int bcnn(int x, int y)//boi chung
{
	return (x * y) / ucln(x,y);
}



int ba(int bdau,int kthuc) //tien hat karaoke
{
	int gio;
	float ttoan;
	
	if(bdau<12 || kthuc>23 || bdau>kthuc)
	{
	printf("So gio khong hop le.\n");
	}
	
	gio=kthuc-bdau;
	
	if(gio<3)
	ttoan=gio*150000;

	else
	ttoan=450000+(gio-3)*105000;
	
	if(bdau>=14 && bdau<=17)
	{
		ttoan=ttoan*90/100;
	}
	printf("\nSo tien can thanh toan khi hat %d gio la: %.0f VND.\n",gio,ttoan);
}



int bon(int x) //tien dien
{
	float a,b,c,d,e,y;
	
	const float money1 = 1678;
	const float money2 = 1734;
	const float money3 = 2014;
	const float money4 = 2536;
	const float money5 = 2834;
	const float money6 = 2927;
	
	const float min = 0;
	const float max1 = 50;
	const float max2 = 100;
	const float max3 = 200;
	const float max4 = 300;
	const float max5 = 400;
	
	a = 83900; //max1 x money1 ... 50 x 1678
	b = 86700; //max2-max1  x money2 ... 50 x 1734
	c = 201400; //max3-2  x money3 ... 100 x 2014
	d = 253600; //max4-3  x money4 ... 100 x 2536
	e = 292700; //max5-4  x money5 ... 100 x 2834
	// khong co max6 vi tu 400sd tro di la tinh gia chung ... 2927 x 1
	
	if(x>=0 && x<=50)
		y = money1*x;
	else if(x>=51 && x<=100)
		y = a+((x-max1)*money2);
	else if(x>=101 && x<=200)
		y = a+b+((x-max2)*money3);
	else if(x>=201 && x<=300)
		y = a+b+c+((x-max3)*money4);
	else if(x>=301 && x<=400)
		y = a+b+c+d+((x-max4)*money5);
	else
	{
		y = a+b+c+d+e+((x-max5)*money6);
	}
	printf("\nSo tien dien la: %f.\n",y);
}



void nam(int x) //doi tien
{
    int menhgia[]={500, 200, 100, 50, 20, 10, 5, 2, 1};
    int to[sizeof(menhgia)/sizeof(int)]={0};

    for (int i=0;i<sizeof(menhgia)/sizeof(int);i++)
	{
        to[i]=x/menhgia[i];
        x%=menhgia[i];
    }

    printf("Cac menh gia tien duoc doi ra.\n");
    for (int i=0;i<sizeof(menhgia)/sizeof(int);i++)
    if (to[i] != 0)
    printf("Menh gia %d: %d to.",menhgia[i],to[i]);
}



int sau(float vay) //lai suot ngan hang
{
	float laisuat = 5.0/100;
	int kyhan = 12;
	
	float lai = (vay * laisuat * pow(1 + laisuat,kyhan) ) / (pow(1 + laisuat,kyhan)-1);
	
	printf("\nSo tien can tra hang thang la: %.3f VND.\n",lai);
}



//int bay(int ptrvay) //vay tien mua xe
//{
//	float laisuat = 7.2;
//    float timevay = 24;
//    float tongtienvay = 500.0;
//    float tratruoc,tragop;
//    
//    if (ptrvay <= 0 || ptrvay >= 100) 
//	{
//        printf("Nhap sai so phan tram.\n");
//        return 1;
//    }
//	float tratruoc = tongtienvay * (100 - ptrvay) / 100;
//    float sotienvay = tongtienvay - tratruoc;
//    float tinhtientra = (laisuat,timevay,tongtienvay*ptrvay/100,&tratruoc,&tragop);
//
//    printf("So tien phai tra lan dau: %.2f trieu VND\n", tratruoc);
//    printf("So tien phai tra hang thang: %.2f trieu VND\n", tragop);
//}



struct sinhvien
{
	char ten[50];
	char hocluc[50];
	float diem;
};

void tam()
{ 
	int n,i,j;
	printf("Nhap so sinh vien: ");
	scanf("%d",&n);
	getchar();
	
	struct sinhvien a1[n];
	
	for(i=0;i<n;i++){
		printf("\nNhap ho va ten: ");
		fgets(a1[i].ten,50,stdin);
		
		printf("Diem: ");
		scanf("%f",&a1[i].diem);
		
		getchar();
	}
	
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a1[i].diem>a1[j].diem)
			{
				struct sinhvien tg;
				tg=a1[i];
				a1[i]=a1[j];
				a1[j]=tg;
				
			}
		}
	}
	
	for(i=0;i<n;i++){
		if(a1[i].diem >= 9){
        strcpy(a1[i].hocluc,"Hoc luc xuat sac");
		}
        
        else if(a1[i].diem >= 8){
        strcpy(a1[i].hocluc,"Hoc luc gioi");
		}
        
        else if(a1[i].diem >= 6.5){
        strcpy(a1[i].hocluc,"Hoc lua kha");
		}
        
        else if(a1[i].diem >= 5){
        strcpy(a1[i].hocluc,"Hoc luc TB");
		}
        
        else {
        strcpy(a1[i].hocluc,"Hoc luc yeu");
		}       
    }
    printf("\nChuoi sau khi duoc sap xep: \n\n");
    for(i=0;i<n;i++){
    	printf("%s%.1f Diem\n%s\n\n",a1[i].ten,a1[i].diem,a1[i].hocluc);
	}
} 



void chin() //game fpl lott
{
	
}
void muoi() //phan so
{
	
}

int main()
{
	int menu;
	
	printf("\n\n=== MENU ===\n");
	
	printf("Chuc nang 1: Kiem tra so nguyen.\n");
	printf("Chuc nang 2: Tim uoc chung va boi chung cua 2 so.\n");
	printf("Chuc nang 3: Tinh tien hat Karaoke.\n");
	printf("Chuc nang 4: Tinh tien dien.\n");
	printf("Chuc nang 5: Doi tien.\n");
	printf("Chuc nang 6: Tinh lai suat vay ngan hang.\n");
	printf("Chuc nang 7: Vay tien mua xe.\n");
	printf("Chuc nang 8: Sap xep thong tin sinh vien.\n");
	printf("Chuc nang 9: Game FPOLY-LOTT.\n");
	printf("Chuc nang 10: Tinh toan phan so.\n");
	
	printf("Chuc nang 11: Thoat MENU.");
	
	do
	{
	printf("\n\nXin moi chon chuc nang: ");
	
	scanf("%d",&menu);
	
	switch (menu)
	{
		case 1:
		{
			printf("\nBan da chon chuc nang 1.\n");
			printf("\nKiem tra so nguyen.\n\n");
			
			int x;
						
			printf("Nhap vao so X can ktra: ");
			scanf("%d",&x);
			
			int trl = mot(x);
			
			break;
		}
		case 2:
		{
			printf("\nBan da chon chuc nang 2.\n");
			printf("\nTim uoc so chung va boi so chung cua 2 so.\n\n");
			int x,y,UC,BC;
			
			printf("Nhap vao so thu nhat: ");
			scanf("%d",&x);
			
			printf("Nhap vao so thu hai: ");
			scanf("%d",&y);
			
			UC=ucln(x,y);
			BC=bcnn(x,y);
			
			printf("\nUoc chung lon nhat cua %d va %d la: %d",x,y,UC);
			printf("\nBoi chung nho nhat cua %d va %d la: %d\n",x,y,BC);
			
			break;
		}
		case 3:
		{
			printf("\nBan da chon chuc nang 3.\n");
			printf("\nChuong trinh tinh tien hat cho quan Karaoke.\n\n");
			
			int x,y; //x la gio bat dau //y la gio ket thuc	
			
			printf("Nhap vao gio bat dau: ");
			scanf("%d",&x);
			
			printf("Nhap vao gio ket thuc: ");
			scanf("%d",&y);
			
			int kq = ba(x,y);
			
			break;
		}
		case 4:
		{
			printf("\nBan da chon chuc nang 4.\n");
			printf("\nChuong trinh tinh tien dien.\n\n");
			int x;
			
			printf("Nhap vao so dien: ");
			scanf("%f",&x);
			
			int kq = bon(x);
			
			break;
		}
		case 5:
		{
			printf("\nBan da chon chuc nang 5.\n");
			printf("\nChuc nang doi tien.\n\n");
			
			int x;
			
			printf("Nhap vao so tien can doi: ");
			scanf("%d",&x);
			
			nam(x);
			
			break;
		}
		case 6:
		{
			printf("\nBan da chon chuc nang 6.\n");
			printf("\nChuc nang tinh lai suat ngan hang vay tra gop.\n\n");
			
			float vay;
			
			printf("Nhap vao so tien can vay: ");
			scanf("%f",&vay); //double la LF			float la F
			
			int kq = sau(vay);
			
			break;
		}
//		case 7:
//		{
//			printf("\nBan da chon chuc nang 7.\n");
//			printf("\nChuong trinh vay tien mua xe.\n\n");
//			
//			float ptrvay;
//			
//			printf("Nhap so phan tram vay toi da: ");
//		    scanf("%f",&ptrvay);
//			
//			int kq = bay(ptrvay);
//			
//			break;
//		}
		case 8:
		{
			printf("\nBan da chon chuc nang 8.\n");
			printf("\nSap xep thong tin cua sinh vien.\n\n");
			tam();
			break;
		}
		case 9:
		{
			printf("\nBan da chon chuc nang 9.\n");
			printf("\nXay dung game FPOLY-LOTT.\n\n");
			chin();
			break;
		}
		case 10:
		{
			printf("\nBan da chon chuc nang 10.\n");
			printf("\nChuong trinh tinh toan phan so.\n\n");
			muoi();
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
