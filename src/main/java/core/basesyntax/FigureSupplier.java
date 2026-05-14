package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 15;
    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10,"white");
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                int side = random.nextInt(MAX_VALUE);
                return new Square(side, color);
            case 1:
                int height = random.nextInt(MAX_VALUE);
                int width = random.nextInt(MAX_VALUE);
                return new Rectangle(width, height, color);
            case 2:
                int firstLeg = random.nextInt(MAX_VALUE);
                int secondLeg = random.nextInt(MAX_VALUE);
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                int radius = random.nextInt(MAX_VALUE);
                return new Circle(radius, color);
            case 4:
                int baseA = random.nextInt(MAX_VALUE);
                int baseB = random.nextInt(MAX_VALUE);
                int heightC = random.nextInt(MAX_VALUE);
                return new IsoscelesTrapezoid(baseA, baseB, heightC, color);
            default: return getDefaultFigure();
        }
    }
}
