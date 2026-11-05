import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String ma;
    String ten;
    int soLuong;
    double donGia;

    Sach(String ma, String ten, int soLuong, double donGia) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
}

public class bai5 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> danhSachSach = new ArrayList<>();

    // Tim vi tri cua sach theo ma
    static int timViTri(String maCanTim) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).ma.equalsIgnoreCase(maCanTim)) {
                return i;
            }
        }
        return -1; // Khong tim thay
    }

    // 1. Them sach
    static void themSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        if (timViTri(ma) != -1) {
            System.out.println("Ma sach da ton tai.");
            return;
        }

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        double donGia = Double.parseDouble(sc.nextLine());

        Sach sachMoi = new Sach(ma, ten, soLuong, donGia);
        danhSachSach.add(sachMoi);

        System.out.println("Da them sach.");
    }

    // 2. Hien thi tat ca sach
    static void hienThiSach() {
        if (danhSachSach.size() == 0) {
            System.out.println("Danh sach sach dang rong.");
            return;
        }

        for (int i = 0; i < danhSachSach.size(); i++) {
            Sach sach = danhSachSach.get(i);

            System.out.println("\nSach thu " + (i + 1));
            System.out.println("Ma sach: " + sach.ma);
            System.out.println("Ten sach: " + sach.ten);
            System.out.println("So luong: " + sach.soLuong);
            System.out.println("Don gia: " + sach.donGia);
        }
    }

    // 3. Tim sach theo ma
    static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            Sach sach = danhSachSach.get(viTri);

            System.out.println("Ma sach: " + sach.ma);
            System.out.println("Ten sach: " + sach.ten);
            System.out.println("So luong: " + sach.soLuong);
            System.out.println("Don gia: " + sach.donGia);
        }
    }

    // 4. Xoa sach theo ma
    static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            danhSachSach.remove(viTri);
            System.out.println("Da xoa sach.");
        }
    }

    // 5. Sua sach theo ma
    static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            Sach sach = danhSachSach.get(viTri);

            System.out.print("Nhap ten moi: ");
            sach.ten = sc.nextLine();

            System.out.print("Nhap so luong moi: ");
            sach.soLuong = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap don gia moi: ");
            sach.donGia = Double.parseDouble(sc.nextLine());

            System.out.println("Da sua sach.");
        }
    }

    // 6. Tinh tong so luong sach
    static void tinhTongSoLuong() {
        int tongSoLuong = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {
            tongSoLuong = tongSoLuong + danhSachSach.get(i).soLuong;
        }

        System.out.println("Tong so luong sach: " + tongSoLuong);
    }

    // 7. Tinh tong gia tri sach
    static void tinhTongGiaTri() {
        double tongGiaTri = 0;

        for (int i = 0; i < danhSachSach.size(); i++) {
            Sach sach = danhSachSach.get(i);
            tongGiaTri = tongGiaTri + sach.soLuong * sach.donGia;
        }

        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }

    public static void main(String[] args) {
        int luaChon;

        do {
            System.out.println("\n===== MENU THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");

            luaChon = Integer.parseInt(sc.nextLine());

            if (luaChon == 1) {
                themSach();
            } else if (luaChon == 2) {
                hienThiSach();
            } else if (luaChon == 3) {
                timSach();
            } else if (luaChon == 4) {
                xoaSach();
            } else if (luaChon == 5) {
                suaSach();
            } else if (luaChon == 6) {
                tinhTongSoLuong();
            } else if (luaChon == 7) {
                tinhTongGiaTri();
            } else if (luaChon == 8) {
                System.out.println("Da thoat chuong trinh.");
            } else {
                System.out.println("Lua chon khong hop le.");
            }

        } while (luaChon != 8);

        sc.close();
    }
}