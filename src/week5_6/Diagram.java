package week5_6;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

public class Diagram extends JFrame{
    private static final int max_height = 500;
    private static final int max_width = 500;
    ArrayList<Layer> diagram = new ArrayList<>();
    public Diagram(ArrayList<Layer> diagram) {
        this.diagram = diagram;
        this.setBounds(500,150,max_width,max_height);
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Diagram() {
        this.setBounds(500,150,max_width,max_height);
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void removeCircle(){
        for(Layer layer : diagram){
            layer.removeCircle();
        }
    }
}