package JSP.model;

public class Customer {
    private String hoTen;
    private String ngaySinh;
    private String DiaChi;
    private String anh;

    public Customer(String hoTen, String ngaySinh, String diaChi, String anh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        DiaChi = diaChi;
        this.anh = anh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
}
