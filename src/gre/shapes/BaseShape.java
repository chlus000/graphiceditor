package gre.shapes;

import gre.palette.BasePalette;
import java.awt.Graphics;


public abstract class BaseShape {
    //public BaseButton(String name){
        //super(name);
    //}
    
    public void addCoordinate(int x, int y){  
    }
    
    public void putCanvasCoordinate(int x, int y){
    }
    
    public void paintShape(Graphics g){}
    public void delLastCoordinate(){}
    public void setNColor(BasePalette bp){}
}
