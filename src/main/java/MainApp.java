import java.awt.*;
import java.util.Scanner;

public class MainApp {
    public static final Scanner keyboard = new Scanner(System.in);
    public static boolean running = true;

    public static void main(String[] args) {
        while (running) {
            display();
            userInput();
        }
    }

    public static void display() {
        System.out.println("===== Options =====");
        System.out.println("\t1) Add Shape");
        System.out.println("\t2) Save Shape");
        System.out.println("\t3) Exit");
        System.out.print("Please Enter one of the following options: ");
    }

    public static void userInput() {
        String selected = keyboard.nextLine();
        switch (selected) {
            case "1" -> addShapeDisplay();
            case "3" -> System.exit(0);
            default -> System.out.println("Invalid Character or number is not an options...\n please try again\n");

        }
    }

    public static void addShapeDisplay() {
        System.out.println("\n===== Adding Shape =====");
        System.out.println("\t1) Square");
        System.out.println("\t2) Triangle");
        System.out.print("Please Enter one numbers above: ");
        addShape();
    }

    public static void addShape() {
        String shape = keyboard.nextLine().trim();

        System.out.print("Please Enter the color of the shape (Just press enter): ");
        String color = keyboard.nextLine().trim();

        System.out.print("Please enter the boarder (width or radius): ");
        int width = keyboard.nextInt();
        keyboard.nextLine();

        int x = 0;
        int y = 0;
        System.out.println("\nDO NOT ENTER NEGATIVE NUMBERS");
        System.out.print("Please Enter the location of the shape (x,y): ");
        String location = keyboard.nextLine();
        String[] formattedLocation = location.split("[,]");
        x = Integer.parseInt(formattedLocation[0]);
        y = Integer.parseInt(formattedLocation[1]);

        System.out.print("Would you like you y to be negative (Y/n): ");
        String yChoice = keyboard.nextLine();

        if (yChoice.equalsIgnoreCase("Y")) {
            y *= -1;
        }

        System.out.print("Would you like x to be negative (Y/n): ");
        String xChoice = keyboard.nextLine().trim();

        if (xChoice.equalsIgnoreCase("Y")) {
            x *= -1;
        }

        draw(x, y, shape, color, width);
    }

    public static void draw(int x, int y, String shape, String typedColor, int width) {
        if (shape.equalsIgnoreCase("1")) {
            Square square = new Square(x, y, Color.red, width);
            square.paint();
        } else if (shape.equalsIgnoreCase("2")) {
            Triangle triangle = new Triangle(x, y, Color.red, width);
            triangle.paint();
        } else if (shape.equalsIgnoreCase("3")) {
            Circle circle = new Circle(x, y, Color.red, width);
            circle.paint();
        } else {
            System.out.println("Invalid shape entered");
        }
    }

    public static void drawX() {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);


        int width = 200;
        int height = 200;
        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);
    }
}
