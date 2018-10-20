package week5_6;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

class Layer extends JPanel {
    ArrayList<Shape> layer = new ArrayList<>();
    private Graphics g = this.getGraphics();

    public Layer(ArrayList<Shape> layer) {
        this.layer = layer;
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }

    public Layer() {
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }

    void removeRectangle(){
        for(Shape shape : layer){
            if(shape instanceof Rectangle) layer.remove(shape);
        }
    }
    void removeCircle(){
        for(Shape shape : layer){
            if(shape instanceof Circle) layer.remove(shape);
        }
    }
}
