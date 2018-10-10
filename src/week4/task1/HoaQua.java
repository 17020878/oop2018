package week4.task1;

public class HoaQua {

    //TODO: Khai báo các thuộc tính

    private String name;
    private int price;
    private String XuatXu;

    //TODO: tạo contructor

    public HoaQua(String name, int price, String XuatXu) {
    this.name = name;
    this.price = price;
    this.XuatXu = XuatXu;
    }

    public HoaQua() {

    }

    //TODO: tạo getter setter cho các thuộc tính

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        XuatXu = xuatXu;
    }
}





