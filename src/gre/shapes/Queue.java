package gre.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Queue {
    ArrayList<BaseShape> shapes=new ArrayList<>();
    Color color;
    
    public int getSize(){
        return shapes.size();
    }
    
    public void addShape(BaseShape bs){
        bs.SetColor(this.color);
        shapes.add(bs);
    }
    
    public void changeColor(Color color){
        this.color=color;
    }
    
    
    public BaseShape getLastShape(){
        if (shapes.isEmpty()) return null;
        return shapes.get(shapes.size()-1);
    }
    
    public void paintShapes(Graphics g){
        for (int i=0; i<shapes.size ();i++){
            shapes.get(i).paintShape(g);
        }
    }
}
