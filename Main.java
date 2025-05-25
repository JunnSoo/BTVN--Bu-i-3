package baitap;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luaChon;
		System.out.println("1. Tính cạnh huyền ");
		System.out.println("2. Tính đơn thức P(x)");
		System.out.println("3. Tính tổng 2 ký số");
		System.out.println("4. Tính trung bình 5 số");
		System.out.println("5. Tính độ F");
		System.out.println("6. Tính tiền vnd từ usd");
		System.out.println("0. Dừng lại");
		
		do {		
			System.out.println("Hãy nhập lựa chọn từ 0-6");
		
			luaChon = scanner.nextInt();
			switch(luaChon) {
			case 1:
				double canh1,canh2;
				System.out.println("nhap 2 canh tam giac");
				canh1 = scanner.nextDouble();
				canh2 = scanner.nextDouble();
				Function.tinhCanhHuyen(canh1, canh2);
				break;
				
			case 2:
				double sothuc;
				int somu;
				System.out.println("nhap vao gia tri a");
				sothuc = scanner.nextDouble();
				System.out.println("nhap vao so mũ");
				somu = scanner.nextInt();
				Function.tinhDonThuc(sothuc, somu);
				break;
			
			case 3:
				int songuyenduong;
				System.out.println("nhap vao 1 so nguyen duong co 2 ky so");
				songuyenduong = scanner.nextInt();
				Function.tinhTongHaiKySo(songuyenduong);
				break;
				
			case 4:
				Function.tinhTrungBinh5So();
				break;
				
			case 5:
				int doC;
				System.out.println("Nhập vào độ C: ");
				doC = scanner.nextInt();
				Function.tinhDoF(doC);
				break;
			
			case 6:
				double usd;
				System.out.println("Nhập vào số tiền muốn quy đổi: ");
				usd = scanner.nextDouble();
				Function.tinhTienVND(usd);
				break;
				
			case 0:
			        System.out.println("Đã thoát chương trình.");
			        break;
	
	        	default:
	            		System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập từ 0 đến 6.");
			}
		} while(luaChon != 0);
		scanner.close();
	}
}
