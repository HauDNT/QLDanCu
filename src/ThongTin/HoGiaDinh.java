package ThongTin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoGiaDinh {
    int soThanhVien;
    String soNha;
    List<Nguoi> DSThanhVien;

    public HoGiaDinh() {
        this.DSThanhVien = new ArrayList<>();
    }

    public HoGiaDinh(int soThanhVien, String soNha, List<Nguoi> DSThanhVien) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.DSThanhVien = DSThanhVien;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public List<Nguoi> getDSThanhVien() {
        return DSThanhVien;
    }

    public void setDSThanhVien(List<Nguoi> DSThanhVien) {
        this.DSThanhVien = DSThanhVien;
    }

    HoGiaDinh themHoGD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Nhap thong tin cua ho gia dinh:");
        System.out.print("-So nha: ");
        String soNha = sc.nextLine();
        System.out.print("-So thanh vien: ");
        int soThanhVien = Integer.parseInt(sc.nextLine());
        DSThanhVien = new ArrayList<>(soThanhVien);
        Nguoi TV = new Nguoi();
        System.out.println("2.Nhap thong tin cua cac thanh vien:");
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("-Nhap thong tin cua thanh vien thu " + (i + 1) + ":");
            TV = TV.TVMoi();
            DSThanhVien.add(TV);
        }
        return new HoGiaDinh(soThanhVien, soNha, DSThanhVien);
    }

    @Override
    public String toString() {
        return "-HoGiaDinh {" +
                "\n\t+SoNha = '" + soNha + '\'' +
                "\n\t+SoThanhVien = " + soThanhVien +
                "\n\t+DSThanhVien " + DSThanhVien;
    }
}