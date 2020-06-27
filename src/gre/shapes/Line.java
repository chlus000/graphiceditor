package gre.shapes;

import gre.palette.BasePalette;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Line extends BaseShape{
    ArrayList<Integer> x = new ArrayList<>(); 
    ArrayList<Integer> y = new ArrayList<>();
    int px,py;
    int r, gr, b;
    
    @Override
    public void addCoordinate(int x, int y){
        this.x.add(x);
        this.y.add(y);
    }
    
    @Override
    public void putCanvasCoordinate(int x, int y){
        px=x;
        py=y;
    }
    
    @Override
    public void paintShape(Graphics g){
        g.setColor(new Color(r,gr,b));
        for (int i=1; i<x.size ();i++){
            g.drawLine(x.get(i-1), y.get(i-1), x.get(i), y.get(i));
        }
        if (!x.isEmpty() & px!=0){
            g.drawLine(x.get(x.size()-1), y.get(y.size()-1), px, py);
        }
    }
    
    @Override
    public void setNColor(BasePalette bp){
        this.r=bp.getR();
        this.gr=bp.getG();
        this.b=bp.getB();
    }
    
    @Override
    public void delLastCoordinate(){
        if (px!=0) {
            px=0;
            py=0;
        }
    }
}
