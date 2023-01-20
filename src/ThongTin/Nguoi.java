package ThongTin;

import java.util.Scanner;

public class Nguoi {
    String hoTen;
    int tuoi;
    String ngheNghiep;
    String CMND;    //(Số CMND là duy nhất cho mỗi người).

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String CMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.CMND = CMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    Nguoi TVMoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t+Ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("\t+Tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("\t+Nghe nghiep: ");
        String ngheNghiep = sc.nextLine();
        System.out.print("\t+So CMND: ");
        String CMND = sc.nextLine();

        return new Nguoi(hoTen, tuoi, ngheNghiep, CMND);
    }

    @Override
    public String toString() {
        return "\n\t\t* HoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", CMND='" + CMND;
    }
}