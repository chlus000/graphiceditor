package gre.instruments;

import gre.shapes.*;
import javax.swing.JButton;

public class LineButton extends BaseButton{
    BaseShape bs=new Line();
    
    public LineButton(String name){
        super(name);
    }
    
    public BaseShape getShape(){
        return new Line();
    }
}
