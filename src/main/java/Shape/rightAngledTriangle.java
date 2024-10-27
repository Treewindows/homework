package Shape;

public class rightAngledTriangle extends Shape {

    private Double catheterA;
    private Double catheterB;

    public rightAngledTriangle(Double catheterA, Double catheterB) {
        this.catheterA = catheterA;
        this.catheterB = catheterB;
    }
    /**
     * Функция вычисляет площадь прямоугольного теугольника
     *
     * @return площадь прямоугольного теугольника
     */
    @Override
    public String area() {
        Double resultArea = 0.5 * catheterA * catheterB;
        return "Площадь прямоугольного теугольника " + resultArea;
    }
}
