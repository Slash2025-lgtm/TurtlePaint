import java.awt.*;

public class Square extends Shape {
    protected Color color;
    protected int width;

    public Square(int x, int y, Color color, int width) {
        super(x, y);
        this.width = width;
    }

    private void colorFormat(String color) {
        Color.getColor(color);
    }
    @Override
    public void paint() {
        Turtle turtle = new Turtle(new World(this.width, this.width), this.x, this.y);
        turtle.setColor(color.GREEN);
        int i = 0;
        while (i < 4) {
            turtle.forward();
            turtle.turnRight(90);
            i++;
        }
    }
}
