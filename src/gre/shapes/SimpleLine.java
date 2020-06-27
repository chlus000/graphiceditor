package gre.shapes;

import gre.palette.BasePalette;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class SimpleLine extends BaseShape{
    ArrayList<Integer> y = new ArrayList<>();
    ArrayList<Integer> x = new ArrayList<>(); 
    int xp, yp;
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
        for (int i=1;i<x.size();i+=2){
            g.drawLine(x.get(i-1),y.get(i-1), x.get(i), y.get(i));
        };
        if ((!x.isEmpty())& (x.size()%2!=0) & xp!=0){
            g.drawLine(x.get(x.size()-1),y.get(y.size()-1),xp,yp);
        } 
    }
    
    public void setNColor(BasePalette bp){
        this.r=bp.getR();
        this.gr=bp.getG();
        this.b=bp.getB();
    }
    
    public void delLastCoordinate(){
        if (!x.isEmpty() & x.size()%2==1){
            x.remove(x.size()-1);
            y.remove(y.size()-1);
        }
        if (xp!=0) {
            xp=0;
            yp=0;
        }
    }
}
