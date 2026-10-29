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

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n--- Thong tin sach ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %.2f%n", donGia);
        System.out.println("So luong: " + soLuong);
        System.out.printf("Thanh tien: %.2f%n", thanhTien);
        System.out.printf("Phi van chuyen (5%%): %.2f%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %.2f%n", tongTienNhap);

        input.close();
    }
}