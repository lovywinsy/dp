package edu.nwpu.rjwdz.bridge;

/**
 * Created by lovywinsy on 2/6/17.
 */
public class Triangle extends Shape {
    protected Triangle(IColor c) {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Triangle is colored with:");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + "times");
        border = border * increment;
        drawShape(border);
    }
}
