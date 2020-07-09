package gre.instruments;

import Save.Loader;
import gre.MyCanvas;
import gre.shapes.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class LoadProject extends JButton{
    public LoadProject(Queue q, MyCanvas jp){
        super("Load");
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Loader(q,jp);
                } catch (IOException ex) {
                    Logger.getLogger(SaveProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }
}
