package week4.task1;

public class CamSanh extends HoaQua {
    //TODO: bổ sung thuộc tính
    private int NgayNhap;

    public CamSanh(String name, int price, String xuatxu, int NgayNhap)
    {
        super(name, price, xuatxu);
        this.NgayNhap = NgayNhap;
    }

    public CamSanh(int NgayNhap)
    {
        this.NgayNhap = NgayNhap;
    }
    public CamSanh()
    {

    }

    //TODO: tạo getter setter cho các thuộc tính

    public int getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.NgayNhap = ngayNhap;
    }
}

