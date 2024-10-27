package Shape;

public class Parallelogram extends Shape {

    private Double side;
    private Double height;

    public Parallelogram(Double side, Double height) {
        this.side = side;
        this.height = height;
    }
    /**
     * Функция вычисляет площадь параллелограмма
     *
     * @return площадь параллелограмма
     */
    @Override
    public String area() {
        Double resultArea = side * height;
        return "Площаль параллелограмма " + resultArea;
    }

}
