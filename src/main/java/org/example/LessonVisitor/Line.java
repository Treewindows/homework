package org.example.LessonVisitor;

import java.awt.geom.Arc2D;

public class Line {
    private Dot dotFirst;
    private Dot dotSecond;

    public Line(Dot dotFirst, Dot dotSecond) {
        this.dotFirst = dotFirst;
        this.dotSecond = dotSecond;
    }
    public Double lengthLine(){
        Double AB =Math.sqrt(((dotSecond.x()-dotFirst.x())*(dotSecond.x()-dotFirst.x()))+(((dotSecond.y()-dotFirst.y())*(dotSecond.y()-dotFirst.y()))));
        return AB;
    }

}
