package nts.cntt2.th8_tuychinhlv;

public class MonAn {
    private String tenMonAn;
    private float donGia;
    private  String moTaMonAn;
    private int idAnhMinhHoa;
    //Tạo

    public MonAn(String tenMonAn, float donGia, String moTaMonAn, int idAnhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTaMonAn = moTaMonAn;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
    //Các getter setter

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMoTaMonAn() {
        return moTaMonAn;
    }

    public void setMoTaMonAn(String moTaMonAn) {
        this.moTaMonAn = moTaMonAn;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
