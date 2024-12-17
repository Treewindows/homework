package org.example.LessonVisitor;

public class Dot {
    private Double x;
    private Double y;

    public Dot(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double x() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double y() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
