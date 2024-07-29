import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    class Canvas extends JPanel {
        public Canvas(){
            setAlignmentX(BOTTOM_ALIGNMENT);
            setPreferredSize(new Dimension(720,720));
        }

        @Override
        public void paint(Graphics g){
            //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = (int) this.getWidth() - 10;
            int screenHeight = (int) this.getHeight() - 10;
            
            int squareWidth = screenWidth/20;
            int squareHeight = screenHeight/20;

            for(int x = 10; x < screenWidth-10; x+=screenWidth/20){
                for(int y = 10; y < screenHeight-10; y+=screenHeight/20)
                    g.drawRect(x,y, squareWidth, squareHeight);
            }
        }
    }

    private Main(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}