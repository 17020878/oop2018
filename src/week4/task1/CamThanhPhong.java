package week4.task1;

public class CamThanhPhong extends HoaQua {
    //TODO: bổ sung thuộc tính

    private int SoLuong;

    public CamThanhPhong(String name, int price, String xuatxu, int SoLuong)
    {
        super(name, price, xuatxu);
        this.SoLuong = SoLuong;
    }

    public CamThanhPhong(int SoLuong)
    {
        this.SoLuong = SoLuong;
    }
    public CamThanhPhong()
    {

    }

    //TODO: tạo getter setter cho các thuộc tính

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        this.SoLuong = soLuong;
    }
}
