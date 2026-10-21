import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("platformer vers 1");
        frame.setLocation(100,100);
        frame.setSize(1200, 90);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GamePanel());
        frame.setVisible(true);
    }

}
    
