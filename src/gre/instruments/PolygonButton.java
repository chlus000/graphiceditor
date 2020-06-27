package gre.instruments;

import gre.shapes.BaseShape;
import gre.shapes.Polygon;


public class PolygonButton extends BaseButton{
    BaseShape bs=new Polygon();

    public PolygonButton(String name) {
        super(name);
    }
    
    public BaseShape getShape(){
        return new Polygon();
    }
}
