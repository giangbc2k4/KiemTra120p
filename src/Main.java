import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<KhachHangViet> listKhachViet = new ArrayList<>();
    public static List<KhachHangNuocNgoai> listKhachNgoai = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        boolean a = true;
        int key;
        while (a) {
            do {
                System.out.println("1: Nhập danh sách các hóa đơn khách hàng.\n" +
                        "2: xuất danh sách các hóa đơn khách hàng.\n" +
                        "3: Tính tổng số lượng cho từng loại khách hàng.\n" +
                        "4: Tính trung bình thành tiền của khách hàng người nước ngoài.\n" +
                        "5: Xuất ra các hoá đơn trong tháng 09 năm 2013 (cùa cả 2 loại khách hàng)\n" +
                        "0: Thoat.\n");
                System.out.print("Vui lòng lựa chọn: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Vui lòng lựa chọn: ");
                    scanner.next();
                }
                key = scanner.nextInt();
            } while (key < 0);
            switch (key) {
                case 1:
                    System.out.println("1:Nhập khách hàng người Việt");
                    System.out.println("2:Nhập khách hàng người Nước Ngoài");
                    System.out.print("Vui lòng lựa chọn: :");
                    int n = scanner.nextInt();
                    if (n == 1) {
                        System.out.print("Số khách muốn thêm vào:");
                        int sl = scanner.nextInt();
                        for (int i = 0; i < sl; i++) {
                            System.out.println("Nhập vào Khách hàng thứ " + (i + 1));
                            nhapkhachViet();
                        }
                    } else if (n == 2) {
                        System.out.print("Số khách muốn thêm vào:");
                        int sl = scanner.nextInt();
                        for (int i = 0; i < sl; i++) {
                            System.out.println("Nhập vào Khách hàng thứ " + (i + 1));
                            nhapkhachNgoai();
                        }
                    }

                    break;
                case 2:
                    System.out.println("Danh sách hoá đơn khách hàng");
                    System.out.println("Danh sách khách Người Việt:");
                    xuatKhachViet();
                    System.out.println("Danh sách khách Người Nước Ngoài");
                    xuatKhachNgoai();
                    break;
                case 3:
                    tongDienKhachViet();
                    tongDienKhachNgoai();
                    break;
                case 4:
                    trungbinh();
                    break;
                case 5:
                    System.out.println("Các hoá đơn trong tháng 09/2013:");
                    System.out.println("Khách Hàng Việt:");
                    kiemtrakhachViet();
                    System.out.println("Khách hàng nước ngoài:");
                    kiemtrakhachNgoai();
                    break;
                case 0:
                    a = false;
                    break;
                default:
                    System.out.println("vui long chon lai");
            }
        }

    }


    public static void nhapkhachViet() {
        try {


            scanner.nextLine();
            System.out.print("Vui lòng nhập mã khách hàng: ");
            String maKhachViet = scanner.nextLine();
            System.out.print("Vui lòng nhập tên khách hàng: ");
            String tenKhachViet = scanner.nextLine();
            System.out.print("Vui lòng nhập ngày ra hoá đơn: ");
            String ngayKhachViet = scanner.nextLine();
            System.out.print("Vui lòng nhập đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): ");
            String doituongKhachViet = scanner.nextLine();
            System.out.print("Vui lòng nhập số lượng (số KW tiêu thụ): ");
            Double slKhachViet = scanner.nextDouble();
            System.out.print("Vui lòng nhập đơn giá: ");
            double dongiaKhachViet = scanner.nextDouble();
            System.out.print("Vui lòng nhập định mức: ");
            double dinhmucKhachViet = scanner.nextDouble();
            KhachHangViet khachHangViet = new KhachHangViet(maKhachViet, tenKhachViet, ngayKhachViet, doituongKhachViet, slKhachViet, dongiaKhachViet, dinhmucKhachViet);
            listKhachViet.add(khachHangViet);
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
    }

    public static void nhapkhachNgoai() {
        try {
            scanner.nextLine();
            System.out.print("Vui lòng nhập mã khách hàng: ");
            String maKhachNgoai = scanner.nextLine();
            System.out.print("Vui lòng nhập tên khách hàng: ");
            String tenKhachNgoai = scanner.nextLine();
            System.out.print("Vui lòng nhập ngày ra hoá đơn: ");
            String ngayKhachNgoai = scanner.nextLine();
            System.out.print("Vui lòng nhập quốc tịch");
            String quoctichKhachNgoai = scanner.nextLine();
            System.out.print("Vui lòng nhập số lượng (số KW tiêu thụ):");
            Double slKhachNgoai = scanner.nextDouble();
            System.out.print("Vui lòng nhập đơn giá: ");
            double dongiaKhachNgoai = scanner.nextDouble();
            KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(maKhachNgoai, tenKhachNgoai, ngayKhachNgoai, quoctichKhachNgoai, slKhachNgoai, dongiaKhachNgoai);
            listKhachNgoai.add(khachHangNuocNgoai);
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
    }

    public static void xuatKhachViet() {
        for (KhachHangViet khachHangViet : listKhachViet) {
            khachHangViet.xuat();
        }
    }

    public static void xuatKhachNgoai() {
        for (KhachHangNuocNgoai khachHangNuocNgoai : listKhachNgoai) {
            khachHangNuocNgoai.xuat();
        }
    }

    public static void tongDienKhachNgoai() {
        double dem = 0;

        for (KhachHangNuocNgoai khachHangNuocNgoai : listKhachNgoai) {
            dem = dem + khachHangNuocNgoai.getSoluong();
        }
        System.out.println("Tổng số lượng điện của khách nước ngoài là : " + dem);
    }

    public static void tongDienKhachViet() {
        double dem = 0;

        for (KhachHangViet khachHangViet : listKhachViet) {
            dem = dem + khachHangViet.getSoluong();
        }
        System.out.println("Tổng số lượng điện của khách việt là: " + dem);
    }

    public static void trungbinh() {
        double dem = 0;

        for (KhachHangNuocNgoai khachHangNuocNgoai : listKhachNgoai) {
            dem = dem + khachHangNuocNgoai.getThanhtien();

        }

        System.out.println("Trung bình tiền điện cảu người nước ngoài là: " + (dem / listKhachNgoai.size()));
    }

    public static boolean demSoLanXuatHien(String s, String target) {

        for (int i = 0; i <= s.length() - target.length(); i++) {
            if (s.substring(i, i + target.length()).equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void kiemtrakhachNgoai() {
        for (KhachHangNuocNgoai khachHangNuocNgoai : listKhachNgoai) {
            if (demSoLanXuatHien(khachHangNuocNgoai.getNgayRaHoaDon(), "09/2013")) {
                khachHangNuocNgoai.xuat();
            }

        }
    }

    public static void kiemtrakhachViet() {
        for (KhachHangViet khachHangViet : listKhachViet) {
            if (demSoLanXuatHien(khachHangViet.getNgayRaHoaDon(), "09/2013")) {
                khachHangViet.xuat();
            }

        }
    }

}