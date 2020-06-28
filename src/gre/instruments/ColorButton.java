
package gre.instruments;

import gre.shapes.BaseShape;
import gre.shapes.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ColorButton extends JButton {

    public ColorButton(Color color, Queue q){
        super();
        this.setBackground(color);
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (q.getLastShape()!=null){
                    q.getLastShape().SetColor(color);
                }
                q.changeColor(color);
            }

        });
    }
}
