
package gre.palette;

import java.util.ArrayList;

public class CollectPalette {
  ArrayList<BasePalette> collectColor = new ArrayList<>();

  public void addNewBut(BasePalette bp){
      collectColor.add(bp);
  }
  
  public BasePalette getColorBut(int i){
      return collectColor.get(i);
  }
}
