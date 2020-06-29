package gre.instruments;

import gre.GrE;
import gre.MyCanvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class SaveButton extends BaseButton {
    public SaveButton(MyCanvas jp){
        super("Save");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File f = new File("image.png");
                try {              
                    ImageIO.write(jp.getBuf(),"png", f);
                } catch (IOException ex) {
                    Logger.getLogger(GrE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
