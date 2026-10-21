import java.awt.*;

public class Ball {
    int x;
    int y;
    int radius;
    int deltaX;
    int deltaY;
    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.deltaX = 0;
        this.deltaY = 0;
    }
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, radius, radius);
    }
    public void move() {}
    public void die() {}
}
