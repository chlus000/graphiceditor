package gre.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Point2D;


public abstract class BaseShape {
    
    abstract public void addCoordinate(Point2D point);
    
    abstract public void putCanvasCoordinate(Point2D point);
    
    abstract public void paintShape(Graphics g);
    abstract public void SetColor(Color bp);

    abstract public void putMoveCoordinate(Point2D point);
}
