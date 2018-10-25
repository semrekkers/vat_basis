package Domain;

public class HexagonalPrism extends Shape {

    private double sideLength;
    private double height;

    public HexagonalPrism(double sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return 3 * Math.sqrt(3) * sideLength * sideLength * height / 2;
    }
}
