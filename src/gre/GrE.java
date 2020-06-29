
package gre;

import gre.instruments.*;
import gre.shapes.Queue;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GrE extends JFrame{
    
    private MyCanvas jp;
    private Queue q;
    private JFrame fr;
    
    public GrE()
    {
        super("Графический редактор Лапоха и Лутошкина");
        this.setSize(800,700);
        fr=this;
        this.setVisible(true);
        this.setLayout(null);
        this.q=new Queue();
        jp=new MyCanvas(650,550,q);
        jp.setVisible(true);
        jp.setBounds(60,80,650,550);
        
        JButton Line=new ButtonShape("Polyline",q);
        Line.setBounds(20, 20, 90,30);
        
        JButton Rect=new ButtonShape("Rectangle",q);
        Rect.setBounds(120, 20, 110,30);
        
        JButton Oval=new ButtonShape("Oval",q);
        Oval.setBounds(240, 20, 80,30);
        
        JButton Polygon=new ButtonShape("Polygon",q);
        Polygon.setBounds(330, 20, 100,30);
        
        JButton blue=new ColorButton(Color.BLUE,q);
        blue.setBounds(20, 80, 30,30);
        JButton red=new ColorButton(Color.RED,q);
        red.setBounds(20, 110, 30,30);
        JButton green=new ColorButton(Color.GREEN,q);
        green.setBounds(20, 140, 30,30);
        JButton black=new ColorButton(Color.BLACK,q);
        black.setBounds(20, 170, 30,30);
        JButton yellow=new ColorButton(Color.YELLOW,q);
        yellow.setBounds(20, 200, 30,30);
        JButton gray=new ColorButton(Color.GRAY,q);
        gray.setBounds(20, 230, 30,30);
        JButton magenta=new ColorButton(Color.MAGENTA,q);
        magenta.setBounds(20, 260, 30,30);
        
        JButton save=new SaveProject(q);
        save.setBounds(440, 20, 130,30);
        JButton savepng=new SaveButton(jp);
        savepng.setBounds(580, 20, 90,30);
        JButton load=new LoadProject(q,jp);
        load.setBounds(680, 20, 90,30);
        
        this.add(jp);
        this.add(blue);
        this.add(red);
        this.add(green);
        this.add(black);
        this.add(yellow);
        this.add(gray);
        this.add(magenta);
        this.add(Line);
        this.add(Rect);
        this.add(Oval);
        this.add(Polygon);
        this.add(save);
        this.add(savepng);
        this.add(load);
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
    }  
    
    public static void main(String args[]) 
    {
        GrE app=new GrE();
        app.setAlwaysOnTop(true);
        app.setEnabled(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

