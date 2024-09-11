package Shape;

public class Circle extends Shape {

    private Double Radius;

    public Circle(Double Radius) {
        this.Radius = Radius;
    }

    @Override
    public String area() {
        Double resultArea = 3.14 * (Radius * Radius);
        return "Площадь круга " + resultArea;
    }
}
