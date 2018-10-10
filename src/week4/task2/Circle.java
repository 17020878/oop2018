package week4.task2;

/**
 * lớp Circle kế thừa lớp Shape
 */
class Circle extends Shape{
    //TODO: khai báo các thuộc tính

    double radius = 1.0;
    private static final double PI = 3.14;

    //TODO: tạo contructor
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //TODO: tạo getter, setter cho mỗi thuộc tính
    public double getRadius() {

        return radius; }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //TODO: viết phương thức tính diện tích và chu vi
    //Diện tích
    public double getArea(){
        return PI*radius*radius;
    }
    //Chu vi
    public double Perimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }

}
