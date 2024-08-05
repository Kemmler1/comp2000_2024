import java.awt.Graphics;
import java.awt.Color;

public abstract class Actor {
    Color me;
    Cell cell;

    public void paint(Graphics g){
        
        g.setColor(me);
        g.fillRect(cell.x + 5, cell.y + 5, cell.width - 10, cell.height - 10);
        g.drawRect(cell.x + 5, cell.y + 5, cell.width - 10, cell.height - 10);
        
    }
}
