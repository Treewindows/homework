package Shape;

public class Rectangle extends Shape {

    private Double length;
    private Double width;

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String area() {
        Double resultArea = width * length;
        return "Площадь прямогульника " + resultArea;
    }
}
