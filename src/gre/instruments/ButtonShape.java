package gre.instruments;

import gre.shapes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonShape extends BaseButton{
    
    public ButtonShape(String name, Queue q) {
        super(name);
        this.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                switch(name){
                    case "Polyline":
                        q.addShape(new Line());
                        break;
                    case "Rectangle":
                        q.addShape(new Rect());
                        break;
                    case "Oval":
                        q.addShape(new Oval());
                        break;
                    case "Polygon":
                        q.addShape(new Polygon());
                        break;
                } 
            }  
        });
    }
    
}
