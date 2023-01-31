package problem13;

public class KetQua {

    private String ngayThi;
    private int id;
    private int phanLoaiMon;
    private int diem;

    public KetQua() {

    }
    public KetQua(String ngayThi, int id, int phanLoaiMon, int diem) {
        this.ngayThi = ngayThi;
        this.id = id;
        this.phanLoaiMon = phanLoaiMon;
        this.diem = diem;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhanLoaiMon() {
        return phanLoaiMon;
    }

    public void setPhanLoaiMon(int phanLoaiMon) {
        this.phanLoaiMon = phanLoaiMon;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
