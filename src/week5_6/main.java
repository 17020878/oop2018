package week5_6;

import java.awt.*;
public class main {
    public static void main(String[] args) {
        Point rectangle_point = new Point(30, 30);
        Point circle_point = new Point(100, 60);
        Point direction2 = new Point(1, 1);
        Point direction1 = new Point(2, 2);
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        Rectangle rectangle = new Rectangle(rectangle_point, 60, 80, Color.BLUE, direction1);
        Circle circle = new Circle(circle_point, 40, Color.BLUE, direction2);
        diagram.diagram.add(layer);
        layer.layer.add(circle);
        layer.layer.add(rectangle);
        diagram.add(layer);
        Graphics g = diagram.getGraphics();
        while (true) {
            for (Shape shape : layer.layer) {
                shape.handle();
                shape.setColor(Color.WHITE);
                shape.draw(g);
                shape.setColor(Color.BLUE);
                shape.move();
                shape.draw(g);
            }
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

