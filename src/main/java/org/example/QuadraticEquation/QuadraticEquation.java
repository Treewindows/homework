package org.example.QuadraticEquation;

public class QuadraticEquation {
    /**
     * Функция возвращает решения квадратного уравнения.
     * @param a - первый коэффициент.
     * @param b - второй коэффициент.
     * @param c - третий коэффициент.
     * @return - решение квадратного уравнения.
     */
    public static String QuadraticEquation(Double a,Double b,Double c){
        Double discriminant =(b*b)-4*a*c;
        if(discriminant>0){
            Double x1 = (-b-Math.sqrt(discriminant))/(2*a);
            Double x2 = (-b+Math.sqrt(discriminant))/(2*a);
            return String.format("%.2f,%.2f",x1,x2);
        }else if (discriminant == 0.0){
            Double x1 = (-b)/(2*a);
            return String.format("%.2f",x1);
        }
        return String.format("Корней нет");
    }
}
