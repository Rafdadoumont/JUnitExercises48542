package org.example;


public class Geometry {

    public Geometry(){}

    public int area(int length, int height) {
        return length * height;
    }

    public int perimeter(int length, int height) {
        return 2 * (length + height);
    }

    public boolean isTriangle(int a, int b, int c) {
        return a + b < c && a + c < b && b + c < a;
    }
}
