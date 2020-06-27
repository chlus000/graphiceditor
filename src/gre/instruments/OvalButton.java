package gre.instruments;

import gre.shapes.BaseShape;
import gre.shapes.Oval;

public class OvalButton extends BaseButton{
    BaseShape bs=new Oval();

    public OvalButton(String name) {
        super(name);
    }
    
    public BaseShape getShape(){
        return new Oval();
    }
}
