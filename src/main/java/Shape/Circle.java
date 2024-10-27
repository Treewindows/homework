package Shape;

public class Circle extends Shape {

    private Double Radius;

    public Circle(Double Radius) {
        this.Radius = Radius;
    }
    /**
     * Функция вычисляет площадь круга
     *
     * @return площадь круга
     */
    @Override
    public String area() {
        Double resultArea = 3.14 * (Radius * Radius);
        return "Площадь круга " + resultArea;
    }
}
