import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1: Nhập n sách
        System.out.print("Nhap so sach: ");
        int n = sc.nextInt();

        String[] ma = new String[n];
        String[] ten = new String[n];
        int[] soLuong = new int[n];
        double[] donGia = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sach thu " + (i + 1) + ":");

            System.out.print("Ma sach: ");
            ma[i] = sc.next();

            System.out.print("Ten sach: ");
            ten[i] = sc.next();

            System.out.print("So luong: ");
            soLuong[i] = sc.nextInt();

            System.out.print("Don gia: ");
            donGia[i] = sc.nextDouble();
        }

        int chon;

        // Bài 3: Menu lặp đến khi chọn 0
        do {
            System.out.println("\n1. Tinh tong so luong va gia tri sach");
            System.out.println("2. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();

            if (chon == 1) {
                int tongSoLuong = 0;
                double tongGiaTri = 0;

                for (int i = 0; i < n; i++) {
                    tongSoLuong = tongSoLuong + soLuong[i];
                    tongGiaTri = tongGiaTri + soLuong[i] * donGia[i];
                }

                System.out.println("Tong so luong: " + tongSoLuong);
                System.out.println("Tong gia tri: " + tongGiaTri);

            } else if (chon == 2) {
                // Bài 4: Tìm sách theo mã
                System.out.print("Nhap ma sach can tim: ");
                String maTim = sc.next();

                boolean timThay = false;

                for (int i = 0; i < n; i++) {
                    if (ma[i].equals(maTim)) {
                        System.out.println("Ten sach: " + ten[i]);
                        System.out.println("So luong: " + soLuong[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        timThay = true;
                    }
                }

                if (timThay == false) {
                    System.out.println("Khong tim thay sach.");
                }

            } else if (chon == 0) {
                System.out.println("Da thoat.");
            } else {
                System.out.println("Lua chon khong hop le.");
            }

        } while (chon != 0);

        sc.close();
    }
}
