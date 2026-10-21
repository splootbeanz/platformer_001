import java.awt.*;

//intention: create this, but like it's only rectangles...

public class Floor {
    int x, y, width, height;
    public Floor(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
    public void draw(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x,y,width,height);
    }
}
