
package gre;

import gre.shapes.Queue;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class MyCanvas extends JPanel
{
    private MyCanvas mcan;
    private BufferedImage buf=null;
    private Graphics buffer=null;
    private int width=0;
    private int height=0;
    private Queue q=null;
    
    
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
                if (q.getLastShape()!=null){
                    q.getLastShape().addCoordinate(e.getPoint());
                    q.getLastShape().putMoveCoordinate(e.getPoint());
                    mcan.paintToBuffer();
                    mcan.repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (q.getLastShape()!=null){
                    q.getLastShape().putCanvasCoordinate(e.getPoint());
                    mcan.paintToBuffer();
                    mcan.repaint();
                }
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
                if (q.getLastShape()!=null){
                    q.getLastShape().putMoveCoordinate(e.getPoint());
                    mcan.paintToBuffer();
                    mcan.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        });
    }
    
    public void paintToBuffer(){
        buffer.setColor(Color.white);
        buffer.fillRect(0, 0, width, height);;
        buffer.setColor(Color.black);
        q.paintShapes(buffer);
    }
    
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(buf, 0, 0, mcan);
    }
    
    public BufferedImage getBuf(){
       return buf; 
    }
    
    public void changeColor (Color color){
        if (q.getLastShape()!=null){
            q.getLastShape().SetColor(color);
        }
        q.changeColor(color);
    }
    
}
