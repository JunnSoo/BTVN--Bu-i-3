package baitap;

import java.util.Scanner;

public class Function {
	public static void tinhCanhHuyen(double a, double b) {
		double c = Math.sqrt(a*a + b*b);
		System.out.println("canh huyen: " + c);
	}
	
	public static void tinhDonThuc(double a,int n) {
		double c = a * Math.pow(8, n);
		System.out.println("Giá trị đơn thức: " + c);
	}
	
	public static void tinhTongHaiKySo(int a) {
		int b,c;
		b = a/10;
		c = a%10;
		int tong = b+c;
		System.out.println("Giá trị đơn thức: " + tong);
	}
	
	public static void tinhTrungBinh5So() {
		Scanner scanner = new Scanner(System.in);
		int sum =0;
		int temp =0;
		for(int i = 0; i < 5;i++) {
			System.out.println("nhap vao so thứ "+ i);
			temp = scanner.nextInt();
			sum += temp;
		}
		double average = sum /5;
		System.out.println("Giá trị trung bình của 5 số là: "+ average);
	}
	
	public static void tinhDoF(double a) {
		double doF = (a*1.8) + 32;
		System.out.println("Nhiệt độ F: "+ doF);
	}
	
	public static void tinhTienVND(double a) {
		double vnd = a * 23500;
		System.out.println("Số tiền quy đổi là: "+ vnd);
	}
}

