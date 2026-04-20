package thigk2.nguyentruongson;

public class DuLich {
    private String tenDuLich;
    private String tenDiaChi;
    private int idAnhMinhHoa;
    //Tạo

    public DuLich(String tenDuLich, String tenDiaChi, int idAnhMinhHoa) {
        this.tenDuLich = tenDuLich;
        this.tenDiaChi = tenDiaChi;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }


    //Các getter setter


    public String getTenDuLich() {
        return tenDuLich;
    }

    public void setTenDuLich(String tenDuLich) {
        this.tenDuLich = tenDuLich;
    }

    public String getTenDiaChi() {
        return tenDiaChi;
    }

    public void setTenDiaChi(String tenDiaChi) {
        this.tenDiaChi = tenDiaChi;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
