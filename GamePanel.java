import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel{
    Ball ball;
    int level = 1; //use an if then statement to create the levels in ptcmpt cause i suck
    public GamePanel() {
        setSize(1200,400);
        setBackground(Color.BLUE);
    }
    public void paintComponent(Graphics g) {
        if(level == 1) {
            Floor floor = new Floor(0,700,1200,200);
            setBackground(Color.RED.brighter());
            ball = new Ball(100,100,20);
            ball.draw(g);
            floor.draw(g);
        }
    }

}
