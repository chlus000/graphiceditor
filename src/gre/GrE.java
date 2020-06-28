
package gre;

import gre.instruments.*;
import gre.shapes.Queue;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class GrE extends JFrame{
    
    MyCanvas jp;
    Queue q;
    JFrame fr;
    JLabel inform;
    JLabel inform2;
    JLabel inform3;
    Random rnd = new Random(System.currentTimeMillis());
    
    public GrE()
    {
        super("Графический редактор Лапоха и Лутошкина");
        this.setSize(800,700);
        fr=this;
        this.setVisible(true);
        this.setLayout(null);
        this.q=new Queue();
        inform = new JLabel("Пусто");
        inform.setVisible(true);
        inform.setBounds(60,52,500,25);
        inform2 = new JLabel("Пусто");
        inform2.setVisible(true);
        inform2.setBounds(200,52,300,25);
        inform3 = new JLabel("Пусто");
        inform3.setVisible(true);
        inform3.setBounds(400,52,200,25);
        jp=new MyCanvas(650,550,q);
        jp.setVisible(true);
        jp.setBounds(60,80,650,550);
        
        JButton Line=new ButtonShape("Polyline",q);
        Line.setBounds(20, 20, 120,30);
        
        JButton Rect=new ButtonShape("Rectangle",q);
        Rect.setBounds(160, 20, 150,30);
        
        JButton Oval=new ButtonShape("Oval",q);
        Oval.setBounds(330, 20, 100,30);
        
        JButton Polygon=new ButtonShape("Polygon",q);
        Polygon.setBounds(450, 20, 100,30);
        
        JButton blue=new ColorButton(Color.BLUE,q);
        blue.setBounds(20, 80, 30,30);
        JButton red=new ColorButton(Color.RED,q);
        red.setBounds(20, 110, 30,30);
        JButton green=new ColorButton(Color.GREEN,q);
        green.setBounds(20, 140, 30,30);
        this.add(jp);
        this.add(inform);
        this.add(inform2);
        this.add(inform3);
        this.add(blue);
        this.add(red);
        this.add(green);
        this.add(Line);
        this.add(Rect);
        this.add(Oval);
        this.add(Polygon);
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

