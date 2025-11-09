#include<stdio.h>

void mot(){
	int n,i;
	int tong=0;
	int biendem;
	
	printf("Nhap so: ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++){
		if(i%3==0){
			printf("%d\t",i);
		}
	}
	for(i=0;i<n;i++){
		if(i%3==0){	
		tong=tong+i;
		biendem++;
	}
	}
	printf("\nTong cac so chia het cho 3 la: %d\n",tong);
	printf("Trung binh cong cac so chia het cho 3 la: %.1f",(float)tong/biendem);
}

void hai()
{
	float x,y,z;
	printf("Diem toan: ");
	scanf("%f",&x);
	
	printf("Diem ly: ");
	scanf("%f",&y);
	
	printf("Diem hoa: ");
	scanf("%f",&z);
	
	float tbc=(x+y+z)/3;
	
	printf("Diem trung binh cua 3 mon toan ly hoa la: %.1f",tbc);
	
	if(tbc>=9){
		printf("Xuat sac\n");
	}
	else if(tbc>=8){
		printf("Gioi\n");
	}
	else if(tbc>=6){
		printf("Kha\n");
	}
	else if(tbc>=5){
		printf("Trung binh\n");
	}
	else{
		printf("Yeu\n");
	}
}

void ba()
{
	int a;
	printf("Nhap so: ");
	scanf("%d",&a);
	
	if(a%3==0 && a%5==0){
		printf("so %d chia het cho ca 3 va 5",a);
	}
	else{
		printf("so %d khong chia cho ca 3 va 5",a);
	}
}
int main(){
	int a;
	
	do{
		printf("\n\n===MENU===\n");
		
		printf("1. Chuc nang 1\n");
		printf("2. Chuc nang 2\n");
		printf("3. Chuc nang 3\n");
		
		printf("0. THOAT MENU\n");
		printf("\nMoi ban nhap chuc nang: ");
		scanf("%d",&a);
		
		switch(a)
		{
			case 1:
			{
				printf("Ban da chon chuc nang 1\n");
				mot();
				break;
			}
			case 2:
			{
				printf("Ban da chon chuc nang 2\n");
				hai();
				break;
			}
			case 3:
			{
				printf("Ban da chon chuc nang 3\n");
				ba();
				break;
			}
			case 4:
			{
				printf("Ban da thoat thanh cong\n");
				break;
			}
			default:
			{
				printf("Khong co chuc nang ban chon\n");
				break;
			}
		}
	}while(a!=4);
	
	return 0;
}

