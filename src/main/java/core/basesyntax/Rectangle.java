package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, color: " + getColor());
        System.out.println("Figure: Rectangle; Width = " + width
                + "; Height = " + height
                + "; area: " + getArea() + " sq. units; color: " + getColor());
    }
}
