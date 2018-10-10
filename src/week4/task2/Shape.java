package week4.task2;

/**
 * hình dạng (Shape)
 */
class Shape {
    //TODO: khai báo thuộc tính

    String color = "red";
    Boolean filled = true;

    //TODO: tạo contructor
    public Shape() {

    }

    public Shape(String color, Boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    //TODO: tạo getter, setter cho mỗi thuộc tính
    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}




