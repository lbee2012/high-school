#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

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



void nam(int amount) {
    int menhgia[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int soto[sizeof(menhgia) / sizeof(int)] = {0};

    for (int i = 0; i < sizeof(menhgia) / sizeof(int); i++) {
        soto[i] = amount / menhgia[i];
        amount %= menhgia[i];
    }

    printf("Cac menh gia tien duoc doi ra:\n");
    for (int i = 0; i < sizeof(menhgia) / sizeof(int); i++) {
        if (soto[i] != 0) {
            printf("Menh gia %d: %d to\n", menhgia[i], soto[i]);
        }
    }
}

void tinh_tien_tra(float lai_suat, int thoi_gian_vay, float so_tien_vay, float *tien_tra_lan_dau, float *tien_tra_hang_thang) {
    float lai_suat_thang = lai_suat / 100 / 12;
    int so_thang_vay = thoi_gian_vay * 12;

    *tien_tra_hang_thang = (so_tien_vay * lai_suat_thang) / (1 - pow(1 + lai_suat_thang, -so_thang_vay));
    *tien_tra_lan_dau = so_tien_vay * (1 - pow(1 + lai_suat_thang, -so_thang_vay));
}



struct SinhVien {
    char ho_ten[50];
    float diem;
    char hoc_luc[20];
};

void sap_xep(SinhVien danh_sach[], int n) {
    int i, j;
    SinhVien temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (danh_sach[j].diem < danh_sach[j + 1].diem) {
                temp = danh_sach[j];
                danh_sach[j] = danh_sach[j + 1];
                danh_sach[j + 1] = temp;
            }
        }
    }
}

void xac_dinh_hoc_luc(float diem, char hoc_luc[]) {
    if (diem >= 9.0)
        strcpy(hoc_luc, "Xuat sac");
    else if (diem >= 8.0)
        strcpy(hoc_luc, "Gioi");
    else if (diem >= 6.5)
        strcpy(hoc_luc, "Kha");
    else if (diem >= 5.0)
        strcpy(hoc_luc, "Trung binh");
    else
        strcpy(hoc_luc, "Yeu");
}





int sinh_so_ngau_nhien() {
    return rand() % 15 + 1;
}



typedef struct {
    int tu_so;
    int mau_so;
} PhanSo;
// Hàm rút g?n phân s?
void rut_gon(PhanSo *ps) {
    int gcd = ucln(ps->tu_so, ps->mau_so);
    ps->tu_so /= gcd;
    ps->mau_so /= gcd;
}


void nhap_phaso(PhanSo *ps) {
    printf("Nhap tu so: ");
    scanf("%d", &ps->tu_so);
    printf("Nhap mau so: ");
    scanf("%d", &ps->mau_so);
}

PhanSo tong(PhanSo ps1, PhanSo ps2) {
    PhanSo ket_qua;
    ket_qua.tu_so = ps1.tu_so * ps2.mau_so + ps2.tu_so * ps1.mau_so;
    ket_qua.mau_so = ps1.mau_so * ps2.mau_so;
    rut_gon(&ket_qua);
    return ket_qua;
}

PhanSo hieu(PhanSo ps1, PhanSo ps2) {
    PhanSo ket_qua;
    ket_qua.tu_so = ps1.tu_so * ps2.mau_so - ps2.tu_so * ps1.mau_so;
    ket_qua.mau_so = ps1.mau_so * ps2.mau_so;
    rut_gon(&ket_qua);
    return ket_qua;
}

PhanSo tich(PhanSo ps1, PhanSo ps2) {
    PhanSo ket_qua;
    ket_qua.tu_so = ps1.tu_so * ps2.tu_so;
    ket_qua.mau_so = ps1.mau_so * ps2.mau_so;
    rut_gon(&ket_qua);
    return ket_qua;
}

PhanSo thuong(PhanSo ps1, PhanSo ps2) {
    PhanSo ket_qua;
    ket_qua.tu_so = ps1.tu_so * ps2.mau_so;
    ket_qua.mau_so = ps1.mau_so * ps2.tu_so;
    rut_gon(&ket_qua);
    return ket_qua;
}

void hien_thi(PhanSo ps) {
    printf("%d/%d\n", ps.tu_so, ps.mau_so);
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
			
			int x,i;	
			int biendem = 0;
			
			printf("Nhap vao so X can ktra: ");
			scanf("%d",&x);
			
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
			
			int bdau,kthuc,gio;
			double ttoan;
			
			printf("Nhap vao gio bat dau: ");
			scanf("%d",&bdau);
			
			printf("Nhap vao gio ket thuc: ");
			scanf("%d",&kthuc);
			
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
			break;
		}
		case 4:
		{
			printf("\nBan da chon chuc nang 4.\n");
			printf("\nChuong trinh tinh tien dien.\n\n");
			
			float a,b,c,d,e,x,y;
			
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
			
			printf("Nhap vao so dien: ");
			scanf("%f",&x);
			
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
			break;
		}
		case 5:
		{
			printf("\nBan da chon chuc nang 5.\n");
			printf("\nChuc nang doi tien.\n\n");
			
			int amount;
		    printf("Nhap so tien can doi: ");
		    scanf("%d", &amount);
		    if (amount <= 0) {
		        printf("So tien phai la mot so nguyen duong.\n");
		        return 1;
		    } else {
		        doi_tien(amount);
		    }
			break;
		}
		case 6:
		{
			printf("\nBan da chon chuc nang 6.\n");
			printf("\nChuc nang tinh lai suat ngan hang vay tra gop.\n\n");
			
			double vay;
			double laisuat = 5.0/100;
			int kyhan = 12;
			
			printf("Nhap vao so tien can vay: ");
			scanf("%lf",&vay); //double la LF			float la F
			
			double lai = (vay * laisuat * pow(1 + laisuat,kyhan) ) / (pow(1 + laisuat,kyhan)-1);
			
			printf("\nSo tien can tra hang thang la: %.3lf VND.\n",lai);
			break;
		}
		case 7:
		{
			printf("\nBan da chon chuc nang 7.\n");
			printf("\nChuong trinh vay tien mua xe.\n\n");
			
			float lai_suat = 7.2;
		    int thoi_gian_vay = 24;
		    float so_tien_vay = 500.0;
		    float tien_tra_lan_dau, tien_tra_hang_thang;
		
		    float phan_tram_vay;
		    printf("Nhap so phan tram vay toi da: ");
		    scanf("%f", &phan_tram_vay);
		    if (phan_tram_vay <= 0 || phan_tram_vay >= 100) {
		        printf("Nhap sai! So phan tram vay toi da phai lon hon 0 va nho hon 100.\n");
		        return 1;
		    }
		
		    tinh_tien_tra(lai_suat, thoi_gian_vay, so_tien_vay * phan_tram_vay / 100, &tien_tra_lan_dau, &tien_tra_hang_thang);
		
		    printf("So tien phai tra lan dau: %.2f trieu VND\n", tien_tra_lan_dau);
		    printf("So tien phai tra hang thang: %.2f trieu VND\n", tien_tra_hang_thang);
			break;
		}
		case 8:
		{
			printf("\nBan da chon chuc nang 8.\n");
			printf("\nSap xep thong tin cua sinh vien.\n\n");
			
			int n, i;

		    printf("Nhap so luong sinh vien: ");
		    scanf("%d", &n);
		    getchar();
		
		    SinhVien danh_sach[n];
		
		    // Nh?p thông tin sinh viên
		    for (i = 0; i < n; i++) {
		        printf("Nhap ho ten sinh vien %d: ", i + 1);
		        scanf("%s", danh_sach[i].ho_ten);
		        getchar();
		        printf("Nhap diem sinh vien %d: ", i + 1);
		        scanf("%f", &danh_sach[i].diem);
		        getchar();
		        xac_dinh_hoc_luc(danh_sach[i].diem, danh_sach[i].hoc_luc);
		    }
		
		    // S?p x?p sinh viên theo th? t? di?m gi?m d?n
		    sap_xep(danh_sach, n);
		
		    // Hi?n th? thông tin sinh viên, di?m và h?c l?c
		    printf("\nThong tin sinh vien sau khi sap xep theo diem giam dan:\n");
		    for (i = 0; i < n; i++) {
		        printf("Ho ten: %s, Diem: %.2f, Hoc luc: %s\n", danh_sach[i].ho_ten, danh_sach[i].diem, danh_sach[i].hoc_luc);
		    }
			break;
		}
		case 9:
		{
			printf("\nBan da chon chuc nang 9.\n");
			printf("\nXay dung game FPOLY-LOTT.\n\n");
			
			int so1, so2, so_ngau_nhien1, so_ngau_nhien2;

		    // Kh?i t?o b? sinh s? ng?u nhiên
		    srand(time(0));
		
		    // Nh?p hai s? t? ngu?i dùng
		    printf("Nhap so thu nhat (tu 01 den 15): ");
		    scanf("%d", &so1);
		    printf("Nhap so thu hai (tu 01 den 15): ");
		    scanf("%d", &so2);
		
		    // Sinh s? ng?u nhiên
		    so_ngau_nhien1 = sinh_so_ngau_nhien();
		    so_ngau_nhien2 = sinh_so_ngau_nhien();
		
		    // Hi?n th? s? ng?u nhiên
		    printf("So ngau nhien thu nhat: %d\n", so_ngau_nhien1);
		    printf("So ngau nhien thu hai: %d\n", so_ngau_nhien2);
		
		    // Ki?m tra k?t qu? trúng gi?i
		    int so_trung = 0;
		    if (so1 == so_ngau_nhien1 || so1 == so_ngau_nhien2) {
		        so_trung++;
		    }
		    if (so2 == so_ngau_nhien1 || so2 == so_ngau_nhien2) {
		        so_trung++;
		    }
		
		    // Hi?n th? thông tin trúng gi?i
		    switch (so_trung) {
		        case 0:
		            printf("Chuc ban may man lan sau!\n");
		            break;
		        case 1:
		            printf("Chuc mung ban da trung giai nhi!\n");
		            break;
		        case 2:
		            printf("Chuc mung ban da trung giai nhat!\n");
		            break;
		        default:
		            printf("Loi! Khong xac dinh duoc ket qua.\n");
		            break;
		    }
			break;
		}
		case 10:
		{
			printf("\nBan da chon chuc nang 10.\n");
			printf("\nChuong trinh tinh toan phan so.\n\n");
			
			PhanSo ps1, ps2;

		    // Nh?p hai phân s? t? bàn phím
		    printf("Nhap phan so thu nhat:\n");
		    nhap_phaso(&ps1);
		    printf("Nhap phan so thu hai:\n");
		    nhap_phaso(&ps2);
		
		    // Tính toán và hi?n th? k?t qu?
		    printf("Tong: ");
		    hien_thi(tong(ps1, ps2));
		    printf("Hieu: ");
		    hien_thi(hieu(ps1, ps2));
		    printf("Tich: ");
		    hien_thi(tich(ps1, ps2));
		    printf("Thuong: ");
		    hien_thi(thuong(ps1, ps2));

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
