package week4.task2;

/**
 * lớp hình vuông(Square) kế thừa lớp hình chứ nhật(rectangle)
 */
class Square extends Rectangle{
    //TODO: tạo contructor
    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }


    @Override
    public String toString() {
        return "Square{" + "color='" + color + '\'' + ", filled=" + filled + ", Side=" + Width + '}';
    }
}