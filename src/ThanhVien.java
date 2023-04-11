public class ThanhVien extends The{
    ThanhVien(){
        super();
    }

    ThanhVien(String Ma, String Ten, int Loai, double tongTien){
        super(Ma, Ten, Loai, tongTien);
    }

    public void muaHang(int ngayMua, double tienMua){
        ngaySD.add(ngayMua);
        tongTien += tienMua;

    }

    public int chuyenDoiLoaiThe(int ngayMua, double tienMua){
        if (this.tongTien + tienMua > 5000){
            return 1;
        }
        return 0;
    }

    public int ngayCuoiSD(){
        return ngaySD.get(ngaySD.size() - 1);
    }
}
