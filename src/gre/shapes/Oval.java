
package gre.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Oval extends BaseShape{
    int y ;
    int x ; 
    int xp, yp;
    int r, gr, b;
    Color color;
    private List<Point2D> coordinates=new ArrayList<Point2D>();
    
    @Override
    public void SetColor(Color color){
        this.color=color;
    }
    
    @Override
    public void addCoordinate(Point2D point){
        this.coordinates.add(point);
        this.x=((int)point.getX());
        this.y=((int)point.getY());
    }
    
    @Override
    public void putCanvasCoordinate(Point2D point){
        this.coordinates.add(point);
        xp=(int)point.getX();
        yp=(int)point.getY();
    }
    
    @Override
    public void putMoveCoordinate(Point2D point){
        xp=(int)point.getX();
        yp=(int)point.getY();
    }
    
    
    @Override
    public void paintShape(Graphics g){
        g.setColor(color);
        g.drawOval(Math.min(x,xp), Math.min(y,yp), Math.abs(x-xp), Math.abs(y-yp));
    }
    

}
