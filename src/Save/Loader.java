package Save;


import gre.MyCanvas;
import gre.shapes.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Loader {
    public Loader(Queue q,MyCanvas jp) throws IOException {
        SaveShapeQueue shapes = new SaveShapeQueue();
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            try {
                shapes = (SaveShapeQueue) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            q.refresh();
            for (SaveShape saveShape : shapes.getShapes()) {
                q.changeColor(saveShape.getColor());
                if (saveShape.getType().equals("Oval")) {
                    q.addShape(new Oval());
                } else if (saveShape.getType().equals("Rectangle")) {
                    q.addShape(new Rect());
                } else if (saveShape.getType().equals("Polygon")) {
                    q.addShape(new Polygon());
                } else if (saveShape.getType().equals("Polyline")) {
                    q.addShape(new Line());    
                } else System.out.println("Error");
                if (saveShape.getPoints().size() != 0) {
                    q.getLastShape().setCoordinates(saveShape.getPoints());
                }
            }
            jp.paintToBuffer();
            jp.repaint();
        }
    }
}
