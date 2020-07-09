package gre.instruments;

import Save.Saver;
import gre.shapes.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class SaveProject extends JButton{
    public SaveProject(Queue q){
        super("Save Project");
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Saver(q);
                } catch (IOException ex) {
                    Logger.getLogger(SaveProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }
}
