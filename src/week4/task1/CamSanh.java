package week4.task1;

public class CamSanh extends QuaCam{
    //TODO: bổ sung thuộc tính
    int NgayNhap;

    public CamSanh(String name, int price, String xuatxu,String color, int NgayNhap)
    {
        super(name, price, xuatxu,color);
        this.NgayNhap = NgayNhap;
    }
    public CamSanh(String color, int NgayNhap)
    {
        super(color);
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

    public void setNgayNhap(int NgayNhap)
    {
        this.NgayNhap = NgayNhap;
    }
}

