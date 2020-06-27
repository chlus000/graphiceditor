package gre.instruments;

import gre.shapes.BaseShape;
import gre.shapes.Rect;

public class RectButton extends BaseButton{
    BaseShape bs=new Rect();

    public RectButton(String name) {
        super(name);
    }
    
    public BaseShape getShape(){
        return new Rect();
    }
}
