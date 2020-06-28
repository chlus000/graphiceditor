package gre.instruments;

import gre.shapes.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class SaveProject extends JButton{
    SaveProject(Queue q){
        super("Save Project");
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
    }
}
