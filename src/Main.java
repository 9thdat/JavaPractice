import java.util.ArrayList;

public class Main {
    public static void muaHang(ArrayList<The> list, int index, int ngayMua, double tienMua){
        if (list.get(index).Loai == 1){
            if (list.get(index).chuyenDoiLoaiThe(ngayMua, tienMua) == 1){
                Vip tvVip = new Vip(list.get(index).Ma, list.get(index).Ten, 2, list.get(index).tongTien, 1);
                tvVip.muaHang(ngayMua, tienMua);
                list.remove(index);
                list.add(tvVip);
            }
            else {
                list.get(index).muaHang(ngayMua, tienMua);
            }
        }
        else {
            list.get(index).muaHang(ngayMua, tienMua);
        }
    }

    public static void kiemTraThe(ArrayList<The> list, int ngayHienTai){
        for (The i : list) {
            if (i instanceof Vip){
                if (i.ngayCuoiSD() + 365 < ngayHienTai){
                    ThanhVien tv = new ThanhVien(i.Ma, i.Ten, 1, 0);
                    list.remove(i);
                    list.add(tv);
                }
            }
            else {
                if (i.ngayCuoiSD() + 365 < ngayHienTai){
                    i.tongTien = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <The> list = new ArrayList<>();
        list.add(new ThanhVien("T0084", "Nguyen X", 1, 1000));

        muaHang(list, 0, 3, 1000);

        for (The i : list) {
            if (i instanceof Vip){
                System.out.println(i.Ma + " " + i.Ten + " " + i.Loai + " " + i.tongTien + " " + ((Vip) i).soNamVip);
            }
            else {
                System.out.println(i.Ma + " " + i.Ten + " " + i.Loai + " " + i.tongTien);
            }
        }

        kiemTraThe(list, 6);

        for (The i : list) {
            if (i instanceof Vip){
                System.out.println(i.Ma + " " + i.Ten + " " + i.Loai + " " + i.tongTien + " " + ((Vip) i).soNamVip);
            }
            else {
                System.out.println(i.Ma + " " + i.Ten + " " + i.Loai + " " + i.tongTien);
            }
        }
    }
}