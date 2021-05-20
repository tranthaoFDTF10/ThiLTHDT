package thi;
import java.util.Scanner;
public class CThu extends CNguoi{
	private int so; //So ao thi dau
	private String vitri; //Vi tri thi dau
	private long bthang; //so ban thang co kieu so nguyen dai
	private String mua; //mua giai thi dau
	private String clbo; //cau lac bo
	long LuongCoBan = 7000000;
	public CThu() {
		super();
		so = 0;
		vitri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
	}
	public CThu(String ms, String ht, String n, char p,int s, String vt, long bt, String m, String clb) {
		//Ham nay viet them
		super(ms,ht,n,p);
		so = s;
		vitri = vt;
		bthang = bt;
		mua = m;
		clbo = clb;
	}
	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vitri = new String(ct.vitri);
		bthang = ct.bthang;
		mua = new String(ct.mua);
		clbo = new String(ct.clbo);
	}
	@Override
	public void nhap() { //nap de giong voi phuong thuc nhap() cua lop cha
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so ao: ");
		so = sc.nextInt();
		sc.nextLine(); //xoa bo nho dem
		System.out.print("\nNhap vi tri thi dau: ");
		vitri = sc.nextLine();
		System.out.print("\nNhap so ban thang: ");
		bthang = sc.nextLong();
		sc.nextLine();// xoa bo nho dem
		System.out.print("\nNhap mua giai: ");
		mua = sc.nextLine();
		System.out.print("\nNhap ten CLB: ");
		clbo = sc.nextLine();
	}
	@Override
	public void in() { //nap de
		super.in();
		System.out.println("So ao: "+so);
		System.out.println("Vi tri thi dau: "+vitri);
		System.out.println("So ban thang: "+bthang);
		System.out.println("Mua giai: "+mua);
		System.out.println("Ten CLB: "+clbo);
	}
	@Override
	public String toString() { //Ham nay viet them
		String t="";
		t+=super.toString()+"\n";
		t+="So ao: "+so+"\n";
		t+="Vi tri thi dau: "+vitri+"\n";
		t+="So ban thang: "+bthang+"\n";
		t+="Mua giai: "+mua+"\n";
		t+="Ten CLB: "+clbo+"\n";
		return t;
	}
	@Override
	public long tinhLuong() {
		long tongluong = 0;
		if(vitri=="thu mon") {
			tongluong+=(LuongCoBan+3000000+bthang*500000);
		}
		else if(vitri=="hau ve") {
			tongluong+=(LuongCoBan+4000000+bthang*500000);
		}
		else if(vitri=="trung ve") {
			tongluong+=(LuongCoBan+4500000+bthang*500000);
		}
		else if(vitri=="tien ve"){
			tongluong+=(LuongCoBan+5000000+bthang*500000);
		}
		else {
			tongluong+=(LuongCoBan+7000000+bthang*500000);
		}
		return tongluong-=(tongluong*0.1);
	}
	public void hienThiSoBanThang() {
		int namhh = 2021;
		int tuoi = namhh - super.getNamSinh();
		if(tuoi>=18 && tuoi<=24 ) {
			System.out.println("Cap do tuoi 18 - 24");
			System.out.println("Ho ten cau thu: "+super.getHoTen());
			System.out.println("Mua giai: "+mua);
			System.out.println("So ban thang: "+bthang);
			System.out.println("CLB: "+clbo);
		}
		else if(tuoi>=25 && tuoi<=28 ) {
			System.out.println("Cap do tuoi 25 - 28");
			System.out.println("Ho ten cau thu: "+super.getHoTen());
			System.out.println("Mua giai: "+mua);
			System.out.println("So ban thang: "+bthang);
			System.out.println("CLB: "+clbo);
		}
		else {
				System.out.println("Cap do tuoi >28");
				System.out.println("Ho ten cau thu: "+super.getHoTen());
				System.out.println("Mua giai: "+mua);
				System.out.println("So ban thang: "+bthang);
				System.out.println("CLB: "+clbo);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so luong danh sach: ");
		int n = sc.nextInt();
		CNguoi ds[] = new CNguoi[n]; //Tao ra n mang tham chieu CNguoi
		for(int i=0;i<n;i++) {
			System.out.println("1. Nhap con nguoi.");
			System.out.println("2. Nhap cau thu.");
			int chon = sc.nextInt();
			System.out.print("*****Nhap thong tin doi tuong "+(i+1)+": *****");
			if(chon==1) {
				ds[i] = new CNguoi();
				ds[i].nhap();
			}else {
				ds[i] = new CThu();
				ds[i].nhap();
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("*****Thong tin doi tuong thu "+(i+1)+": *****");
			ds[i].in();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("==> Tien luong cau thu thu "+(i+1)+": "+ds[i].tinhLuong());
			
		}
		System.out.println("=====Thong ke so ban thang=====");
		for(int i=0;i<n;i++) {
			ds[i].hienThiSoBanThang();
		}
	}
	
}
