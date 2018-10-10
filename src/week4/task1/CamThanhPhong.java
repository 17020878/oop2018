package week4.task1;

public class CamThanhPhong extends QuaCam{
    //TODO: bổ sung thuộc tính

    int SoLuong;

    public CamThanhPhong(String name, int price, String xuatxu, String color, int SoLuong)
    {
        super(name, price, xuatxu,color);
        this.SoLuong = SoLuong;
    }
    public CamThanhPhong(String color, int SoLuong)
    {
        super(color);
        this.SoLuong = SoLuong;
    }
    public CamThanhPhong(int SoLuong)
    {
        this.SoLuong = SoLuong;
    }
    public CamThanhPhong() {

    }



    //TODO: tạo getter setter cho các thuộc tính

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong)
    {
        this.SoLuong = SoLuong;
    }
}
