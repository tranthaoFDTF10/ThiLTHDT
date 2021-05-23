import java.util.Scanner;

public class BNhan {
    private String hten;
    private boolean gtinh;
    private int nsinh;
    private double cnang;

    public BNhan(){
        hten = new String();
        gtinh = true;
        nsinh = 2001;
        cnang = 40.5;
    }
    public BNhan(String ht, boolean gt, int ns, double cn){
        hten = new String(ht);
        gtinh = gt;
        nsinh = ns;
        cnang = cn;
    }
    public BNhan(BNhan bn){
        hten = new String(bn.hten);
        gtinh = bn.gtinh;
        nsinh = bn.nsinh;
        cnang = bn.cnang;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ho ten: ");
        hten = sc.nextLine();
        System.out.print("\nNhap gioi tinh true(Nam), false(Nu): ");
        gtinh = sc.nextBoolean();
        System.out.print("\nNhap nam sinh: ");
        nsinh = sc.nextInt();
        System.out.print("\nNhap can nang: "); 
        cnang = sc.nextDouble();
    }
    public void in(){
        System.out.println("Ho ten: "+hten);
        if(gtinh==true){
            System.out.println("Gioi tinh: Nam");
        }
        else{
            System.out.println("Gioi tinh: Nu");
        }
        System.out.println("Nam sinh: "+nsinh);
        System.out.println("Can nang: "+cnang);
    }
    public String getLoai(){
        String s = "";
        return s;
    }
    public String getODich(){
        return "";
    }
    public String getHoten(){
        return hten;
    }
    public int getNgay(){
        
        return 0;
    }
    public int getThang(){
        return 0;
    }
    public int getNam(){
        return 0;
    }
    public static void main(String[] args){
        BNhan bn1 = new BNhan();
        bn1.nhap();
        System.out.println("Thong tin benh nhan bn1: ");
        bn1.in();
        System.out.println("Thong tin benh nhan bn2: ");
        BNhan bn2 = new BNhan(bn1);
        bn2.in();
    }

}
