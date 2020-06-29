
package gre.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


public class Rect extends BaseShape{
    private int y ;
    private int x ; 
    private int xp, yp;
    private Color color;
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
        g.drawRect(Math.min(x,xp), Math.min(y,yp), Math.abs(x-xp), Math.abs(y-yp));
    
    }
    
    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public List<Point2D> getPoints() {
        return coordinates;
    }

    @Override
    public Color getColor() {
       return color;
    }
    
    @Override
    public void setCoordinates(List<Point2D> points) {
        addCoordinate(points.get(0));
        putCanvasCoordinate(points.get(points.size()-1));
    }
}