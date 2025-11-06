import java.awt.*;

public class Triangle extends Shape {
    Color color;
    int width;
    public Triangle(int x, int y, Color color, int width) {
        super(x, y);
        this.width = width;
    }

    @Override
    public void paint() {
        Turtle turtle = new Turtle(new World(this.width, this.width), this.x, this.y);
        turtle.setColor(color.GREEN);
        int i = 0;
        while (i < 3) {
            turtle.forward();
            turtle.turnRight(120);
            i++;
        }
    }
}
