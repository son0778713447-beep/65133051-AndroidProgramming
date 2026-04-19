package nts.cntt2.ontapgk2;

public class BaiThuoc {
    String baiThuocImageFileName;
    String baiThuocCaption;
    String baiThuocThoiGian;
    //Tạo


    public BaiThuoc(String baiThuocImageFileName, String baiThuocCaption, String baiThuocThoiGian) {
        this.baiThuocImageFileName = baiThuocImageFileName;
        this.baiThuocCaption = baiThuocCaption;
        this.baiThuocThoiGian = baiThuocThoiGian;
    }

    //Các getter setter

    public String getBaiThuocImageFileName() {
        return baiThuocImageFileName;
    }

    public void setBaiThuocImageFileName(String baiThuocImageFileName) {
        this.baiThuocImageFileName = baiThuocImageFileName;
    }

    public String getBaiThuocCaption() {
        return baiThuocCaption;
    }

    public void setBaiThuocCaption(String baiThuocCaption) {
        this.baiThuocCaption = baiThuocCaption;
    }

    public String getBaiThuocThoiGian() {
        return baiThuocThoiGian;
    }

    public void setBaiThuocThoiGian(String baiThuocThoiGian) {
        this.baiThuocThoiGian = baiThuocThoiGian;
    }
}