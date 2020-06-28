package Save;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class SaveShapeQueue implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<SaveShape> shapes;
    SaveShapeQueue(){
        shapes=new ArrayList<SaveShape>();
    }

    public void addShape(SaveShape shape) {
        shapes.add(shape);
    }

    public List<SaveShape> getShapes() {
        return shapes;
    }
}
