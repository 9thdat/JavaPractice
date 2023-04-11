import java.lang.reflect.Array;
import java.util.ArrayList;

abstract class The {
    String Ma;
    String Ten;
    int Loai; // ThanhVien = 1, Vip = 2
    double tongTien;

    ArrayList<Integer> ngaySD = new ArrayList<Integer>();

    public The(){
        Ma = "";
        Ten = "";
        Loai = 0;
        tongTien = 0;
    }

    public The(String Ma, String Ten, int Loai, double tongTien){
        this.Ma = Ma;
        this.Ten = Ten;
        this.Loai = Loai;
        this.tongTien = tongTien;
    }

    abstract void muaHang(int ngayMua, double tienMua);
    abstract int chuyenDoiLoaiThe(int ngayMua, double tienMua);

    abstract int ngayCuoiSD();

}
