package Shape;

public class Square extends Shape {

    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public String area() {
        Double resultArea = side * side;
        return "Площадь квадрата " + resultArea;
    }


}
