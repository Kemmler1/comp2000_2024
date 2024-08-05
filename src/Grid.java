import javax.swing.*;
import java.awt.*;

public class Grid{
    // fields
    Cell[][] cells = new Cell[20][20];

    public Grid(){
        for(int i = 0; i < cells.length; i++){
            for(int k = 0 ; k <cells[i].length; k++){
                cells[i][k] = new Cell(10+Cell.size*i, 10+Cell.size*k);
            }
        }
    }
    
    //methods
    public void paint(Graphics g, Point mousePos) {
        for(int i = 0; i < cells.length; i++){
            for(int k = 0; k < cells[i].length; k++){
                cells[i][k].paint(g, mousePos);
            }
        }
    }

    
}