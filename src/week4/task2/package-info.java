/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;

class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println(shape.filled);
        System.out.println("Dien tich hinh tron = " + circle.getArea());
        System.out.println("chu vi hinh vuong  = " + square.Perimeter());
        System.out.println("dien tich hinh chu nhat = " + rectangle.setArea());
        System.out.println("   ddf" + rectangle.toString());
    }
}