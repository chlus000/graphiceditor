package gre.shapes;

import gre.instruments.LineButton;
import gre.palette.BasePalette;
import java.awt.Graphics;
import java.util.ArrayList;

public class Queue {
    ArrayList<BaseShape> shapes=new ArrayList<>();
    ArrayList<BasePalette> color = new ArrayList<>();
    
    public int getSize(){
        return shapes.size();
    }
    
    public void addShape(BaseShape bs, BasePalette bp){
        shapes.add(bs);
        color.add(bp);
    }
    
    public void changeColor(BasePalette bp){
        color.set(color.size()-1, bp);
    }
    
    public BasePalette getLastColor(){
        if (shapes.isEmpty()) return null;
        return color.get(color.size()-1);
    }
    
    public BaseShape getLastShape(){
        if (shapes.isEmpty()) return null;
        return shapes.get(shapes.size()-1);
    }
    
    public void paintShapes(Graphics g){
        for (int i=0; i<shapes.size ();i++){
            shapes.get(i).setNColor(color.get(i));
            shapes.get(i).paintShape(g);
        }
       /* for (BaseShape bas: shapes ){
            bas.setColor(color.get)
            bas.paintShape(g);
        }*/
    }
}
