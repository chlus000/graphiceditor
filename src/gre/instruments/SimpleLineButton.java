package gre.instruments;

import gre.shapes.BaseShape;
import gre.shapes.SimpleLine;


public class SimpleLineButton extends BaseButton{
    BaseShape bs=new SimpleLine();

    public SimpleLineButton(String name) {
        super(name);
    }
    
    public BaseShape getShape(){
        return new SimpleLine();
    }
}
