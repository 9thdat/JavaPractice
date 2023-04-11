public class Vip extends ThanhVien{
    int soNamVip;
    Vip(){
        super();
        soNamVip = 0;
    }

    Vip(String Ma, String Ten, int Loai, double tongTien, int soNamVip){
        super(Ma, Ten, Loai, tongTien);
        this.soNamVip = soNamVip;
    }

    public void muaHang(int ngayMua, double tienMua){
        double phanTramThuong = Math.min(soNamVip * 0.05, 0.2);
        ngaySD.add(ngayMua);
        tienMua = tienMua * phanTramThuong;
        tongTien += tienMua;
    }

    public int chuyenDoiLoaiThe(int ngayMua, double tienMua){
        return 0;
    }

    public int ngayCuoiSD(){
        return ngaySD.get(ngaySD.size() - 1);
    }
}
