import java.awt.*;

public class Circle extends Shape {
    protected Color color;
    protected int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y);
        this.radius = radius;
    }

    private void colorFormat(String color) {
        Color.getColor(color);
    }

    @Override
    public void paint() {
        Turtle turtle = new Turtle(new World(this.radius, this.radius), this.x, this.y);
        turtle.setColor(color.GREEN);
        int i = 0;
        while (i < 36) {
            turtle.forward((2 * Math.PI * radius) / 36);
            turtle.turnRight(10);
        }
    }
}
