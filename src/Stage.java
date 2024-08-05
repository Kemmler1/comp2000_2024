import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    Grid grid;
    Actor dogg;
    Actor birdd;
    Actor catt;
    public Stage(){
        grid = new Grid();
        dogg = new Dog(grid.cells[0][0]);
        birdd = new Bird(grid.cells[3][0]);
        catt = new Cat(grid.cells[11][0]);
    }
    void paint(Graphics g, Point p){
        grid.paint(g,p);
        dogg.paint(g);
        birdd.paint(g);
        catt.paint(g);
    }
}
