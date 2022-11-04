package ltdd.tuan_1.sqlite.model;

public class SinhVien {
    private int maSinhVien_251;
    private int gioiTinh_251;
    private String hoTen_251;
    private String dienThoai_251;
    private String email_251;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien_251, int gioiTinh_251, String hoTen_251, String dienThoai_251, String email_251) {
        this.maSinhVien_251 = maSinhVien_251;
        this.gioiTinh_251 = gioiTinh_251;
        this.hoTen_251 = hoTen_251;
        this.dienThoai_251 = dienThoai_251;
        this.email_251 = email_251;
    }

    public SinhVien(int gioiTinh_251, String hoTen_251, String dienThoai_251, String email_251) {
        this.gioiTinh_251 = gioiTinh_251;
        this.hoTen_251 = hoTen_251;
        this.dienThoai_251 = dienThoai_251;
        this.email_251 = email_251;
    }

    public int getMaSinhVien_251() {
        return maSinhVien_251;
    }

    public void setMaSinhVien_251(int maSinhVien_251) {
        this.maSinhVien_251 = maSinhVien_251;
    }

    public int getGioiTinh_251() {
        return gioiTinh_251;
    }

    public void setGioiTinh_251(int gioiTinh_251) {
        this.gioiTinh_251 = gioiTinh_251;
    }

    public String getHoTen_251() {
        return hoTen_251;
    }

    public void setHoTen_251(String hoTen_251) {
        this.hoTen_251 = hoTen_251;
    }

    public String getDienThoai_251() {
        return dienThoai_251;
    }

    public void setDienThoai_251(String dienThoai_251) {
        this.dienThoai_251 = dienThoai_251;
    }

    public String getEmail_251() {
        return email_251;
    }

    public void setEmail_251(String email_251) {
        this.email_251 = email_251;
    }
}
