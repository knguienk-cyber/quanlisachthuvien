import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String maSach = input.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = input.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = input.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = input.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = input.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = input.nextInt();

        int namHienTai = LocalDate.now().getYear();


        if (donGia <= 0) {
            System.out.println("Don gia phai lon hon 0.");
            input.close();
            return;
        }

        if (soLuong < 0) {
            System.out.println("So luong khong duoc am.");
            input.close();
            return;
        }

        if (namXuatBan < 1 || namXuatBan > namHienTai) {
            System.out.println("Nam xuat ban khong hop le.");
            input.close();
            return;
        }

        String phanLoaiGia;

        if (donGia < 50000) {
            phanLoaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sach gia cao";
        } else {
            phanLoaiGia = "Sach gia dac biet";
        }

        String tinhTrangTonKho;

        if (soLuong == 0) {
            tinhTrangTonKho = "Het sach";
        } else if (soLuong <= 5) {
            tinhTrangTonKho = "Sap het";
        } else if (soLuong <= 20) {
            tinhTrangTonKho = "Con it";
        } else {
            tinhTrangTonKho = "Con nhieu";
        }

        // Bài 4: Chọn loại sách bằng switch
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Lua chon cua ban: ");
        int luaChon = input.nextInt();

        String loaiSach;

        switch (luaChon) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Lua chon khong hop le";
        }

        // Tính tiền nhập kho như bài tuần 3
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n--- Thong tin sach ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("Phan loai gia: " + phanLoaiGia);
        System.out.println("Tinh trang ton kho: " + tinhTrangTonKho);
        System.out.printf("Don gia: %.2f%n", donGia);
        System.out.println("So luong: " + soLuong);
        System.out.printf("Thanh tien: %.2f%n", thanhTien);
        System.out.printf("Phi van chuyen: %.2f%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %.2f%n", tongTienNhap);

        input.close();
    }
}