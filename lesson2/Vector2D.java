package gh.lesson2;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;
    public static int count = 0;

    public Vector2D() {
        this.vX = 1.0;
        this.vY = 1.0;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D vector) {
        this.vX = vector.vX;
        this.vY = vector.vY;
        count++;
    }

    public void print() {
        System.out.println(
                "(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void add(Vector2D vector) {
        this.vX += vector.vX;
        this.vY += vector.vY;
    }

    public void sub(Vector2D vector) {
        this.vX -= vector.vX;
        this.vY -= vector.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void dotProduct(Vector2D vector) {
        this.vX *= vector.vX;
        this.vY *= vector.vY;
    }

    public void normalized() {
        double length = Math.sqrt(vX * vX + vY * vY);
        if (length != 0) {
            vX /= length;
            vY /= length;
        }
    }

    public static void main(String[] args) {
        Vector2D vC = new Vector2D(7.5, 10.5);
        vC.normalized();
        System.out.println(vC.length());
    }
}
