package gre.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;


public abstract class BaseShape implements Serializable{
    
    abstract public void addCoordinate(Point2D point);
    
    abstract public void putCanvasCoordinate(Point2D point);
    
    abstract public void paintShape(Graphics g);
    abstract public void SetColor(Color bp);

    abstract public void putMoveCoordinate(Point2D point);
    abstract public void setCoordinates(List<Point2D> points);
    
    abstract public String getType();
    abstract public List<Point2D> getPoints();
    abstract public Color getColor();
}
