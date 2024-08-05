import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
        Main window = new Main();

        window.run();
    }
    class Canvas extends JPanel {

        Stage stage = new Stage();
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }

        @Override
        public void paint(Graphics g){
            stage.paint(g, getMousePosition());
        }
    }

    private Main(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

   public void run(){
        while(true){
            this.repaint();
        }
   }
}