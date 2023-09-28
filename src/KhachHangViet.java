public class KhachHangViet extends KhachHang {
    private String doiTuongKhachHang;
    private double soluong;
    private double dongia, dinhmuc, thanhtien;

    public KhachHangViet(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang, double soluong, double dongia, double dinhmuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.dinhmuc = dinhmuc;
        this.thanhtien = thanhtien();
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
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

    public double getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public double thanhtien() {
        if (this.getSoluong() <= this.getDinhmuc()) {
            return this.soluong * this.dongia;

        } else {
            return this.soluong * this.dongia * dinhmuc + (soluong - dinhmuc) * dongia * 2.5;
        }
    }

    public void xuat() {
        System.out.println("Mã khách hàng:" + getMaKhachHang());

        System.out.println("Tên khách hàng: " + getHoTen());

        System.out.println("Ngày ra hoá đơn: " + getNgayRaHoaDon());

        System.out.println("Đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): " + getDoiTuongKhachHang());

        System.out.println("Số lượng(số KW tiêu thụ): " + getSoluong());

        System.out.println("Đơn giá: " + getDongia());

        System.out.println("Định mức: " + getDinhmuc());
        System.out.println("Thành tiền: " + getThanhtien());
    }

}
