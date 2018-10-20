package week5_6;

import java.awt.*;

public abstract class Shape {
    protected Color color ;
    protected Point direction;

    public Color getColor(Color white)
    {
        return color;
    }
    public void setColor(Color color)
    {
        this.color = color;
    }
    /**
     * vẽ hình
     * @param g đồ họa
     */
    public abstract void draw(Graphics g);
    /**
     * di chuyển hình
     */
    public abstract void move();
    /**
     * xử lí va chạm biên
     */
    public abstract void handle();
}



