package ThongTin;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HoGiaDinh> DSHoGD;
    List<Nguoi> DSThanhVien;

    public KhuPho() {
        this.DSHoGD = new ArrayList<>();
    }

    public List<HoGiaDinh> getDSHoGD() {
        return DSHoGD;
    }

    public void setDSHoGD(List<HoGiaDinh> DSHoGD) {
        this.DSHoGD = DSHoGD;
    }

    public List<Nguoi> getDSThanhVien() {
        return DSThanhVien;
    }

    public void setDSThanhVien(List<Nguoi> DSThanhVien) {
        this.DSThanhVien = DSThanhVien;
    }

    public KhuPho(List<HoGiaDinh> DSHoGD, List<Nguoi> DSThanhVien) {
        this.DSHoGD = DSHoGD;
        this.DSThanhVien = DSThanhVien;
    }

    public void xuatDSHoGDKP() {
        this.DSHoGD.forEach(index -> System.out.println(index.toString()));
    }

    public void themHoGDVaoKP(HoGiaDinh HoGDMoi) {
        HoGDMoi = HoGDMoi.themHoGD();
        this.DSHoGD.add(HoGDMoi);
    }
}