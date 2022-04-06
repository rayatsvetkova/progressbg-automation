package com.homework9;

import com.company.Lecture11.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figures> figures = new ArrayList<>();
        figures.add(new Rectangle(5, 6));
        figures.add(new Circle(3));
        figures.add(new Rectangle(4, 7));

        System.out.println("Max area is: " + findMaxArea(figures));


    }

    public static Figures findMaxArea(Collection<Figures> figures) {
        double maxArea = 0;
        Figures figure = null;
        for (Figures oneFigure: figures) {
            if (figure == null) {
               figure = oneFigure;
            }
            if (maxArea < figure.getArea()) {
                maxArea = figure.getArea();
            }
        }
        return figure;
    }

}
