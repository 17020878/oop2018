package week4.task2;

class Rectangle extends Shape{
    //TODO: khai báo thuộc tính
    double Width = 1.0;
    double Length = 1.0;

    //TODO: tạo contructor
    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        Width = width;
        Length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        Width = width;
        Length = length;
    }

    //TODO: tạo getter, setter cho mỗi thuộc tính
    public double getWidth() {
        return Width;

    }

    public double getLength() {
        return Length;

    }

    public void setWidth(double width) {
        Width = width;
    }

    public void setLength(double length) {
        Length = length;
    }

    //TODO: viết phương thức tính diện tích và chu vi
    /**
     * hàm setArea() tình diện tích hình chữ nhật
     * @return diện tích hình chữ nhật
     */
    public double setArea(){
        return Width*Length;
    }

    public double Perimeter(){
        return 2*(Width+Length);
    }

    @Override
    public String toString() {
        return "Rectangle{ " + "color=" + color  + ", filled=" + filled + ", Width=" + Width + ", Length=" + Length + " }";
    }
}

