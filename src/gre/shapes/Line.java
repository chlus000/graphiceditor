package gre.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;


public class Line extends BaseShape{
    private ArrayList<Integer> x = new ArrayList<>(); 
    private ArrayList<Integer> y = new ArrayList<>();
    private Color color;
    private int[] px,py;
    private List<Point2D> coordinates=new ArrayList<Point2D>();
    
    @Override
    public void SetColor(Color color){
        this.color=color;
    }
    
    @Override
    public void addCoordinate(Point2D point){
        this.coordinates.add(point);
        this.x.add((int)point.getX());
        this.y.add((int)point.getY());
    }
    
    @Override
    public void putMoveCoordinate(Point2D point){
        this.coordinates.set(this.coordinates.size()-1,point);
        this.x.set(this.x.size()-1,(int)point.getX());
        this.y.set(this.y.size()-1,(int)point.getY());
    }
    
    @Override
    public void putCanvasCoordinate(Point2D point){
        this.addCoordinate(point);
    }
    
    @Override
    public void paintShape(Graphics g){
        g.setColor(color);
        px=new int[x.size()];
        py=new int[y.size()];
        for (int i=0; i<x.size ();i++){
            px[i]=x.get(i);
            py[i]=y.get(i);
        }
        g.drawPolyline(px, py, x.size());
    }

    @Override
    public String getType() {
        return "Polyline";
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
        for (int i=0; i<points.size();i++){
            addCoordinate(points.get(i));
        }
    }
    
    
}
