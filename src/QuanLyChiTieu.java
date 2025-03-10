import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChiTieu {
    private ArrayList<ChiTieu> listChiTieu = new ArrayList<>();
    private ArrayList<ThuNhap> listThuNhap = new ArrayList<>();

    public void addChiTieu(ChiTieu chiTieu) {
        listChiTieu.add(chiTieu);
    }

    public void addThuNhap(ThuNhap thuNhap) {
        listThuNhap.add(thuNhap);
    }

    public void insertChiTieu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap thong tin chi tieu: ");
            System.out.println("Nhap date: ");
            String date = scanner.nextLine();
            System.out.println("Nhap decription: ");
            String decription = scanner.nextLine();
            System.out.println("Nhap money: ");
            double money = scanner.nextDouble();
            System.out.println("Nhap category: ");
            String category = scanner.nextLine();
            addChiTieu(new ChiTieu(decription, money, date, category));

            System.out.println("Ban co muon nhap tiep khong? (Y/N):");
            String tieptuc = scanner.nextLine();
            if (tieptuc.equalsIgnoreCase("N")) break;
        }

    }

    public void insertThuNhap() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap thong tin thu nhap: ");
            System.out.println("Nhap date: ");
            String date = scanner.nextLine();
            System.out.println("Nhap incomesource: ");
            String incomesource = scanner.nextLine();
            System.out.println("Nhap money: ");
            double money = scanner.nextDouble();
            System.out.println("Nhap description: ");
            String description = scanner.nextLine();
            addThuNhap(new ThuNhap(money, date, incomesource, description));
            System.out.println("Ban co muon nhap tiep khong? (Y/N):");
            String tieptuc = scanner.nextLine();
            if (tieptuc.equalsIgnoreCase("N")) break;
        }
    }

    public void showChiTieu() {
        System.out.println("==== Lich su chi tieu ====");
        for (ChiTieu chiTieu : listChiTieu) {
            System.out.println(chiTieu.getDecription() + " : " + chiTieu.getMoney() + " : " + chiTieu.getDate() + " : " + chiTieu.getCategory());
        }
    }

    public void showThuNhap() {
        System.out.println("==== Lich su thu nhap ====");
        for (ThuNhap thuNhap : listThuNhap) {
            System.out.println(thuNhap.getIncomesource() + " : " + thuNhap.getMoney() + " : " + thuNhap.getDate() + " : " + thuNhap.getDescription());
        }

    }

    public void xoaChiTieu(int index) {
        listChiTieu.remove(index);
    }

    public void suaChiTieu(int index, ChiTieu chiTieu) {
        listChiTieu.set(index, chiTieu);
    }
    public void xoaThuNhap(int index) {
        listThuNhap.remove(index);
    }
    public void suaThuNhap(int index, ThuNhap thuNhap) {
        listThuNhap.set(index, thuNhap);
    }


}
