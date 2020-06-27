
package gre;

import gre.instruments.*;
import gre.palette.BasePalette;
import gre.palette.CollectPalette;
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
    BasePalette bc;
    CollectPalette cp=new CollectPalette();
    Random rnd = new Random(System.currentTimeMillis());
    //JColorChooser tcc;
    
    public GrE()
    {
        super("Графический редактор Лапоха и Лутошкина");
        this.setSize(800,700);
        fr=this;
        this.setVisible(true);
        this.setLayout(null);
        this.q=new Queue();
        bc = new BasePalette(0,0,0);
       // bc.putNewPalette(0,0,0);
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
        JButton bLine = new LineButton("Полилиния");
        bLine.setVisible(true);
        bLine.setBounds(20, 20, 120,30);
        bLine.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                    q.getLastShape().delLastCoordinate();
                    }
                    
                    if (bLine instanceof LineButton){
                        q.addShape(((LineButton)bLine).getShape(),bc);
                    }
                    inform.setText("Полилиния");
                    inform2.setText("Уровень слоя "+q.getSize());
                    fr.repaint();
                }
            }
        );
        JButton bSimpLine = new SimpleLineButton("Линия");
        bSimpLine.setVisible(true);
        bSimpLine.setBounds(150, 20, 100,30);
        bSimpLine.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                    }
                    if (bSimpLine instanceof SimpleLineButton){
                        
                        q.addShape(((SimpleLineButton)bSimpLine).getShape(),bc);
                        
                    }
                    inform.setText("Линия");
                    inform2.setText("Уровень слоя "+q.getSize());
                    fr.repaint();
                }
            }
        );
        
        JButton brect = new RectButton("Прямоугольник");
        brect.setVisible(true);
        brect.setBounds(260, 20, 150,30);
        brect.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                    }
                    if (brect instanceof RectButton){
                        
                        q.addShape(((RectButton)brect).getShape(),bc);
                        
                    }
                    inform.setText("Прямоугольник");
                    inform2.setText("Уровень слоя "+q.getSize());
                    fr.repaint();
                }
            }
        );
        
        JButton boval = new OvalButton("Овал");
        boval.setVisible(true);
        boval.setBounds(420, 20, 100,30);
        boval.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                    }
                    if (boval instanceof OvalButton){
                        
                        q.addShape(((OvalButton)boval).getShape(),bc);
                        
                    }
                    inform.setText("Овал");
                    inform2.setText("Уровень слоя "+q.getSize());
                    fr.repaint();
                }
            }
        );
        
        JButton bpolygon = new PolygonButton("Полигон");
        bpolygon.setVisible(true);
        bpolygon.setBounds(530, 20, 100,30);
        bpolygon.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                    }
                    if (bpolygon instanceof PolygonButton){
                        
                        q.addShape(((PolygonButton)bpolygon).getShape(),bc);
                        
                    }
                    inform.setText("Полигон");
                    inform2.setText("Уровень слоя "+q.getSize());
                    fr.repaint();
                }
            }
        );
        
        JButton clr0 = new ColorButton("0");
        clr0.setVisible(true);
        clr0.setBounds(20, 80, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr0.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr0.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(0)); 
                    }
                    inform3.setText("Цвет: " +cp.getColorBut(0).getR()+", "+cp.getColorBut(0).getG()+", "+cp.getColorBut(0).getB());
                    inform2.setText("Уровень слоя "+q.getSize());
                    fr.repaint();
                }
            }
        );
        
        JButton clr1 = new ColorButton("1");
        clr1.setVisible(true);
        clr1.setBounds(20, 110, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr1.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr1.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(1)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(1).getR()+", "+cp.getColorBut(1).getG()+", "+cp.getColorBut(1).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr2 = new ColorButton("1");
        clr2.setVisible(true);
        clr2.setBounds(20, 140, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr2.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr2.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(2)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(2).getR()+", "+cp.getColorBut(2).getG()+", "+cp.getColorBut(2).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr3 = new ColorButton("1");
        clr3.setVisible(true);
        clr3.setBounds(20, 170, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr3.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr3.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(3)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(3).getR()+", "+cp.getColorBut(3).getG()+", "+cp.getColorBut(3).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr4 = new ColorButton("1");
        clr4.setVisible(true);
        clr4.setBounds(20, 200, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr4.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr4.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(4)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(4).getR()+", "+cp.getColorBut(4).getG()+", "+cp.getColorBut(4).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr5 = new ColorButton("1");
        clr5.setVisible(true);
        clr5.setBounds(20, 230, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr5.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr5.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(5)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(5).getR()+", "+cp.getColorBut(5).getG()+", "+cp.getColorBut(5).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr6 = new ColorButton("1");
        clr6.setVisible(true);
        clr6.setBounds(20,260, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr6.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr6.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(6)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(6).getR()+", "+cp.getColorBut(6).getG()+", "+cp.getColorBut(6).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr7 = new ColorButton("1");
        clr7.setVisible(true);
        clr7.setBounds(20, 290, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr7.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr7.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(7)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(7).getR()+", "+cp.getColorBut(7).getG()+", "+cp.getColorBut(7).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr8 = new ColorButton("1");
        clr8.setVisible(true);
        clr8.setBounds(20, 320, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr8.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr8.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(8)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(8).getR()+", "+cp.getColorBut(8).getG()+", "+cp.getColorBut(8).getB());
                    fr.repaint();
                }
            }
        );
        JButton clr9 = new ColorButton("1");
        clr9.setVisible(true);
        clr9.setBounds(20, 350, 30,30);
        bc = new BasePalette(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
        cp.addNewBut(bc);
        clr9.setBackground( new Color(bc.getR(),bc.getG(),bc.getB()));
        clr9.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if (q.getLastShape()!=null) {
                        q.getLastShape().delLastCoordinate();
                        q.addShape(((ColorButton)clr0).createNewShape(q.getLastShape()),cp.getColorBut(9)); 
                    }
                    inform2.setText("Уровень слоя "+q.getSize());
                    inform3.setText("Цвет: " +cp.getColorBut(9).getR()+", "+cp.getColorBut(9).getG()+", "+cp.getColorBut(9).getB());
                    fr.repaint();
                }
            }
        );
        this.add(jp);
        this.add(inform);
        this.add(inform2);
        this.add(inform3);
        this.add(clr0);
        this.add(clr1);
        this.add(clr2);
        this.add(clr3);
        this.add(clr4);
        this.add(clr5);
        this.add(clr6);
        this.add(clr7);
        this.add(clr8);
        this.add(clr9);
        this.add(bLine);
        this.add(bSimpLine);
        this.add(brect);
        this.add(boval);
        this.add(bpolygon);
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

