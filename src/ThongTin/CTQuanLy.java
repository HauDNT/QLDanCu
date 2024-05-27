package ThongTin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CTQuanLy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoGiaDinh HoGDMoi = new HoGiaDinh();
        KhuPho KP = new KhuPho();

        System.out.print("-Hay nhap so ho gia dinh muon tao thong tin: 1234");
        int soHoGD = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < soHoGD; i++) {
            System.out.println("\n---Nhap vao thong tin ho gia dinh thu " + (i + 1) + "---");
            KP.themHoGDVaoKP(HoGDMoi);
        }

        System.out.println("\n---DANH SACH HO GIA DINH HIEN O TRONG KHU PHO---");
        KP.xuatDSHoGDKP();
    }
}