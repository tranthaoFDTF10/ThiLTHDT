package thi;

import java.util.Scanner;

public class CNguoi { 
	private String id; //So passport hoac CMND
	private String hten; // Ho ten 
	private String ngay; //ngay-thang-nam sinh
	private char phai; //Phai nam (M), nu la F
	
	public CNguoi() { 
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'a';
	}
	public CNguoi(String ms, String ht, String n, char p) { //Ham nay viet them
		id = new String(ms);
		hten = new String(ht);
		ngay = new String(n);
		phai = p;
	}
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap id: ");
		id = sc.nextLine();
		System.out.print("\nNhap ho ten: ");
		hten = sc.nextLine();
		System.out.print("\nNhap ngay sinh: ");
		ngay = sc.nextLine();
		System.out.print("\nNhap phai M(nam) hoac F(nu): ");
		phai = sc.next().charAt(0); //tra ve ki tu cua chuoi o vi tri dau tien
		//phuong thuc next() cung la nhap chuoi nhung chi in dong dau tien
		//Phuong thuc charAt() la tra ve ki tu cua chuoi tai vi tri nao do
	}
	public void in() {
		System.out.println("ID: "+id);
		System.out.println("Ho ten: "+hten);
		System.out.println("Ngay sinh: "+ngay);
		if(phai=='M') {
			System.out.println("Phai: Nam");
		}else {
			System.out.println("Phai: Nu");
		}
	}
	@Override
	public String toString() { //Ham nay viet them
		String t="";
		t+="ID: "+id+"\n";
		t+="Ho ten: "+hten+"\n";
		t+="Ngay sinh: "+ngay+"\n";
		if(phai=='M') {
			t+="Phai: Nam"+"\n";
		}else {
			t+="Phai: Nu"+"\n";
		}
		return t;
	}
	public long tinhLuong() { //Khong phai cau thu thi tien luong = 0
		long tongluong=0;
		return tongluong;
	}
	public int getNamSinh() {
		String t="";
		t+=ngay.substring(6); //toi vi tri thu 6 thi cat va lay 
		int tuoi = Integer.parseInt(t); //ep kieu string ve kieu int
		return tuoi;
	}
	public String getHoTen() {
		return hten;
	}
	public void hienThiSoBanThang() { //Khong phai cau thu thi hien thi ra
		System.out.print("Khong phai cau thu.\n");
	}
	public static void main(String[] args) {
		//1. Tao doi tuong con nguoi c1, nhap va in ra c1
		CNguoi c1 = new CNguoi();
		c1.nhap();
		System.out.println("Thong tin doi tuong con nguoi c1: ");
		c1.in();
		//System.out.println("Nam sinh cua c1: "+c1.getNamSinh());
		
		//2. Tao doi tuong con nguoi c2, sao chep doi tuong c1 vao c2 sau do in ra
		CNguoi c2 = new CNguoi();
		c2 = new CNguoi(c1);
		System.out.println("Thong tin doi tuong con nguoi c2: ");
		c2.in();
	}
	
}
