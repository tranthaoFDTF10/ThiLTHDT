class CBCC{
    private String    masocb;  	//   Mã số cán bộ 
    private String  hoten; 	 	//   Họ tên 
    protected float  hesoluong; 	//   Hệ số lương 
    int  namsinh; 	 	 	//   Năm sinh 
    default CBCC() { 
        masocb = new String(); 
        hoten = new String(); 
        namsinh = hesoluong=0; 
    } 
    void   nhap() { 
        Scanner sc =new Scanner(System.in) ; 
        System.out.print(”Nhap ma so can bo : “); masocb=sc.nextLine(); 
        System.out.print(”Nhap hoten can bo : “); hoten=sc.nextLine(); 
        System.out.print(”Nhap nam sinh : “); namsinh=sc.nextInt(); 
        System.out.print(”Nhap he so luong : “); hesoluong=sc.nextFloat(); 
    }     
    void  in() { 
        System.out.print(hoten + ” co ma so la” + masocb + ” sinh nam “ + namsinh 
        + ” co he so luong “ + hesoluong); 
    } 
    float   tienLuong() { return hesoluong*210000; }    } 
    string toString(){ string t=""; return t;}