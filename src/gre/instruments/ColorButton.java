
package gre.instruments;

import gre.palette.BasePalette;
import gre.shapes.BaseShape;
import gre.shapes.*;

public class ColorButton extends BaseButton {
    //BasePalette bp = new BasePalette();
    
    public ColorButton(String name){
        super(name);
    }
    
   /* public BasePalette getColor(){
        return new BasePalette();
    }*/
    
    public BaseShape createNewShape(BaseShape or){ //добавить остальные фигуры
        if (or instanceof Line) return new Line();
        if (or instanceof SimpleLine) return new SimpleLine();
        if (or instanceof Rect) return new Rect();
        if (or instanceof Oval) return new Oval();
        if (or instanceof Polygon) return new Polygon();
        return null;    
    }
}
