package week5_6;

import java.awt.*;

class Circle extends Shape {
    private Point point;
    private double radius;

    public Circle(Point point, double radius, Color color, Point direction) {
        this.color = color;
        this.point = point;
        this.radius = radius;
        this.direction = direction;
    }

    public Circle() {
        super();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(point.getX(), point.getY(), (int) radius , (int) radius);

    }

    @Override
    public void move() {
        point.setX(point.getX() + direction.getX());
        point.setY(point.getY() + direction.getY());

    }

    @Override
    public void handle()
    {
        if(point.getX()-radius == 0 || point.getX()+radius == 500) direction.setX(this.direction.getX()*(-1));
        if(point.getY()-radius == 0 || point.getY()+radius == 500) direction.setY(this.direction.getY()*(-1));
    }
}
