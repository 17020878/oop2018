package week4.task1;

public class QuaCam extends HoaQua{
    //TODO: bổ sung thuộc tính
    private String color;

    public QuaCam(String name, int price, String xuatxu, String color)
    {
        super(name, price, xuatxu);
        this.color = color;
    }
    public QuaCam(String color)
    {
        this.color = color;
    }
    public QuaCam()
    {

    }

    //TODO: tạo getter setter cho các thuộc tính

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
