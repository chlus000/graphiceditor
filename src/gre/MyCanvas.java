
package gre;

import gre.shapes.Queue;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.*;

public class MyCanvas extends JPanel
{
    //Integer mx;
    //Integer my;
    MyCanvas mcan;
    BufferedImage buf=null;
    Graphics buffer=null;
    int width=0;
    int height=0;
    Queue q=null;
    
    
    public MyCanvas(int width, int height, Queue q){
        this();
        this.width=width;
        this.height=height;
        this.q=q;
        buf=new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        buffer=buf.getGraphics();
        buffer.setColor(Color.white);
        buffer.fillRect(0,0,width,height);
    }
    public MyCanvas()
    {  
        super();
        mcan=this;
        this.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //mx=e.getX();
                //my=e.getY();
                q.getLastShape().addCoordinate(e.getX(),e.getY());
                mcan.paintToBuffer();
                mcan.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });     
        this.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent e) {
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //mx=e.getX();
                //my=e.getY();
                q.getLastShape().putCanvasCoordinate(e.getX(),e.getY());
                mcan.paintToBuffer();
                mcan.repaint();
            }
            
        });
    }
    
    public void paintToBuffer(){
        buffer.setColor(Color.white);
        buffer.fillRect(0, 0, 650, 550);
        buffer.setColor(Color.black);
        q.paintShapes(buffer);
    }
    
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(buf, 0, 0, mcan);
        //g.setColor(Color.white);
        //g.fillRect(60,80,850,550);
    }
    
}
