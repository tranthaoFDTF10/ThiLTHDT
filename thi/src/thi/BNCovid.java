import java.util.Scanner;
public class BNCovid extends BNhan{
    private String ngay;
    private char loai;
    private String odich;
    private String noi;
    
    public BNCovid(){
        super();
        ngay = new String();
        loai = 'a';
        odich = new String();
        noi = new String();
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ngay cach ly: ");
        ngay = sc.nextLine();
        System.out.println("\nNhap loai covid: ");
        loai = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("\nNhap o dich: ");
        odich = sc.nextLine();
        System.out.print("\nNhap noi cach ly: ");
        noi = sc.nextLine();
    }
    public void in(){
        super.in();
        System.out.println("Ngay cach ly: "+ngay);
        System.out.println("Loai covid: "+loai);
        System.out.println("O dich: "+odich);
        System.out.println("Noi cach ly: "+noi);
    }
    public String getLoai(){
        String s="F"; 
        s+=Character.toString(loai);
        return s;
    }
    public String getODich(){
        return odich;
    }
    public String getHoTen(){
        return super.getHoten();
    }
    public int getNgay(){
        String t[];
        t = ngay.split("/");
        int ngay = Integer.parseInt(t[0]);
        return ngay;
    }
    public int getThang(){
        String t[];
        t = ngay.split("/");
        int thang = Integer.parseInt(t[1]);
        return thang;
    }
    public int getNam(){
        String t[];
        t = ngay.split("/");
        int nam = Integer.parseInt(t[2]);
        return nam;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong danh sach benh nhan: ");
        int n = sc.nextInt();
        BNhan ds[] = new BNhan[n];
        for(int i=0;i<n;i++){
            System.out.println("1. Nhap benh nhan");
            System.out.println("2. Nhap benh nhan covid");
            System.out.print("\nBan muon nhap lua chon nao?");
            int chon = sc.nextInt();
            System.out.println("Nhap benh nhan thu "+(i+1)+": ");
            if(chon==1){
                ds[i] = new BNhan();
                ds[i].nhap();
            }
            if(chon==2){
                ds[i] = new BNCovid();
                ds[i].nhap();
            }
        }
        System.out.println("=====Thong tin benh nhan=====");
        for(int i=0;i<n;i++){
            System.out.println("Thong tin benh nhann thu "+(i+1)+": ");
            ds[i].in();
        }
        //Liet ke cac benh nhan nhiem covid loai F1 va o cong ty fdtgroup
        System.out.println("=====Liet ke cac benh nhan nhiem covid F1 va o cong ty fdt group=====");
        for(int i=0;i<n;i++){
            if(ds[i].getLoai().equals("F1") && ds[i].getODich().equals("fdtgroup")){
                System.out.println("Ho ten benh nhan thu "+(i+1)+": "+ds[i].getHoten());
            }
        }
        //liet ke cac benh nhan cach ly du 21 ngay
        System.out.println("=====Danh sach benh nhan cach ly du 21 ngay=====");
        for(int i=0;i<n;i++){
            if(ds[i].getNgay()<=27 && ds[i].getThang()<5 && ds[i].getNam()==2021){
                System.out.println("Ho ten benh nhan thu "+(i+1)+": "+ds[i].getHoten());
            }
        }

    }
}
