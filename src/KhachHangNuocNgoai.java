public class KhachHangNuocNgoai extends KhachHang {
    private String QuocTich;
    private double soluong,dongia,thanhtien;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, double soluong, double dongia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        QuocTich = quocTich;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhTien();
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    public Double thanhTien(){
       return soluong*dongia;
    }
    public void xuat(){
        System.out.println("Mã khách hàng:" + getMaKhachHang());

        System.out.println("Tên khách hàng: " + getHoTen());

        System.out.println("Ngày ra hoá đơn: "+getNgayRaHoaDon());

        System.out.println("Quốc tịnh: "+getQuocTich());

        System.out.println("Số lượng(số KW tiêu thụ): "+getSoluong());

        System.out.println("Đơn giá: "+getDongia());
        System.out.println("Thành tiền: "+getThanhtien());
    }
}