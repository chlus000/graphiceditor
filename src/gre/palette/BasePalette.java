
package gre.palette;

import gre.shapes.BaseShape;
import gre.shapes.SimpleLine;

public class BasePalette{
    int r;
    int g;
    int b;
    
    public BasePalette(int a, int g, int b){
        this.r = a;
        this.g = g;
        this.b = b;
    }
    
    public void putNewPalette(int a, int g, int b){
        this.r = a;
        this.g = g;
        this.b = b;
    }
    
    public int getR(){
        return r;
    }
    public int getG(){
        return g;
    }
    public int getB(){
        return b;
    }
    
     public BaseShape getColor(){
        return new SimpleLine();
    }
}
