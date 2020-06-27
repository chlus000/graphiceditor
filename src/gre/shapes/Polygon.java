package gre.shapes;

import gre.palette.BasePalette;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Polygon extends BaseShape{
    ArrayList<Integer> y = new ArrayList<>();
    ArrayList<Integer> x = new ArrayList<>(); 
    int xp, yp,fx,fy;
    int r, gr, b;
    
    @Override
    public void addCoordinate(int x, int y){
        this.y.add(y);
        this.x.add(x);
    }
    
    @Override
    public void putCanvasCoordinate(int x, int y){
        xp=x;
        yp=y;
    }
    
    
    @Override
    public void paintShape(Graphics g){
        g.setColor(new Color(r,gr,b));
        for (int i=1; i<x.size ();i++){
            g.drawLine(x.get(i-1), y.get(i-1), x.get(i), y.get(i));
        }
        if ((!x.isEmpty())&(xp!=0)){
            g.drawLine(x.get(x.size()-1), y.get(y.size()-1), xp, yp);
        }
    }
    
    @Override
    public void delLastCoordinate(){
        fx=x.get(0);
        fy=y.get(0);
        if (xp!=0) {
            xp=fx;
            yp=fy;
        }
    }
    
    public void setNColor(BasePalette bp){
        this.r=bp.getR();
        this.gr=bp.getG();
        this.b=bp.getB();
    }
}
