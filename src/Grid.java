import javax.swing.*;
import java.awt.*;

public class Grid{
    public Grid(Graphics g, Point p){    
         
        Cell[][] cells = new Cell[20][20];

        for(int x = 0; x < cells.length; x++){
            for(int y = 0; y < cells.length; y++){
                cells[x][y] = new Cell(g, 10+(x*35), 10+(y*35), p);
            }        
        }
    }
}